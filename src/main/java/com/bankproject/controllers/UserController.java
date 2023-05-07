package com.bankproject.controllers;

import com.bankproject.dtos.UserDto;
import com.bankproject.entities.User;
import com.bankproject.serviceImpls.UserImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserController {

    private final UserImpl userImpl;
    private final RestTemplate restTemplate;


    @PostMapping()
    public boolean checkUser(UserDto userDto) {
        userImpl.checkUser(userDto);
        try {
            URL url = new URL("91.102.161.166:5000/predict?data=user");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while ((inputLine = in.readLine()) != null) {
                content.append(inputLine);
            }
            System.out.println(in.read());
            in.close();
            in.readLine();
            if(in.readLine() == "1"){
                return true;
            }
            else{
                return false;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
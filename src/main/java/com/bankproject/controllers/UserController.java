package com.bankproject.controllers;

import com.bankproject.dtos.UserDto;
import com.bankproject.entities.User;
import com.bankproject.serviceImpls.UserImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class UserController {

    private final UserImpl userImpl;

    @PostMapping()
    public boolean checkUser(UserDto userDto){
        userImpl.checkUser(userDto);
        return true;
    }


}

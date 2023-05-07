package com.bankproject.serviceImpls;

import com.bankproject.dtos.UserDto;
import com.bankproject.entities.User;
import com.bankproject.mapper.UserMapper;
import com.bankproject.repositories.UserRepository;
import com.bankproject.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public boolean checkUser(UserDto userDto) {
       User user = userRepository.save(userMapper.userDtoToUser(userDto));


        return false;
    }
}

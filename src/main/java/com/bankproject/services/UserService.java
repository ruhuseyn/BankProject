package com.bankproject.services;

import com.bankproject.dtos.UserDto;

public interface UserService {

    boolean checkUser(UserDto userDto);
}

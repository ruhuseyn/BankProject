package com.bankproject.mapper;

import com.bankproject.dtos.UserDto;
import com.bankproject.entities.User;

public interface UserMapper {

    User userDtoToUser(UserDto userDto);
}

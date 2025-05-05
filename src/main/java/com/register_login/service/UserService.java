package com.register_login.service;

import com.register_login.dto.UserDto;
import com.register_login.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}

package com.blog.api.services;


import com.blog.api.payloads.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto user);

    UserDto updateUserByUserId(UserDto user, Long userId);

    UserDto getUserByUserId(Long userId);

    List<UserDto> getAllUsers();

    void deleteUserByUserId(Long userId);
}

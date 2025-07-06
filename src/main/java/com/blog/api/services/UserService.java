package com.blog.api.services;


import com.blog.api.payloads.UserDto;

import java.util.List;

public interface UserService {

    UserDto createUser(UserDto userDto);

    UserDto updateUserByUserId(UserDto userDto, Long userId);

    UserDto getUserByUserId(Long userId);

    List<UserDto> getAllUsers();

    void deleteUserByUserId(Long userId);
}

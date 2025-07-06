package com.blog.api.services.impl;

import com.blog.api.payloads.UserDto;
import com.blog.api.services.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public UserDto createUser(UserDto user) {
        return null;
    }

    @Override
    public UserDto updateUserByUserId(UserDto user, Long userId) {
        return null;
    }

    @Override
    public UserDto getUserByUserId(Long userId) {
        return null;
    }

    @Override
    public List<UserDto> getAllUsers() {
        return List.of();
    }

    @Override
    public void deleteUserByUserId(Long userId) {

    }
}

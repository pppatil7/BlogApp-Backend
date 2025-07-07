package com.blog.api.controllers;

import com.blog.api.payloads.UserDto;
import com.blog.api.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    //POST - CREATE USER
    @PostMapping("/")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto) {
        UserDto createdUserDto = userService.createUser(userDto);
        return new ResponseEntity<>(createdUserDto, HttpStatus.CREATED);
    }

    //PUT - UPDATE USER
    @PutMapping("/{userId}")
    public ResponseEntity<UserDto> updateUserByUserId(@RequestBody UserDto userDto, @PathVariable Long userId) {
        UserDto updatedUserDto = this.userService.updateUserByUserId(userDto, userId);
        return ResponseEntity.ok(updatedUserDto);
    }

    //DELETE - DELETE USER
    @DeleteMapping("/{userId}")
    public ResponseEntity<?> deleteUserByUserId(@PathVariable Long userId) {
        this.userService.deleteUserByUserId(userId);
        return ResponseEntity.noContent().build();
    }

    //GET - GET ALL USERS
    @GetMapping("/")
    public ResponseEntity<List<UserDto>> getAllUsers() {
        List<UserDto> users = this.userService.getAllUsers();
        return ResponseEntity.ok(users);
    }

    //GET - GET SINGLE USER
    @GetMapping("/{userId}")
    public ResponseEntity<UserDto> getUserByUserId(@PathVariable Long userId) {
        UserDto userDto = this.userService.getUserByUserId(userId);
        return ResponseEntity.ok(userDto);
    }

}

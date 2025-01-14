package com.example.userservice.controller;

import com.example.userservice.entity.User;
import com.example.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userService.registerUser(user);
    }


    @PostMapping("/login")
    public User loginUser(@RequestBody User user) {

        User existingUser = userService.getUserByEmail(user.getEmail());
        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return existingUser;
        } else {
            return null;
        }
    }
}

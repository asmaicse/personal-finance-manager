package com.finance.personalfinancemanager.controller;

import com.finance.personalfinancemanager.dto.RegisterUserRequest;
import com.finance.personalfinancemanager.entity.User;
import com.finance.personalfinancemanager.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/register")
    public User registerUser(@RequestBody RegisterUserRequest request) {
        return userService.registerUser(request);
    }
}
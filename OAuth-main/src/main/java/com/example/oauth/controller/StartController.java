package com.example.oauth.controller;

import com.example.oauth.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StartController {

    private final UserService userService;

    public StartController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String home(){
        return "Hello!";
    }

    @GetMapping("/secured")
    public String secured(){
        return userService.addUser();
    }
}

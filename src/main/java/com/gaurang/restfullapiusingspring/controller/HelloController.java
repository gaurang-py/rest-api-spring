package com.gaurang.restfullapiusingspring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String helloMessage(){
        return "Hello";
    }

    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {

        if (isValidUser(username, password)) {
            return "Login successful!";
        } else {
            return "Login failed!";
        }
    }
    private boolean isValidUser(String username, String password) {
        return "admin".equals(username) && "admin".equals(password);
    }
}



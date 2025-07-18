package com.example.springbootsecuritywithcsrf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingsController {

    @GetMapping("")
    public String greet(){
        return "Welcome to Spring Boot Security with CSRF Protection!";
    }
}

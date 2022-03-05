package com.example.springsecurity.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping
    public String welcomePage(){
        return "<h1>Welcome</h1>";
    }
}

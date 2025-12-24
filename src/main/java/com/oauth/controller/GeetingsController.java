package com.oauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeetingsController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
}

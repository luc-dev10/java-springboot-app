package com.lucio.springboot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("")
    public String getHome() {
        return "Hello World";
    }

    @GetMapping("users")
    public String getUsers() {
        return "hello";
    }
    
}

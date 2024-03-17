package com.springboot.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld(){
        return "HEllo World";
    }

    @GetMapping("/user")
    public UserDetails userBean(){
        return new UserDetails("Sagar", "Parida", "Bhubaneswar");
    }
}

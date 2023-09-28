package com.chatroom.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @PostMapping("/helloWorld")
    public String helloWorld(){
        return "hello World";
    }
}

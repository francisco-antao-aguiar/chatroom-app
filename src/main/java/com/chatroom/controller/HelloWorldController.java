package com.chatroom.controller;

import com.chatroom.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private HelloWorldService helloWorldService;

    @PostMapping("/helloWorld")
    public String helloWorld(@RequestBody int id){
        return helloWorldService.printHelloWorld(id);
    }
}

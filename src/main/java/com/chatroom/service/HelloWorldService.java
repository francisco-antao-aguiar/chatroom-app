package com.chatroom.service;


import com.chatroom.entity.Countries;
import com.chatroom.repository.HelloWorldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloWorldService {

    @Autowired
    private HelloWorldRepository helloWorldRepository;

    public String printHelloWorld(int id) {
        return helloWorldRepository.findById(id).orElse(new Countries(0, "Error")).getName();
    }
}

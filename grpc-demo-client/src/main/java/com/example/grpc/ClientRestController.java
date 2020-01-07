package com.example.grpc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ClientRestController {

    @Autowired
    private HelloWorldClient client;

    @GetMapping
    public ResponseEntity<?> test() {
        return new ResponseEntity<>(client.sayHello("Dharmendra", "Pandit"), HttpStatus.OK);
    }
}

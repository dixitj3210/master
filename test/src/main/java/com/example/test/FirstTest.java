package com.example.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstTest {

    @GetMapping("/first")
    public int first(){
        return 1;
    }
}

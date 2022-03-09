package com.dobda.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    
    @GetMapping("/test")
    public String test(){
        return "hello test232456g!234234555555";
    }
    //jenkins cicd test!!!
}

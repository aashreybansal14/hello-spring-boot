package com.example.basics;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot! You are great as you save a lot of time.";
    }
    @GetMapping("/simpleAddition")
    public String simpleAdd(){
        int a =10;
        int b = 16;
        int ans = a+b;
        return "The addition of->"+a+" and "+b +" is-> "+ans;
    }
}

package com.udemy.spring.config;

import org.springframework.stereotype.Component;

@Component
public class HelloServiceImpl implements HelloService {

    public String getMessage() {
        return "Hello to you!";
    }
}

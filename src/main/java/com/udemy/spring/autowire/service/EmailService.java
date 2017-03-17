package com.udemy.spring.autowire.service;

import org.springframework.stereotype.Component;

@Component
public class EmailService implements IMessageService {

    public String receiveMessage() {
        return "Message from email service!";
    }

}

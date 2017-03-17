package com.udemy.spring.autowire.service;

import org.springframework.stereotype.Component;

@Component
public class SmsService implements IMessageService {

    public String receiveMessage() {
        return "Message from sms service!";
    }

}

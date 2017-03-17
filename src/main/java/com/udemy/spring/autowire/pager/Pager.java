package com.udemy.spring.autowire.pager;


import com.udemy.spring.autowire.service.IMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pager implements IPager {

    private IMessageService service;

    private IMessageService secondService;

    @Autowired
    public Pager(IMessageService smsService) {
        this.service = smsService;
    }

    public void receive() {
        System.out.println("1st service:" + service.receiveMessage());
        System.out.println("2nd service:" + secondService.receiveMessage());
    }

    @Autowired
    @Qualifier(value = "emailService")
    public void setSecondService(IMessageService secondService) {
        this.secondService = secondService;
    }
}

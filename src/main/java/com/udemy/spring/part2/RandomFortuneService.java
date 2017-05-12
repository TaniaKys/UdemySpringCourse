package com.udemy.spring.part2;

import org.springframework.stereotype.Component;

//default component name is randomFortuneService
@Component
public class RandomFortuneService implements FortuneService {

    public String getFortune() {
       return "Today is your random day!";
    }
}


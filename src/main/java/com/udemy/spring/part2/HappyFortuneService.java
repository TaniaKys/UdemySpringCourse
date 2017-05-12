package com.udemy.spring.part2;

import org.springframework.stereotype.Component;


//default component name is happyFortuneService
@Component
public class HappyFortuneService implements FortuneService {

    public String getFortune() {
       return "Today is your lucky day!";
    }
}


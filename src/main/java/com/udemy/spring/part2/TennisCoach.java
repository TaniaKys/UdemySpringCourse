package com.udemy.spring.part2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println("default constructor");
    }

    //constructor injection
    /*
    @Autowired
    public TennisCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    */

    public String getDailyWorkout() {
        return "Practice your backhand volley!";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }


    //setter injection
    @Autowired
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("setter method");
        this.fortuneService = fortuneService;
    }
}

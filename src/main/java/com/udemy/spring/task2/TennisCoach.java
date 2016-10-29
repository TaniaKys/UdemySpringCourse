package com.udemy.spring.task2;

import com.udemy.spring.Coach;

public class TennisCoach implements Coach {

    private MyFortuneService myFortuneService;

    public TennisCoach(MyFortuneService myFortuneService) {
        this.myFortuneService = myFortuneService;
    }

    public String getDailyWorkout() {
        return "Practice for 24 minutes!";
    }

    public String getDailyFortune() {
        return myFortuneService.getFortune();
    }
}

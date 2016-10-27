package com.udemy.spring;

public class CricketCoach implements Coach {

    private FortuneService fortuneService;

    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
}

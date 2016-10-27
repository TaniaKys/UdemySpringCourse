package com.udemy.spring;

public abstract class CoachParent implements Coach{

    private FortuneService fortuneService;

    public CoachParent(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

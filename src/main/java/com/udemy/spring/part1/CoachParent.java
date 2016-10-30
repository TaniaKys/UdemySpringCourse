package com.udemy.spring.part1;

public abstract class CoachParent implements Coach{

    private FortuneService fortuneService;

    public CoachParent(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}

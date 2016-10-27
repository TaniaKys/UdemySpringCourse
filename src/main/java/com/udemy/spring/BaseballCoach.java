package com.udemy.spring;


public class BaseballCoach extends CoachParent {

    public BaseballCoach(FortuneService fortuneService) {
        super(fortuneService);
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}

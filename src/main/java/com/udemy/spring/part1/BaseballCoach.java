package com.udemy.spring.part1;


public class BaseballCoach extends CoachParent {

    public BaseballCoach(FortuneService fortuneService) {
        super(fortuneService);
    }

    public String getDailyWorkout() {
        return "Spend 30 minutes on batting practice";
    }
}

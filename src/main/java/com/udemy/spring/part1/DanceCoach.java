package com.udemy.spring.part1;


public class DanceCoach extends CoachParent {

    public DanceCoach(FortuneService fortuneService) {
        super(fortuneService);
    }

    public String getDailyWorkout() {
        return "Spend 50 minutes on stretching!";
    }
}

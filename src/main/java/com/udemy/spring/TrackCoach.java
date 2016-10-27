package com.udemy.spring;

public class TrackCoach extends CoachParent {

    public TrackCoach(FortuneService fortuneService) {
        super(fortuneService);
    }

    public String getDailyWorkout() {
        return "Run a hard 5k";
    }


}



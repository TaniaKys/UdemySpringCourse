package com.udemy.spring.part1;

public class TrackCoach extends CoachParent {

    public TrackCoach(FortuneService fortuneService) {
        super(fortuneService);
    }

    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    //add init method
    public void initMethod(){
        System.out.println("init");
    }

    //add destroy method
    public void destroyMethod(){
        System.out.println("destroy");
    }
}



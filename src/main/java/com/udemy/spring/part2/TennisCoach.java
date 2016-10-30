package com.udemy.spring.part2;

import org.springframework.stereotype.Component;

@Component("tennisCoach")
public class TennisCoach implements Coach {

    public String getDailyWorkout() {
        return "Practice your backhand volley!";
    }

}

package com.udemy.spring.part1.task3;

import com.udemy.spring.part1.Coach;

public class Task3Coach implements Coach {

    public String getDailyWorkout() {
        return null;
    }

    public String getDailyFortune() {
        return null;
    }

    public void initMethod(){
        System.out.println("INIT");
    }

    public void destroyMethod(){
        System.out.println("DESTROY");
    }
}

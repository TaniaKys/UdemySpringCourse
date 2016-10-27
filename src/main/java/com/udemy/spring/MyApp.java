package com.udemy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args){

        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        //retrieve bean from spring container
        Coach baseballCoach = context.getBean("baseballCoach", Coach.class);
        Coach trackCoach = context.getBean("trackCoach", Coach.class);
        Coach danceCoach = context.getBean("danceCoach", Coach.class);
        Coach cricketCoach = context.getBean("cricketCoach", Coach.class);

        //System.out.println(baseballCoach.getDailyWorkout());
        //System.out.println(trackCoach.getDailyWorkout());
        //System.out.println(danceCoach.getDailyWorkout());


        //System.out.println(danceCoach.getDailyFortune());
        System.out.println(cricketCoach.getDailyFortune());
        context.close();
    }
}

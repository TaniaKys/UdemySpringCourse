package com.udemy.spring.part2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args){
        //read spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("part2/appContext.xml");

        //get the bean from string container
        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        //call the method of the bean
        System.out.println(tennisCoach.getDailyWorkout());
        System.out.println(tennisCoach.getDailyFortune());

        //close context
        context.close();
    }

}

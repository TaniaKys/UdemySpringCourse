package com.udemy.spring.Task2;

import com.udemy.spring.Coach;
import com.udemy.spring.CricketCoach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task2 {

    public static void main(String[] args){

        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(tennisCoach.getDailyFortune());

        context.close();
    }

}

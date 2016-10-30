package com.udemy.spring.part1.task2;

import com.udemy.spring.part1.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task2 {

    public static void main(String[] args){

        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("part1/applicationContext.xml");

        Coach tennisCoach = context.getBean("tennisCoach", Coach.class);

        System.out.println(tennisCoach.getDailyFortune());

        context.close();
    }

}

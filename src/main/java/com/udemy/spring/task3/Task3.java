package com.udemy.spring.task3;

import com.udemy.spring.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Task3 {

    public static void main(String[] args){

        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("task3AppContext.xml");

        Coach myCoach1 = context.getBean("myCoach", Coach.class);
        Coach myCoach2 = context.getBean("myCoach", Coach.class);

        System.out.println(myCoach1);
        System.out.println(myCoach2);

        context.close();
    }

}

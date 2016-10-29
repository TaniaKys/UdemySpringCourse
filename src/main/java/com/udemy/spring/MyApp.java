package com.udemy.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args){

        //Load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCicleAppContext.xml");

        //retrieve bean from spring container
        Coach trackCoach = context.getBean("trackCoach", Coach.class);

        context.close();
    }
}

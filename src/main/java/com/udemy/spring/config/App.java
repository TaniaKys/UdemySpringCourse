package com.udemy.spring.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(DependencyConfig.class);
        User user = context.getBean("tania", User.class);
        user.sayHello();
    }
}

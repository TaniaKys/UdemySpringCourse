package com.udemy.spring.autowire;

import com.udemy.spring.autowire.context.AppContext;
import com.udemy.spring.autowire.pager.IPager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App  {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);

        IPager pager = context.getBean("pager", IPager.class);

        pager.receive();

    }

}

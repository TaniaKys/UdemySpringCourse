package com.udemy.spring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DependencyConfig {

    @Bean
    @Autowired
    //method parameter will be autowired
    public User tania(HelloService helloService){
        UserImpl user = new UserImpl("tania", helloService);
        return user;
    }


}

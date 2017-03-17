package com.udemy.spring.config;

/**
 * Created by Tanya on 17.03.2017.
 */
public class UserImpl implements User {

    private String name = "no name";

    private HelloService service;

    public UserImpl(String name, HelloService service) {
        this.name = name;
        this.service = service;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println(service.getMessage()+""+name);
    }
}

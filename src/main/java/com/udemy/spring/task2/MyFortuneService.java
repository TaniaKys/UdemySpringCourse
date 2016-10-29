package com.udemy.spring.task2;

import com.udemy.spring.FortuneService;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MyFortuneService implements FortuneService {

    List<String> phrases;

    public MyFortuneService() {
        phrases = new ArrayList();
        phrases.add("Go ahead!");
        phrases.add("You can do it!");
        phrases.add("Lets do it, bro!");
    }

    public String getFortune() {
        Random random = new Random();
        return phrases.get(random.nextInt(3));
    }

}

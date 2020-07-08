package com.example.firstapplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Autowired
    laptop lap;

    public void code(){
//        System.out.println("Let's code.....");
        lap.run();
    }
}

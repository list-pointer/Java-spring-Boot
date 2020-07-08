package com.example.firstapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.applet.AppletContext;

@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) {

//        SpringApplication.run(FirstApplication.class, args);
        ApplicationContext context=SpringApplication.run(FirstApplication.class,args);
        Alien obj=context.getBean(Alien.class);
        obj.code();
    }

}

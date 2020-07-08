package com.example.firstapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.applet.AppletContext;

@SpringBootApplication
public class FirstApplication {

    public static void main(String[] args) {

//        SpringApplication.run(FirstApplication.class, args);
//        ApplicationContext context=SpringApplication.run(FirstApplication.class,args);
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//      type conversion to alien type
        Alien obj=(Alien)context.getBean("alien");
        obj.time=1;
        System.out.println(obj.time);
        obj.code();
//        in this case both the objects are pointing to a single object
//        for eg: time for 2nd object is not initialized  still it shows value as 1
//        this is called singleTon classes

//        this is prototype(multiple objects)
        //      type conversion not needed alien class specified
        Alien obj1=context.getBean(Alien.class);
//        obj.time=1;
        System.out.println(obj1.time);
        obj.code();
    }

}

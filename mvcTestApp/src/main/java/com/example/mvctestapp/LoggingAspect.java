package com.example.mvctestapp;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before(value = "execution(public * com.example.mvctestapp.HomeController.getAliens())")
    public void log()
    {
        System.out.println("Calling get Aliens");
    }
}

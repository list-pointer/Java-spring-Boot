package com.example.mvctestapp;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger((LoggingAspect.class));
    @Before(value = "execution(public * com.example.mvctestapp.HomeController.getAliens())")
    public void log()
    {
//        System.out.println("Calling get Aliens");
        logger.trace("Logger Called");
    }
}

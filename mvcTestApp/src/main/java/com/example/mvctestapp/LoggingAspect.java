package com.example.mvctestapp;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    private static final Logger logger = LoggerFactory.getLogger((LoggingAspect.class));

    @Before(value = "execution(public * com.example.mvctestapp.HomeController.getAliens())")
    public void logBefore() {
//        System.out.println("Calling get Aliens");
        logger.trace("Logger Called(Before)");
    }

//    //This method is executed even after the function is not executed its like finally
//    @After(value = "execution(public * com.example.mvctestapp.HomeController.getAliens())")
//    public void logAfter() {
////        System.out.println("Calling get Aliens");
//        logger.trace("Logger Called(After) ");
//    }

    //Will run after successful execution
    @AfterReturning(value = "execution(public * com.example.mvctestapp.HomeController.getAliens())")
    public void logAfter() {
//        System.out.println("Calling get Aliens");
        logger.trace("Logger Called(AfterReturning)");
    }

    //Will run if exception occurred
    @AfterThrowing(value = "execution(public * com.example.mvctestapp.HomeController.getAliens())")
    public void logException() {
//        System.out.println("Calling get Aliens");
        logger.trace("Logger Called(AfterReturning)");
    }
}

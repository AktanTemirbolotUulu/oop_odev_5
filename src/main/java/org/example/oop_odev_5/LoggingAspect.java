package org.example.oop_odev_5;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* org.example.oop_odev_5.MyService.login(..))")
    public void beforeLogin() {
        System.out.println("[BEFORE] About to call login");
    }

    @After("execution(* org.example.oop_odev_5.MyService.login(..))")
    public void afterLogin() {
        System.out.println("[AFTER] login method executed");
    }
    @Around("execution(* org.example.oop_odev_5.MyService.calculateSum(..))")
    public Object aroundCalculateSum(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("[AROUND] Before ");

        long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long endTime = System.currentTimeMillis();

        System.out.println("[AROUND] After");
        System.out.println("Execution time: " + (endTime - startTime) + "ms");

        return result;
    }

    @Before("execution(* org.example.oop_odev_5.MyService.printMessage(..))")
    public void beforePrintMessage() {
        System.out.println("[BEFORE] About ");
    }

    @After("execution(* org.example.oop_odev_5.MyService.printMessage(..))")
    public void afterPrintMessage() {
        System.out.println("[AFTER]  method executed");
    }
}

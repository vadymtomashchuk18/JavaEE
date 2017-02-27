package com.tomashchuk.all;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Вадим on 23.02.2017.
 */

@Aspect
public class DateAspect {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Around("execution(* com.tomashchuk.main.com.tomashchuk.all.DateService.*(..))")
    public Object advice(ProceedingJoinPoint pjp) throws Throwable {
        String serviceDate = (String) pjp.proceed();
        return message + " and " + serviceDate;
    }
}
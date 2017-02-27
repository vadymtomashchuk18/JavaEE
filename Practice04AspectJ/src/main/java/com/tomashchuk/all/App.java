package com.tomashchuk.all;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Вадим on 27.02.2017.
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("test-aspectj.xml");
        DateService dtsrv = (DateService) context.getBean("message");
        System.out.print(dtsrv);
    }
    }

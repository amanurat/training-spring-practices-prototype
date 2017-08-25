package com.training;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class HelloApp {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        Hello hello = context.getBean(Hello.class);
        System.out.println(hello.getName());

        FileSystemXmlApplicationContext fileSystemXmlApplicationContext =
                new FileSystemXmlApplicationContext("//Users/amanurat/Traning/Courses/Spring-Practices/training-spring-practices/01-why-spring/02-with-spring-di/src/main/resources/spring-config.xml");

        Hello hello2 = fileSystemXmlApplicationContext.getBean(Hello.class);
        System.out.println(hello2.getName());

    }

}

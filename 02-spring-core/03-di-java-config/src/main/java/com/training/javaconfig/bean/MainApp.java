package com.training.javaconfig.bean;

import com.training.javaconfig.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Human human1 = context.getBean(Human.class);
        Human human2 = context.getBean(Human.class);
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human1 == human2);

        System.out.println("=========================");
        Animal animal1 = context.getBean(Animal.class);
        Animal animal2 = context.getBean(Animal.class);
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal1 == animal2);

    }
}

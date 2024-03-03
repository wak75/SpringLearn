package com.spring.removexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TheMain {
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(Configurations.class);

        Student student1 = (Student) context.getBean("king");
        System.out.println(student1.name());
    }
}

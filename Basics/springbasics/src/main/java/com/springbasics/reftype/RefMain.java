package com.springbasics.reftype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springbasics/reftype/refConfig.xml");


        ClassA objA = (ClassA) context.getBean("classARef");
        System.out.println(objA);

        System.out.println(objA.getObjectB().getData());
        System.out.println(objA.getObjectC().getName());
    }
}

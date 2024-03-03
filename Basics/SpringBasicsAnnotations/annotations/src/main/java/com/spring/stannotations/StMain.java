package com.spring.stannotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class StMain {
    public static void main(String[] args) { 
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/stannotations/stConfig.xml");
        Student student1 = (Student) context.getBean("king");

        System.out.println(student1);
        System.out.println(student1.hashCode());
        System.out.println(student1.getPhoneNumbers());
        System.out.println(student1.getPhoneNumbers().getClass().getName());

        System.out.println("-----------------------------------------------------------------");

        Student student2 = (Student) context.getBean("king");
        System.out.println(student2.hashCode());
    
        System.out.println("-----------------------------------------------------------------");

        //JUST FOR T6HE UNDERSTANDING OF SPRING SPEL
        SpelExpressionParser spel = new SpelExpressionParser();
        org.springframework.expression.Expression exp = spel.parseExpression("44+99");
        try {
            System.out.println(exp.getValue());
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println("-----------------------------------------------------------------");

        SpelAll spelAll = (SpelAll) context.getBean("spelAll");
        System.out.println(spelAll);
    }
}

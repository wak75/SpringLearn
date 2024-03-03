package com.springbasics;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        Student myStudent1 = (Student) context.getBean("student1");
        Student myStudent2 = (Student) context.getBean("student2");
        Student myStudent3 = (Student) context.getBean("student3");

        System.out.println(myStudent1);
        System.out.println(myStudent2);
        System.out.println(myStudent3);

    }
}

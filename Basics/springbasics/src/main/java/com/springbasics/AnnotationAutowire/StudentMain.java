package com.springbasics.AnnotationAutowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

    public static void main(String[] args) {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/springbasics/AnnotationAutowire/StudentConfig.xml");
    
        Student student = (Student) context.getBean("student"); 
        System.out.println(student);    
    }
}

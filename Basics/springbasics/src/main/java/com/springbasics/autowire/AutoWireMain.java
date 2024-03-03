package com.springbasics.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springbasics/autowire/autowireConfig.xml");
        
        Employee myEmployee1 = (Employee) context.getBean("employee1");
    
        System.out.println(myEmployee1);

    }   

}

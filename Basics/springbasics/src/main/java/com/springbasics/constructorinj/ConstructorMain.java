package com.springbasics.constructorinj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springbasics/constructorinj/ciConf.xml");

        Person person1 = (Person) context.getBean("Person1");
        Person person2 = (Person) context.getBean("Person2");   

        System.out.println(person1.name + "cars" + person1.allCars);
        System.out.println(person2.name + "cars" + person2.allCars); 
        
    }
}

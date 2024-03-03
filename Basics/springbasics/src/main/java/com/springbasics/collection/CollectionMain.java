package com.springbasics.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springbasics/collection/collectionConfig.xml");
    

    Employee myEmployee1 = (Employee) context.getBean("empDetail1");

    Employee myEmployee2 = (Employee) context.getBean("empDetail2");

    System.out.println(myEmployee1);
    System.out.println(myEmployee2);

    }

}

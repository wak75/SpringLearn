package com.springbasics.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class WashimMain {
    public static void main(String[] args) {
        //In simple Application Context, there is no shutdownHook, that why we called the abstractApplicationcontext method
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/springbasics/lifecycle/washimConf.xml");
    
        Washim washimObj = (Washim) context.getBean("WashimObj");
        System.out.println(washimObj);
    
        context.registerShutdownHook(); 


        System.out.println("-----------------------------------------------------------");

        King interfaceKing = (King) context.getBean("King");
        System.out.println(interfaceKing);


        System.out.println("-----------------------------------------------------------");

        AnnotationsWala annotationWala = (AnnotationsWala) context.getBean("AN");
        System.out.println(annotationWala);
    
    }
}
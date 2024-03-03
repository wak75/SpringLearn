package com.springbasics.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationsWala {
    public String Subject;

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public AnnotationsWala(String subject) {
        Subject = subject;
    }

    public AnnotationsWala() {
        super();
    }

    @Override
    public String toString() {
        return "AnnotationsWala [Subject=" + Subject + "]";
    }

    @PostConstruct
    public void Init(){
        System.out.println("this is the init method invoked by using annotatinos");
    }


    @PreDestroy
    public void Destroy(){
        System.out.println("this is the destroy method invoked by using annotatinos");
    }

    
    
}

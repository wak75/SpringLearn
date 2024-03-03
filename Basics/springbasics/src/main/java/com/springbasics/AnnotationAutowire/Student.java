package com.springbasics.AnnotationAutowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
    
    private String name;
    private int age;
    
    @Autowired
    @Qualifier("marks1")
    Marks marks;

    
    public Student(String name, int age, Marks marks) {
        this.name = name;
        this.age = age;
        this.marks = marks; 
    }
    
    public Student() {
        super();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Marks getMarks() {
        return marks;
    }
    public void setMarks(Marks marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", marks=" + marks + "]";
    }

    
    
}

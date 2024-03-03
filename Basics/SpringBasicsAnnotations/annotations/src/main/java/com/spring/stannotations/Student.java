package com.spring.stannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("king")
@Scope("prototype")
public class Student {
    @Value("Washim")
    private String name;
    @Value("24")
    private int rollno;
    @Value("CSE M.Tech")
    private String branch;
    @Autowired
    private Marks marks;

    @Value("#{tempData}")
    private List<String> phoneNumbers;
    
    public Student(String name, int rollno, String branch, Marks marks, List<String> phoneNumbers) {
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
        this.marks = marks;
        this.phoneNumbers = phoneNumbers;
    }

    
    public Student() {
        super();
    }

    
    
    

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollno=" + rollno + ", branch=" + branch + ", marks=" + marks
                + ", phoneNumbers=" + phoneNumbers + "]";
    }


    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getBranch() {
        return branch;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public Marks getMarks() {
        return marks;
    }
    public void setMarks(Marks marks) {
        this.marks = marks;
    }


    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }


    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    } 

    
}

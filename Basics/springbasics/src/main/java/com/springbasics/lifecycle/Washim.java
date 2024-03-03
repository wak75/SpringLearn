package com.springbasics.lifecycle;

public class Washim {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("setting age, this is the first stage of the lifecycle");
        System.out.println();
        this.age = age;
    }

    public Washim() {
        super();
    }

    public Washim(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Washim [age=" + age + "]";
    }

    
    public void init(){
        System.out.println("this is been called from the init method");
        System.out.println("this is the second stage of the lifecycle");
        System.out.println();
    }

    public void destroy(){
        System.out.println("this is been called from the destroy method");
        System.out.println("this is the last stage of the lifecycle");
        System.out.println("this will be called when the registerShutdownHook is been called");
        System.out.println();
    }
}

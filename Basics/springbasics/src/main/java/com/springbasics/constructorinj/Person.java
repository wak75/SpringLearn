package com.springbasics.constructorinj;

import java.util.List;

public class Person {
     String name;
     String gender;
     int age;
     List<String> phones;
     Cars allCars;


    public Person(String name, String gender, int age, List<String> phones, Cars allCars) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.phones = phones;
        this.allCars = allCars;
    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", gender=" + gender + ", age=" + age + ", phones=" + phones + ", allCars="
                + allCars + "]";
    }
    
    
}

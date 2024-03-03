package com.springbasics.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class King implements InitializingBean, DisposableBean{
    //here I will show the lifecycle process but by using the interfaces

    public double Salary;

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public King(double salary) {
        Salary = salary;
    }

    public King() {
        super();
    }

    @Override
    public String toString() {
        return "King [Salary=" + Salary + "]";
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        // TODO Auto-generated method stub
        System.out.println("this is been called from the afterPropertiesSet method");
        System.out.println("For this to run we have to first implement the InitializingBean interface");
        System.out.println("The afterpropertiesSet method is an unimplemented method which we have to initilize by the code. This is basically the Init() method");
    }
    
    @Override
    public void destroy() throws Exception {
        System.out.println("This is the destroy function which is been provided by the DisposableBean interface");
        System.out.println("This is the last stage of the lifecycle");
    }



    
}

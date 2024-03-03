package com.spring.stannotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("spelAll")
public class SpelAll {

    @Value("#{T(java.lang.Math).sqrt(25)}")
    private double x;

    @Value("#{T(java.lang.Math).PI}")
    private double y;

    
    public SpelAll(double x, double y) {
        this.x = x;
        this.y = y;
    }

        

    @Override
    public String toString() {
        return "SpelAll [x=" + x + ", y=" + y + "]";
    }



    public SpelAll() {
        super();
    }


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }  
   

}

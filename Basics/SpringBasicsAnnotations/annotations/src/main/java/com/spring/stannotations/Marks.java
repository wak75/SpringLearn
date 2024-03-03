package com.spring.stannotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("markswa")
public class Marks {

    @Value("91")
    private int maths;
    @Value("100")
    private int science;
    @Value("98")
    private int english;
    
    public Marks(int maths, int science, int english) {
        this.maths = maths;
        this.science = science;
        this.english = english;
    }
    
    public Marks() {
        super();
    }

    @Override
    public String toString() {
        return "Marks [maths=" + maths + ", science=" + science + ", english=" + english + "]";
    }


    public int getMaths() {
        return maths;
    }
    public void setMaths(int maths) {
        this.maths = maths;
    }
    public int getScience() {
        return science;
    }
    public void setScience(int science) {
        this.science = science;
    }
    public int getEnglish() {
        return english;
    }
    public void setEnglish(int english) {
        this.english = english;
    }

    
}

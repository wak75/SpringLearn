package com.springbasics.reftype;

public class ClassC {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ClassC(String name) {
        this.name = name;
    }

    public ClassC() {
        super();
    }

    @Override
    public String toString() {
        return "ClassC [name=" + name + "]";
    }

    
}

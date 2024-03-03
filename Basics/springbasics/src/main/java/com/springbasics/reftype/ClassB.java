package com.springbasics.reftype;

public class ClassB {

    private int data;

    public ClassB(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ClassB [data=" + data + "]";
    }

    public ClassB() {
        super();
    }

    
    
}

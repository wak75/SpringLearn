package com.springbasics.reftype;

public class ClassA {
    private String name;
    private ClassB objectB;
    private ClassC objectC;

    public ClassC getObjectC() {
        return objectC;
    }
    public void setObjectC(ClassC objectC) {
        this.objectC = objectC;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ClassB getObjectB() {
        return objectB;
    }
    public void setObjectB(ClassB objectB) {
        this.objectB = objectB;
    }
    public ClassA() {
        super();
    }
    @Override
    public String toString() {
        return "ClassA [name=" + name + ", objectB=" + objectB + ", objectC=" + objectC + "]";
    }

    

    

}

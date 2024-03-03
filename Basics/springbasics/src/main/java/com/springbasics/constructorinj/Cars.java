package com.springbasics.constructorinj;

import java.util.List;

public class Cars {
    List<String> carNames;

    public Cars(List<String> carNames) {
        this.carNames = carNames;
    }

    @Override
    public String toString() {
        return "Cars [carNames=" + carNames + "]";
    }

    
}

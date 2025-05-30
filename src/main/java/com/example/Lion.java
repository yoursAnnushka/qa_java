package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private FelineInterface felineInterface;

    public Lion(String sex, FelineInterface felineInterface) throws Exception {
        this.felineInterface = felineInterface;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самец или самка");
        }
    }

    public int getKittens() {
        return felineInterface.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return felineInterface.getFood();
    }
}

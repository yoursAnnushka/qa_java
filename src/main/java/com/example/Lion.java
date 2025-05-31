package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    private FelineInterface felineInterface;
    public static final String LION_SEX_EXCEPTION_TEXT = "Используйте допустимые значения пола животного - самец или самка";

    public Lion(String sex, FelineInterface felineInterface) throws Exception {
        this.felineInterface = felineInterface;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception(LION_SEX_EXCEPTION_TEXT);
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

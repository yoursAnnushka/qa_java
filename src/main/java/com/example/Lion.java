package com.example;

import java.util.List;

public class Lion {

    boolean hasMane;
    Feline feline;
    public static final String LION_SEX_EXCEPTION_TEXT = "Используйте допустимые значения пола животного - самец или самка";

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception(LION_SEX_EXCEPTION_TEXT);
        }
    }

    public int getKittens() {
        return feline.getKittens();
    }

    public boolean doesHaveMane() {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }
}

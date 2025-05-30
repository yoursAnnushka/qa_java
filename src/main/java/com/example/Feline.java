package com.example;

import java.util.List;

import static com.example.constants.AnimalSpecies.PREDATOR_SPECIES;

public class Feline extends Animal implements Predator, FelineInterface {

    @Override
    public List<String> eatMeat() throws Exception {
        return getFood("Хищник");
    }

    @Override
    public String getFamily() {
        return "Кошачьи";
    }

    @Override
    public int getKittens() {
        return getKittens(1);
    }

    public int getKittens(int kittensCount) {
        return kittensCount;
    }

    @Override
    public List<String> getFood() {
        return PREDATOR_SPECIES;
    }
}

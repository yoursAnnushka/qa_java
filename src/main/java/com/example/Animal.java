package com.example;

import java.util.List;

import static com.example.constants.AnimalSpecies.HERBIVORE_SPECIES;
import static com.example.constants.AnimalSpecies.PREDATOR_SPECIES;

public class Animal {

    public List<String> getFood(String animalKind) throws Exception {
        if ("Травоядное".equals(animalKind)) {
            return HERBIVORE_SPECIES;
        } else if ("Хищник".equals(animalKind)) {
            return PREDATOR_SPECIES;
        } else {
            throw new Exception("Неизвестный вид животного, используйте значение Травоядное или Хищник");
        }
    }

    public String getFamily() {
        return "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";
    }
}
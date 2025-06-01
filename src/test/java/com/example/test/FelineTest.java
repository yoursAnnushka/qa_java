package com.example.test;

import com.example.Feline;
import org.junit.Test;

import static com.example.constants.AnimalSpecies.PREDATOR_SPECIES;
import static org.junit.Assert.assertEquals;

public class FelineTest {
    private int kittensCount = 5;
    Feline feline = new Feline();


    @Test
    public void eatMeatReturnListOfPredatorFoodTest() throws Exception {
        // eatMeat использует getFood("Хищник"), который возвращает PREDATOR_SPECIES
        assertEquals(PREDATOR_SPECIES, feline.eatMeat());
    }

    @Test
    public void getFamilyReturnFelineTest() {
        assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void getKittensWithoutKittensCountReturnOneKittensCountTest() {
        // getKittens() использует getKittens(int kittensCount), где kittensCount = 1
        assertEquals(1, feline.getKittens());
    }

    @Test
    public void getKittensWithKittensCountReturnKittensCountTest() {
        assertEquals(kittensCount, feline.getKittens(kittensCount));
    }

    @Test
    public void getFoodReturnListOfPredatorFoodTest() throws Exception {
        assertEquals(PREDATOR_SPECIES, feline.getFood("Хищник"));
    }
}
package com.example.test;

import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.constants.AnimalSpecies.PREDATOR_SPECIES;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    private int kittensCount = 5;

    @Spy
    Feline feline;

    @Test
    public void eatMeatReturnListOfPredatorFood() throws Exception {
        // eatMeat использует getFood("Хищник"), который возвращает PREDATOR_SPECIES
        assertEquals(PREDATOR_SPECIES, feline.eatMeat());
        verify(feline).getFood("Хищник"); // проверяем, что getFood() был вызван шпионом feline с параметром "Хищник"
    }

    @Test
    public void getFamilyReturnFeline() {
        assertEquals("Кошачьи", feline.getFamily());
        verify(feline).getFamily(); // проверяем, что getFamily() был вызван шпионом feline
    }

    @Test
    public void getKittensWithoutKittensCountReturnOneKittensCount() {
        // getKittens() использует getKittens(int kittensCount), где kittensCount = 1
        assertEquals(1, feline.getKittens());
        verify(feline).getKittens(1); // проверяем, что getKittens(int kittensCount) был вызван шпионом feline с параметром 1
    }

    @Test
    public void getKittensWithKittensCountReturnKittensCount() {
        assertEquals(kittensCount, feline.getKittens(kittensCount));
        verify(feline).getKittens(kittensCount); // проверяем, что getKittens() был вызван шпионом feline с параметром kittensCount
    }

    @Test
    public void getFoodReturnListOfPredatorFood() {
        assertEquals(PREDATOR_SPECIES, feline.getFood());
        verify(feline).getFood(); // проверяем, что getFood() был вызван шпионом feline
    }
}
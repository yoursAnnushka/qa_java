package com.example.test;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Lion.LION_SEX_EXCEPTION_TEXT;

import static com.example.constants.AnimalSpecies.PREDATOR_SPECIES;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        lion.getKittens();
        verify(feline).getKittens(); // проверяем, что getKittens() был вызван на моке feline
    }

    @Test
    public void getFoodReturnListOfLionFoodTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        when(feline.getFood("Хищник")).thenReturn(PREDATOR_SPECIES);
        assertEquals(PREDATOR_SPECIES, lion.getFood());
    }

    @Test
    public void doesHaveManeExceptionTextTest () {
        Throwable throwable = catchThrowable(() -> {
            Lion lion = new Lion("Львенок", feline);
        });
        assertThat(throwable).isInstanceOf(Exception.class).hasMessage(LION_SEX_EXCEPTION_TEXT);
    }
}
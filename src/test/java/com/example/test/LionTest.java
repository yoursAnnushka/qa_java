package com.example.test;

import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static com.example.Lion.LION_SEX_EXCEPTION_TEXT;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.catchThrowable;
import static org.mockito.Mockito.verify;

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
        lion.getFood();
        verify(feline).getFood("Хищник"); // проверяем, что getFood() был вызван на моке feline с параметром "Хищник"
    }

    @Test
    public void doesHaveManeExceptionTextTest () {
        Throwable throwable = catchThrowable(() -> {
            Lion lion = new Lion("Львенок", feline);
        });
        assertThat(throwable).isInstanceOf(Exception.class).hasMessage(LION_SEX_EXCEPTION_TEXT);
    }
}
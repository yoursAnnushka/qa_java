package com.example.test;

import com.example.FelineInterface;
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
    FelineInterface felineInterface;

    @Test
    public void getKittensTest() throws Exception {
        Lion lion = new Lion("Самец", felineInterface);
        lion.getKittens();
        verify(felineInterface).getKittens(); // проверяем, что getKittens() был вызван на моке felineInterface
    }

    @Test
    public void getFoodReturnListOfLionFood() throws Exception {
        Lion lion = new Lion("Самка", felineInterface);
        lion.getFood();
        verify(felineInterface).getFood(); // проверяем, что getFood() был вызван на моке felineInterface
    }

    @Test
    public void doesHaveManeExceptionTextTest () {
        Throwable throwable = catchThrowable(() -> {
            Lion lion = new Lion("Львенок", felineInterface);
        });
        assertThat(throwable).isInstanceOf(Exception.class).hasMessage(LION_SEX_EXCEPTION_TEXT);
    }
}
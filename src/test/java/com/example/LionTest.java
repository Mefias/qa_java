package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @org.junit.Test
    public void getKittensReturnsTheSameAsParentForFeline() throws Exception {
        int expected = 9;
        Mockito.when(feline.getKittens()).thenReturn(expected);
        Lion lion = new Lion(feline, "Самец");
        assertEquals(expected, lion.getKittens());
    }

    @Test (expected = Exception.class)
    public void doesHaveManeExceptionAtCreationIfSexUnrecognized() throws Exception {
        Lion lion = new Lion(feline, "---");
    }

    @Test
    public void getFoodReturnsTheSameAsParentForPredator() throws Exception {
        List<String> foodStub = Collections.singletonList("someFood");
        Mockito.when(feline.getFood("Хищник")).thenReturn(foodStub);
        Lion lion = new Lion(feline, "Самец");
        assertEquals(foodStub, lion.getFood());
    }
}
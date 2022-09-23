package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collection;
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

    @org.junit.Test
    public void doesHaveManeHaveIfMale() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        boolean expected = true;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void doesHaveManeHaventIfFemale() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        boolean expected = false;
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
    @org.junit.Test
    public void doesHaveManeExceptionAtCreationIfSexUnrecognized() {
        try {
            Lion lion = new Lion(feline, "---");
            assertFalse("Должно вызывать исключение", true) ;
        } catch (Exception e) {
            assertTrue(true) ;
        }
    }

    @org.junit.Test
    public void getFoodReturnsTheSameAsParentForPredator() throws Exception {
        List<String> foodStub = Collections.singletonList("someFood");
        Mockito.when(feline.getFood("Хищник")).thenReturn(foodStub);
        Lion lion = new Lion(feline, "Самец");
        assertEquals(foodStub, lion.getFood());
    }
}
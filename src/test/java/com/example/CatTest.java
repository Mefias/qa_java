package com.example;

import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @org.junit.Test
    public void getSoundReturnsMyau() {
        String expected = "Мяу";
        Cat cat = new Cat(feline);
        assertEquals(expected, cat.getSound());
    }
    @org.junit.Test
    public void getFoodReturnsTheSameAsParentMeat() throws Exception {
        List<String> foodStub = Collections.singletonList("someFood");
        Mockito.when(feline.eatMeat()).thenReturn(foodStub);
        Cat cat = new Cat(feline);
        assertEquals(foodStub, cat.getFood());
    }
}
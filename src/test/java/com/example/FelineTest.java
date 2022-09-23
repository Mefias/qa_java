package com.example;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FelineTest {
    Feline feline;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();
    }

    @Test
    public void eatMeatReturnsNonEmptyList() {
        try {
            List<String> meat = feline.eatMeat();
            int unexpected = 0;
            int actual = meat.size();
            assertNotEquals(unexpected, actual);
        } catch (Exception e) {
            assertFalse("Должно возвращать список", true) ;
        }
    }

    @Test
    public void getFamilyReturnsFeline() {
        String expected = "Кошачьи";
        String actual = feline.getFamily();
        assertEquals(expected, actual);
    }

    @Test
    public void getKittensReturnsOne() {
        int expected = 1;
        int actual = feline.getKittens();
        assertEquals(expected, actual);
    }
}
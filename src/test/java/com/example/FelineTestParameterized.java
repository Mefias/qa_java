package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class FelineTestParameterized {
    private final int input;
    private final int expected;
    Feline feline;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();
    }

    public FelineTestParameterized(int kittenIn, int kittenOut) {
        this.input = kittenIn;
        this.expected = kittenOut;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {0, 0},
                {1, 1},
                {10, 10}
        };
    }

    @Test
    public void getKittensAllInputReturnsTheSameAsInputResult() {
        int actual = feline.getKittens(input);
        assertEquals(expected, actual);
    }
}
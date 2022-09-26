package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionParameterizedTest {
    private final String input;
    private final boolean expected;
    @Mock
    Feline feline;

    public LionParameterizedTest(String sex, boolean hasMane) {
        this.input = sex;
        this.expected = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void doesHaveManeTrueIfMaleFalseIfFemale() throws Exception {
        Lion lion = new Lion(feline, input);
        boolean actual = lion.doesHaveMane();
        assertEquals(expected, actual);
    }
}
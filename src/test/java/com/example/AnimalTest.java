package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalTest {
    private final String input;
    private final List<String> expected;

    public AnimalTest(String animalKind, List<String> animalFood) {
        this.input = animalKind;
        this.expected = animalFood;
    }

    @Parameterized.Parameters
    public static Object[][] getTestData() {
        return new Object[][] {
            {"Травоядное", List.of("Трава", "Различные растения")},
            {"Хищник", List.of("Животные", "Птицы", "Рыба")}
        };
    }

    @Test
    public void getFoodReturnAppropriateFood() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(input);
        assertEquals(expected, actual);
    }
}

package com.example.hdreamalgorithm.khh.eaten;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EatenOrGetEatenTest {
    @Test
    @DisplayName("A_숫자가_B_숫자보다_크다")
    void A_숫자가_B_숫자보다_크다() {
        EatenOrGetEaten eatenOrGetEaten = new EatenOrGetEaten();
        int result = eatenOrGetEaten.comparisonOfTheNumber(
            List.of(5),
            List.of(1)
        );

        assertEquals(1, result);
    }

    @Test
    @DisplayName("A_숫자가_B_보다_작다")
    void A_숫자가_B_보다_작다() {
        EatenOrGetEaten eatenOrGetEaten = new EatenOrGetEaten();
        int result = eatenOrGetEaten.comparisonOfTheNumber(
            List.of(1),
            List.of(5)
        );

        assertEquals(0, result);
    }

    @Test
    @DisplayName("A_숫자가_B_숫자보다_3개가_크다")
    void A_숫자가_B_숫자보다_3개가_크다() {
        EatenOrGetEaten eatenOrGetEaten = new EatenOrGetEaten();
        int result = eatenOrGetEaten.comparisonOfTheNumber(
            List.of(6, 7, 8),
            List.of(1)
        );

        assertEquals(3, result);
    }
}

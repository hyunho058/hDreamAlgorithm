package com.example.hdreamalgorithm.khh.weakmeatmeal.v1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FishTest {

    @Test
    void A_크기가_B_보다_크다(){
        Fish fishA = new Fish(5);
        Fish fishB = new Fish(3);

        boolean result = fishA.comparisonSize(fishB.getSize());

        assertTrue(result);
    }

    @Test
    void A_크기가_B_보다_작다(){
        Fish fishA = new Fish(2);
        Fish fishB = new Fish(3);

        boolean result = fishA.comparisonSize(fishB.getSize());

        assertFalse(result);
    }

    @Test
    void A_크기가_B_와_같다(){
        Fish fishA = new Fish(2);
        Fish fishB = new Fish(2);

        boolean result = fishA.comparisonSize(fishB.getSize());

        assertFalse(result);
    }

}

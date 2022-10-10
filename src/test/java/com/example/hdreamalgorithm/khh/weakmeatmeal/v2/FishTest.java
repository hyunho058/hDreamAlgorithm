package com.example.hdreamalgorithm.khh.weakmeatmeal.v2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FishTest {

    @Test
    void A_는_B_를_3개_먹는다() {
        int[] fishListA = new int[]{8, 1, 7, 3, 1};
        Fish fishA = new Fish(fishListA);

        int[] fishListB = new int[]{3, 6, 1};

        assertEquals(
            3,
            fishA.findBinarySearchPosition(0, fishListB)
        );
    }

}
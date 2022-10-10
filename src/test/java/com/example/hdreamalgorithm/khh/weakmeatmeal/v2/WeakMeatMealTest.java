package com.example.hdreamalgorithm.khh.weakmeatmeal.v2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeakMeatMealTest {

    @Test
    void A가_B를_먹을_수_있는_쌍의_개수는_7가지가_있다() {
        int[] fishListA = new int[]{8, 1, 7, 3, 1};
        Fish fishA = new Fish(fishListA);

        int[] fishListB = new int[]{3, 6, 1};
        Fish fishB = new Fish(fishListB);

        WeakMeatMeal weakMeatMeal = new WeakMeatMeal();
        int result = weakMeatMeal.theNumberOfTimesACanEatB(fishA, fishB);

        Assertions.assertEquals(7, result);
    }

    @Test
    void A가_B를_먹을_수_있는_쌍의_개수는_7가지가_있다1() {
        int[] fishListA = new int[]{8, 1, 7, 3, 1};
        Fish fishA = new Fish(fishListA);

        int[] fishListB = new int[]{1, 12, 13};
        Fish fishB = new Fish(fishListB);

        WeakMeatMeal weakMeatMeal = new WeakMeatMeal();
        int result = weakMeatMeal.theNumberOfTimesACanEatB(fishA, fishB);

        Assertions.assertEquals(7, result);
    }
}

package com.example.hdreamalgorithm.khh.weakmeatmeal.v1;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeakMeatMealTest {

    @Test
    void A_1개와_B_리스트_중_3개를_먹는다() {
        WeakMeatMeal weakMeatMeal = new WeakMeatMeal();
        Fish fishA = new Fish(4);

        List<Fish> fishBList = new ArrayList<>();
        fishBList.add(new Fish(1));
        fishBList.add(new Fish(2));
        fishBList.add(new Fish(3));
        fishBList.add(new Fish(4));
        fishBList.add(new Fish(5));

        assertEquals(
            3,
            weakMeatMeal.countCanBeEaten(fishA, fishBList)
        );
    }

    @Test
    void A가_B를_먹을_수_있는_쌍의_개수는_7가지가_있다() {
        WeakMeatMeal weakMeatMeal = new WeakMeatMeal();

        List<Fish> fishAList = new ArrayList<>();
        fishAList.add(new Fish(8));
        fishAList.add(new Fish(1));
        fishAList.add(new Fish(7));
        fishAList.add(new Fish(3));
        fishAList.add(new Fish(1));

        List<Fish> fishBList = new ArrayList<>();
        fishBList.add(new Fish(3));
        fishBList.add(new Fish(6));
        fishBList.add(new Fish(1));

        int result = weakMeatMeal.theNumberOfTimesACanEatB(fishAList, fishBList);

        assertEquals(7, result);
    }

}

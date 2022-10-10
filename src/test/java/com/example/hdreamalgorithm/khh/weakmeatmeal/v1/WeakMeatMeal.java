package com.example.hdreamalgorithm.khh.weakmeatmeal.v1;

import java.util.List;

public
class WeakMeatMeal {

    public int countCanBeEaten(Fish fishA, List<Fish> fishBList) {
        int count = 0;

        for (Fish fishB : fishBList) {
            if (fishA.comparisonSize(fishB.getSize())) count++;
        }

        return count;
    }

    public int theNumberOfTimesACanEatB(List<Fish> fishAList, List<Fish> fishBList) {
        int count = 0;
        for (Fish fish : fishAList) {
            count += countCanBeEaten(fish, fishBList);
        }
        return count;
    }
}

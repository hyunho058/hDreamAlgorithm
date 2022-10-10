package com.example.hdreamalgorithm.khh.weakmeatmeal.v2;

public
    class WeakMeatMeal {
        public int theNumberOfTimesACanEatB(Fish fishA, Fish fishB) {
            int count = 0;
            for (int i = 0; i < fishA.getFishList().length; i++) {
                count += fishA.findBinarySearchPosition(i, fishB.getFishList());
            }
            return count;
        }
    }

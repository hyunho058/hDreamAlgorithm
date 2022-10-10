package com.example.hdreamalgorithm.khh.weakmeatmeal.v2;

import java.util.Arrays;

public
    class Fish {
        private final int[] fishList;

        public Fish(int[] fishList) {
            this.fishList = fishList;
        }

        public int[] getFishList() {
            return this.fishList;
        }
        public int findBinarySearchPosition(int fishPosition, int[] fishList) {
            int mid;
            int low = 0;
            int high = fishList.length - 1;

            Arrays.sort(fishList);

            while (low <= high) {
                mid = (low + high) / 2;

                if (this.fishList[fishPosition] == fishList[mid]) {
                    return mid;
                } else if (this.fishList[fishPosition] < fishList[mid]) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            return low;
        }
    }

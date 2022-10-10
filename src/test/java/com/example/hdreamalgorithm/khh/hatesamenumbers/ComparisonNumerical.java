package com.example.hdreamalgorithm.khh.hatesamenumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12906
 */
public class ComparisonNumerical {

    public boolean isSameNumber(int i, int i1) {
        return i == i1;
    }

    public int[] deduplication(int[] arr) {
        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            if (!isSameNumber(arr[i - 1], arr[i])) {
                list.add(arr[i]);
            }
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

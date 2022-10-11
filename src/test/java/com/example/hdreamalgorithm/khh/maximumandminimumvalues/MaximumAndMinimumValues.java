package com.example.hdreamalgorithm.khh.maximumandminimumvalues;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MaximumAndMinimumValues {
    public int changeFromStringToInteger(String str) {
        return Integer.parseInt(str);
    }

    public String minimumMaximumReturn(String s) {
        StringBuilder sb = new StringBuilder();
        String[] stringNumbers = s.split(" ");

        int[] numbers = new int[stringNumbers.length];

        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = changeFromStringToInteger(stringNumbers[i]);
        }

        Arrays.sort(numbers);

        sb.append(numbers[0])
            .append(" ")
            .append(numbers[numbers.length - 1]);

        return sb.toString();
    }
}

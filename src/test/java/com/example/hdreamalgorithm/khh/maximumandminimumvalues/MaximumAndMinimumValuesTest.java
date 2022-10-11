package com.example.hdreamalgorithm.khh.maximumandminimumvalues;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12939
 * 최대값과 최솟값
 * <p>
 * 1.최솟값 구하기
 * 2.최댓값 구하기
 * 3.String -> Integer 변경
 * 4.int로 변경한 값 배열에 저장
 * 5.오름차순 정렬
 */
class MaximumAndMinimumValuesTest {

    @Test
    void 문자에서_숫자로_변경() {
        MaximumAndMinimumValues maximumAndMinimumValues = new MaximumAndMinimumValues();
        int number = maximumAndMinimumValues.changeFromStringToInteger("1");

        assertEquals(1, number);
    }

    @Test
    void 최솟값_1_최댓갑_4() {
        MaximumAndMinimumValues maximumAndMinimumValues = new MaximumAndMinimumValues();
        String result = maximumAndMinimumValues.minimumMaximumReturn("1 2 3 4");

        assertEquals("1 4", result);
    }
}
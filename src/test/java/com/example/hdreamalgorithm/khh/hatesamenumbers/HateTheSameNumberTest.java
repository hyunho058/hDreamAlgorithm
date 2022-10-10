package com.example.hdreamalgorithm.khh.hatesamenumbers;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * 1.두 수가 같은지 비교
 * 2.list를 순차적으로 돌면서 index와 index+1 값을 비교
 */
public class HateTheSameNumberTest {
    @Test
    void 두_수가_같다() {
        ComparisonNumerical comparisonNumerical = new ComparisonNumerical();

        assertAll(
            () -> assertTrue(comparisonNumerical.isSameNumber(1, 1)),
            () -> assertTrue(comparisonNumerical.isSameNumber(3, 3))
        );
    }

    @Test
    void 두_수가_다르다() {
        ComparisonNumerical comparisonNumerical = new ComparisonNumerical();

        assertAll(
            () -> assertFalse(comparisonNumerical.isSameNumber(1, 3)),
            () -> assertFalse(comparisonNumerical.isSameNumber(3, 9))
        );
    }

    @Test
    void 정수_리스트에_중복_제거() {
        ComparisonNumerical comparisonNumerical = new ComparisonNumerical();
        int[] deduplication = comparisonNumerical.deduplication(new int[]{1, 1, 3, 3, 0, 1, 1});

        assertThat(
            Arrays.equals(
                new int[]{1, 3, 0, 1},
                deduplication
            )
        ).isTrue();
    }
}

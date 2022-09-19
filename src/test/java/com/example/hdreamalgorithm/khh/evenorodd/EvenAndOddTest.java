package com.example.hdreamalgorithm.khh.evenorodd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


//https://school.programmers.co.kr/learn/courses/30/lessons/12937
//정수 num이 짝수일 경우 "Even"을 반환하고 홀수인 경우 "Odd"를 반환하는 함수, solution을 완성해주세요.
public class EvenAndOddTest {
    @Test
    @DisplayName("짝수와_훌수_정수입력_확인")
    void 짝수와_훌수_정수입력_확인(){
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        EvenOddStatus evenOddStatus = evenAndOdd.isEven(4);

        assertEquals(EvenOddStatus.Even, evenOddStatus);
    }

    @Test
    @DisplayName("짝수_입력하면_Even_반환")
    void 짝수_입력하면_Even_반환(){
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        EvenOddStatus evenOddStatus = evenAndOdd.isEven(2);

        assertEquals(EvenOddStatus.Even, evenOddStatus);
    }

    @Test
    @DisplayName("홀수_입력하면_Odd_반환")
    void 홀수_입력하면_Odd_반환(){
        EvenAndOdd evenAndOdd = new EvenAndOdd();
        EvenOddStatus evenOddStatus = evenAndOdd.isEven(3);

        assertEquals(EvenOddStatus.Odd, evenOddStatus);
    }
}

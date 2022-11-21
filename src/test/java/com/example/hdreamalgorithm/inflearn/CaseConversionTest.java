package com.example.hdreamalgorithm.inflearn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CaseConversionTest {

    @Test
    void 대문자_소문자로_변환(){
        CaseConversion caseConversion = new CaseConversion();
        String result = caseConversion.conversion("AbcdEfG");

        assertEquals("aBCDeFg", result);
    }

    @Test
    void 소문자_대문자로_변환(){
        CaseConversion caseConversion = new CaseConversion();
        String result = caseConversion.conversion("StuDY");

        assertEquals("sTUdy", result);
    }
}

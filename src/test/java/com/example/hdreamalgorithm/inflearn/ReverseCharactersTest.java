package com.example.hdreamalgorithm.inflearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ReverseCharactersTest {
    @Test
    void 문자_뒤집기() {
        ReverseCharacters reverseCharacters = new ReverseCharacters();
        String result = reverseCharacters.revers("good");

        Assertions.assertEquals("doog", result);
    }

    @Test
    void 문자_뒤집기1() {
        ReverseCharacters reverseCharacters = new ReverseCharacters();
        String result = reverseCharacters.revers("Big");

        Assertions.assertEquals("giB", result);
    }


}
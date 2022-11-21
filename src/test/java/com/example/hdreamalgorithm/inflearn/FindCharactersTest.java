package com.example.hdreamalgorithm.inflearn;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindCharactersTest {
    @Test
    void 문자열에_C_가_한개_포함() {
        FindCharacters findCharacters = new FindCharacters();
        int result = findCharacters.checkTheNumberOfAlphabets("computer", "C");

        assertEquals(1, result);
    }

    @Test
    void 문자열에_대문자_C_소문자_c_포함() {
        FindCharacters findCharacters = new FindCharacters();

        assertEquals(2, findCharacters.checkTheNumberOfAlphabets("Computercooler", "c"));
    }

}
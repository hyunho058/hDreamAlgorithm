package com.example.hdreamalgorithm.inflearn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseSpecificCharacterTest {


    @Test
    void 특정_문자_뒤집기() {
        ReverseSpecificCharacter reverseSpecificCharacter = new ReverseSpecificCharacter();
        String result = reverseSpecificCharacter.reverse("a#b!GE*T@S");

        assertEquals("S#T!EG*b@a", result);
    }

}
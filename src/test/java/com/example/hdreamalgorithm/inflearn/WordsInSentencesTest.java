package com.example.hdreamalgorithm.inflearn;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class WordsInSentencesTest {
    @Test
    void 가장_긴_문자_반환() {
        WordsInSentences wordsInSentences = new WordsInSentences();
        String result = wordsInSentences.findTheLongestWord("it is time to study abcde aaaaa eeeee");

        assertEquals("study", result);
    }
}
package com.example.hdreamalgorithm.inflearn;

import java.util.Scanner;

public class WordsInSentences {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input1 = in.nextLine();
        System.out.println(findTheLongestWord(input1));
    }

    public static String findTheLongestWord(String words) {
        String[] wordList = words.split(" ");
        String result = "";

        for (String word : wordList) {
            if (result.length() < word.length()) {
                result = word;
            }
        }
        return result;
    }
}

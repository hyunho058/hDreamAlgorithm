package com.example.hdreamalgorithm.inflearn;

import java.util.Scanner;

public class ReverseCharacters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input1 = in.nextInt();
        in.nextLine();
        String[] words = new String[input1];


        for (int i = 0; i < input1; i++) {
            words[i] = in.nextLine();
        }

        for (String word : words){
            System.out.println(revers(word));
        }
    }

    public static String revers(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            stringBuilder.append(word.charAt(i));
        }
        return stringBuilder.toString();
    }
}

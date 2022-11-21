package com.example.hdreamalgorithm.inflearn;

import java.util.Scanner;

public class CaseConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(conversion(str));
    }

    public static String conversion(String str) {
        StringBuilder convertedCharacters = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (97 <= c) {
                convertedCharacters.append((char) (c - 32));
            } else {
                convertedCharacters.append((char) (c + 32));
            }
        }
        return convertedCharacters.toString();
    }
}

package com.example.hdreamalgorithm.inflearn;

import java.util.Scanner;
import java.util.Stack;

public class ReverseSpecificCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(reverse(scanner.nextLine()));
    }
    public static String reverse(String str) {
        Stack<Character> stack = new Stack<>();
        char[] reverseStr = new char[str.length()];
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char alphabet = str.charAt(i);
            if (alphabetCheck(alphabet)) {
                stack.push(alphabet);
            }
            reverseStr[i] = alphabet;
        }

        for (int i = 0; i < str.length(); i++) {
            if (alphabetCheck(reverseStr[i])){
                reverseStr[i] = stack.pop();
            }
            result.append(String.valueOf(reverseStr[i]));
        }

        return result.toString();
    }

    private static boolean alphabetCheck(char alphabet) {
        return (65 <= alphabet && 90 >= alphabet) || (97 <= alphabet && 122 >= alphabet);
    }
}

package com.example.hdreamalgorithm.greedy.coinzero;

import java.util.Scanner;

public class Hyunho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        int[] numList = new int[N];
        for (int i = 0; i < N; i++) {
            numList[i] = scanner.nextInt();
        }
        int sum = 0;
        int count = 0;

        while (K != sum) {
            for (int i = N - 1; i >= 0; i--) {
                if (numList[i] > K) {
                    continue;
                }
                if (K - sum >= numList[i]) {
                    sum += numList[i];
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

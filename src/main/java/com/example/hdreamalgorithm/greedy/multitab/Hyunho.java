package com.example.hdreamalgorithm.greedy.multitab;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hyunho {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int K = Integer.parseInt(bufferedReader.readLine());
        String[] schedules = bufferedReader.readLine().split(" ");
        String[] multiTab = new String[N];
        int count = 0;

        for (int i = 0; i < N; i++) {
            multiTab[i] = schedules[i];
        }

        for (int i = N; i < K; i++) {
            for (int j = 0; j < N; j++) {
                if (multiTab[j].equals(schedules[N])) {
                    count++;
                }
            }
        }
    }
}

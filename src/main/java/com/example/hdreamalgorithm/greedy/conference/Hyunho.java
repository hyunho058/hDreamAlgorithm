package com.example.hdreamalgorithm.greedy.conference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Hyunho {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[][] conferenceList = new int[n][2];
        int conferenceCount = 1;

        for (int i = 0; i < n; i++) {
            String[] temp = bufferedReader.readLine().split(" ");
            conferenceList[i][0] = Integer.parseInt(temp[0]);
            conferenceList[i][1] = Integer.parseInt(temp[1]);
        }

        Arrays.sort(conferenceList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]){
                    return o1[0] - o2[0];
                }
                return o1[1] - o2[1];
            }
        });

        int[] before = conferenceList[0];
        for (int i = 1; i < n; i++) {
            int[] after = conferenceList[i];
            if (before[1] <= after[0]) {
                conferenceCount++;
                before = conferenceList[i];
            }
        }
        System.out.println(conferenceCount);
    }
}

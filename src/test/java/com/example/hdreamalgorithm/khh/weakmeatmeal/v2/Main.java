package com.example.hdreamalgorithm.khh.weakmeatmeal.v2;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        WeakMeatMeal weakMeatMeal = new WeakMeatMeal();

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            int[] fishAList = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                fishAList[j] = Integer.parseInt(st.nextToken());
            }
            Fish fishA = new Fish(fishAList);

            int[] fishBList = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                fishBList[j] = Integer.parseInt(st.nextToken());
            }
            Fish fishB = new Fish(fishBList);

            sb.append(weakMeatMeal.theNumberOfTimesACanEatB(fishA, fishB))
                .append("\n");
        }

        System.out.println(sb);
    }
}

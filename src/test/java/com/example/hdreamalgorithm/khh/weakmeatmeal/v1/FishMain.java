package com.example.hdreamalgorithm.khh.weakmeatmeal.v1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class FishMain {

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
            List<Fish> fishListA = new ArrayList<>();
            List<Fish> fishListB = new ArrayList<>();

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                fishListA.add(new Fish(Integer.parseInt(st.nextToken())));
            }

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                fishListB.add(new Fish(Integer.parseInt(st.nextToken())));
            }

            sb.append(weakMeatMeal.theNumberOfTimesACanEatB(fishListA, fishListB))
                .append("\n");
        }

        System.out.println(sb);
    }

    static class WeakMeatMeal {

        public int countCanBeEaten(Fish fishA, List<Fish> fishBList) {
            int count = 0;

            for (Fish fishB : fishBList) {
                if (fishA.comparisonSize(fishB.getSize())) count++;
            }

            return count;
        }

        public int theNumberOfTimesACanEatB(List<Fish> fishAList, List<Fish> fishBList) {
            int count = 0;
            for (Fish fish : fishAList) {
                count += countCanBeEaten(fish, fishBList);
            }
            return count;
        }
    }
}

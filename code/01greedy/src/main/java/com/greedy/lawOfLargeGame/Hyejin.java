package com.greedy.lawOfLargeGame;

import java.util.Arrays;
import java.util.Scanner;

public class Hyejin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("n입력");
        int n = sc.nextInt();
        System.out.println("m입력");
        int m = sc.nextInt();
        System.out.println("k입력");
        int k = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("==n개의 수 입력==");
        for (int i = 0; i < n; i++) {
            System.out.println("값을 입력하세요");
            arr[i] = sc.nextInt();
        }

       // System.out.println(lawOfLargeGame(8, 3, new int[]{2, 4, 5, 4, 6}));

    }

    /**
     * 배열 정렬을 한다
     * 가장 큰수를 k번 반복
     * k개 다음은 두번째 큰수 한번 더하기
     * 개수가 8개가 되면 stop
     */

    public static int lawOfLargeGame(int m, int k, int[] arr) {
        int answer = 0;

        Arrays.sort(arr);
        int cntM = 1;
        int cntK = 1;
        while (cntM <= m) {
            if (cntK == k) {
                answer += arr[arr.length-2];
                cntK = 0;
            } else {
                answer += arr[arr.length-1];
                cntK++;
            }
            cntM++;
        }

        return answer;
    }
}

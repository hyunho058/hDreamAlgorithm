package com.greedy.selectBowling;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hyejin {


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("볼링공의 개수");
//        int num = sc.nextInt();
//        int arr[]= new int[num];
//        System.out.println("공의 최고 무게");
//        int max = sc.nextInt();
//        int i = 0;
//        while (i<num){
//            System.out.println(i+"번째 볼링공 무게");
//            arr[i++] = sc.nextInt();
//        }

        //testcase
//        System.out.println(bowling(new int[]{1, 3, 2, 3, 2}));
//        System.out.println(bowling(new int[]{1, 5, 4, 3, 2, 4, 5, 2}));
//        System.out.println(bowling(new int[]{1, 5, 5, 3, 2, 4, 5, 2}));

        //testcase2

        System.out.println(bowling2(new int[]{1, 3, 2, 3, 2},3));
        System.out.println(bowling2(new int[]{1, 5, 4, 3, 2, 4, 5, 2},5));
        System.out.println(bowling2(new int[]{1, 5, 5, 3, 2, 4, 5, 2},5));


    }

    //1
    public static int bowling(int[] arr) {
        int answer = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] != arr[j]) answer++;
            }
        }

        return answer;
    }

    //2

    /**
     * 각 무게별로 개수를 저장한 후
     * a의 경우의 수 b의 경우의 수를 곱하는 방식
     * 나중에..
     */
    public static int bowling2(int[] arr, int max) {
        int result = 0;

        return result;
    }
}

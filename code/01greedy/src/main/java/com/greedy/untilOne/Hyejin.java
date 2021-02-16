package com.greedy.untilOne;

import java.util.Scanner;

public class Hyejin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n");
        int n = sc.nextInt();
        System.out.println("k");
        int k = sc.nextInt();
        System.out.println(untilOne(n,k));

        sc.close();
    }

    public static int untilOne(int n, int k){
        int answer = 0;

        while(n!=1){
            answer++;
            n = n%k==0? n/k: n-1;
        }

        return answer;
    }
}

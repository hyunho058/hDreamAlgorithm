package com.greedy.untilOne;

public class Hyejin {

    public static void main(String[] args) {
        System.out.println(untilOne(25,5));
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

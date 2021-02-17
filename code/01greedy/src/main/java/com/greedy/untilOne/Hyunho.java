package com.greedy.untilOne;

import java.util.Scanner;

public class Hyunho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int K = scanner.nextInt();
        System.out.println("RESULT=="+getResult(N, K));
    }

    public static int getResult(int N, int K){
        int count = 0;
        while (true){
            if (N%K != 0){
                N -= 1;
            }else {
                N /= K;
            }
            count++;
            if (N == 1){
                break;
            }
        }
        return count;
    }
}

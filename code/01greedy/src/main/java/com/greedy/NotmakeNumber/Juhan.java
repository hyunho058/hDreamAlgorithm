package com.greedy.NotmakeNumber;

import java.util.Arrays;
import java.util.Scanner;

public class Juhan {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("N 의 값을 입력");
        int N = sc.nextInt();
        int[] coin = new int[N];
        System.out.println("Coin의 요소를 입력.");
        int inputNum = sc.nextInt();
        int cycle = 0;

        while (inputNum != 0){
            coin[cycle] = inputNum % 10;
            inputNum /= 10;
            cycle++;
        }// 분배해서 넣기....

        System.out.println("결과 : " + solution(coin));
    }

    public static int solution(int[] coin){
        Arrays.sort(coin);

        int notMakeNum = 1;
        for(int i = 0; i < coin.length; i ++){
            System.out.println("NotNum = " + notMakeNum + "coin = " +coin[i]);
            if(notMakeNum < coin[i]){
                break;
            }
            notMakeNum += coin[i];
            System.out.println(notMakeNum);

        }
        return notMakeNum;
    }

}

package com.example.implementation.clock;

import java.util.Scanner;

public class Juhan2nd {
    /* N을 입력 받으면 0시 00분 00초 ~ N 시 까지
    * 3이 포함되어 있는 숫자를 카운트 하는 문제.
    * 값으로 찾기 ver...*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n 을 입력하여 주세요,");
        int n = sc.nextInt();
        System.out.println("결과 : " + solution(n));
    }
    public static int solution(int n){
        int result = 0; // 결과

        for(int hour = 0; hour <= n; hour ++){
            for(int min = 0; min < 60; min++){
                for(int sec = 0; sec < 60; sec++){
                    if(hour % 10 == 3 || min % 10 == 3 || sec % 10 == 3 || min / 10 ==3 || sec / 10 == 3) {
                        result++;
                    }
                }
            }
        }
        return result;
    }
}

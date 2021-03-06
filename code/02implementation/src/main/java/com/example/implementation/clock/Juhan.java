package com.greedy.time;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class Juhan {
    /* N을 입력 받으면 0시 00분 00초 ~ N 시 까지
    * 3이 포함되어 있는 숫자를 카운트 하는 문제.
    * String 으로 찾기 ver */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n 을 입력하여 주세요,");
        int n = sc.nextInt();
        System.out.println("결과 : " + solution(n));
    }
    public static int solution(int n){
        int result = 0; // 결과

        for(int hour = 0; hour <= n; hour ++){//정수 N을 입력하면 N시 59분 59초 까지 돌고 끝나야 함....
            for(int min = 0; min < 60; min++){
                for(int sec = 0; sec < 60; sec++){
                    String nhour = Integer.toString(hour);
                    String nmin = Integer.toString(min);
                    String nSce = Integer.toString(sec);
                    if(nhour.contains("3")|| nmin.contains("3") || nSce.contains("3")){
                        result++;
                    }
                }
            }
        }
        return result;
    }
}

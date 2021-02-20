package com.greedy.untilOne;

import java.util.Scanner;

public class Juhan {

    public static void main(String[] args) {
        System.out.println("값을 입력하세요.");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        if((2 <= n && n <= 100000) && (2 <= k && k <= 100000)){
            System.out.println("올바른 값 입니다. N = " + n + " K = " + k);
            System.out.println("결과는 resultCnt = " +solution3(n,k));

        }else{
            System.out.println("값이 이상합니다.. N = " + n + " K = " + k);
            return;
        }

    }
    public static int solution3(int n, int k){
        int resultCnt = 0;

        while (n != 1){
            if(n/k == 0){
                resultCnt++;
                n = n/k;
            }else{
                if(n%k == 0){
                    resultCnt++;
                    n = n/k;
                }else {
                    resultCnt++;
                    n--;
                }
            }
        }
        return resultCnt;
    }
}

package com.greedy.untilOne;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Juhan04 {

    public static void main(String[] args) {

        int N, inputNum = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("N의 값을 입력");
        N = sc.nextInt();

        int[] arr_N = new int[N];

        for(int i = 0; i < N; i ++){
            System.out.println("값을 입력해 주세요.");
            inputNum = sc.nextInt();
            arr_N[i] = inputNum;
            System.out.println("arr_N = " + arr_N[i]);
        }

        System.out.println("===== 결과 =====");
        System.out.println(solution(arr_N));

    }

    public static int solution(int arr_N[]){
        Arrays.sort(arr_N);// 오름차순정리 max값 확인.
        int resultCnt = 0;
        int nowIndex = arr_N.length;

        for(int i = 0; i < arr_N.length; i++){
            if(arr_N[arr_N.length-1] - 1 < arr_N.length){// 정상 입력.
                resultCnt++;
                nowIndex -= arr_N[nowIndex-1];
                if(nowIndex == 0){
                    return resultCnt;
                }
            }else {// 그룹의 인원보다 최대 공포심을 갖은 인원이 많은경우 연산이 불가.
                System.out.println("그룹의 공포심 최대 값이 그룹 인원을 초과. 추가 인원이 필요 합니다.");
                return 0;
            }
        }
        return resultCnt;
    }

}

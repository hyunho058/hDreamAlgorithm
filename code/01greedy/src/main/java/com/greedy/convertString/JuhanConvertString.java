package com.greedy.convertString;

import java.util.Scanner;

public class JuhanConvertString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("값을 입력하여 주세요.");
        String s = sc.nextLine();
        System.out.println("결과 = " + solution(s));

    }
    public static String solution(String s){
        int zroCnt = 0;
        int oneCnt = 0;
        int empty = Integer.parseInt(s);
        int[] arr = new int[s.length()];


        for(int i = s.length(); i > 0; i--){
            arr[i-1] = empty % 10;
            empty = empty / 10;
        }//배열에 쪼개서 넣기

        for(int i = 0; i < arr.length-1; i ++){
            if(arr[i] == arr[i+1]){

            }else {
                if (arr[i] == 0){
                    zroCnt++;
                }else {
                    oneCnt++;
                }
            }
        }
        if(zroCnt > oneCnt){
            return Integer.toString(zroCnt);
        }else {
            return Integer.toString(oneCnt);
        }
    }
}

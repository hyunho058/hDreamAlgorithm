package com.example.implementation.UpDownLeftRight;

import java.util.Scanner;

public class Hyejin {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String arr[] = new String[n];
//        for(int i = 0; i< n; i++){
//            arr[i]= sc.nextLine();
//        }
//
//        System.out.println(upDownLeftRtight(n,arr));

        //testcase
        System.out.println(upDownLeftRtight(5, new String[]{"R", "R", "R", "U", "D", "D"}));
        System.out.println(upDownLeftRtight(5, new String[]{"U", "R", "R", "U", "D", "D", "L"}));


    }

    /**
     * r
     * <p>
     * 모험가의 위치 x,y
     * arr의 값을 하나씩 꺼내서 이동
     * r -> 열 증가
     * l -> 열 감소
     * u -> 행 감소
     * d -> 행 증가
     * 이 때 0미만 N초과일 경우는 값 증가x
     */

    public static String upDownLeftRtight(int n, String arr[]) {
        //모험가의 현재 위치
        int x = 1;
        int y = 1;
        //모험가가 움직이는 중
        for (int i = 0; i < arr.length; i++) {

            String act = arr[i];

            switch (act) {
                case "R":
                    if (x == n) continue;
                    x++;
                    break;
                case "L":
                    if (x == 1) continue;
                    x--;
                    break;
                case "U":
                    if (y == 1) continue;
                    y--;
                    break;
                case "D":
                    if (y == n) continue;
                    y++;
                    break;
            }


        }
        return y + " " + x;
    }
}

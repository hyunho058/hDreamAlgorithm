package com.example.implementation.clock;

import java.util.Scanner;

public class Hyunho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println("RESULT==" + result(N));
        scanner.close();

//        int count = 0;
//
//        for (int i = 0; i < 60; i++) {
//            if (String.valueOf(i).contains("3")) {
//                for (int j = 0; j < 60; j++) {
//                    count++;
//                }
//            }else {
//                for (int j = 0; j < 60; j++) {
//                    if (String.valueOf(j).contains("3")) {
//                        count++;
//                    }
//
//                }
//            }
//        }
//        System.out.println("COUNT==" + count);
    }
    //
    public static int result(int hour) {
        int countResult = 0;
        for (int i = 0; i <= hour; i++) {
            if (String.valueOf(i).contains("3")) { //시간에 3이 포함된 경우
                countResult += 60 * 60;
                System.out.println("Contains==" + "3" + " / countResult==" + countResult);
            } else { //시간에 3이 포함되지 않은 경우
                countResult += (60 - 15) * 15; //분에 3이 포함되지 않은 경우
                countResult += 15 * 60;  //분에 3이 퐇마된 경우

                System.out.println("m==" + i);
                System.out.println("countResult==" + countResult);
            }
        }
        return countResult;
    }
}
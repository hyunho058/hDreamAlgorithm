package com.example.implementation.luckyStraight;

import java.util.Scanner;

public class Hyejin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int num;
        String convNum;
        do {
            System.out.println("값입력");
            num = sc.nextInt();
            convNum = Integer.toString(num);
        }
        while (convNum.length() % 2 == 1);

        System.out.println(LuckyStraight(num));

        //test
        System.out.println(LuckyStraight(123402));
        System.out.println(LuckyStraight(7755));


    }

    public static String LuckyStraight(int num){
        String convNum =  Integer.toString(num);
        String[]numArray = convNum.split("");

        int sum1 = 0;
        int sum2 = 0;
        int halfSize = numArray.length/2;
        for(int i = 0; i< halfSize; i++){
            sum1 += Integer.parseInt(numArray[i]);
            sum2 += Integer.parseInt(numArray[halfSize+i]);
        }

        return sum1==sum2? "LUCKY":"READY";

    }
}

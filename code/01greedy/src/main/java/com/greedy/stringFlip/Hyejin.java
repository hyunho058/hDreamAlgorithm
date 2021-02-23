package com.greedy.stringFlip;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hyejin {
    static int flipCount;

    public static void main(String[] args) {
        System.out.println(stringFlip("0001100"));
        System.out.println("=================");
        System.out.println(stringFlip("1110011"));
        System.out.println("=================");

        System.out.println(stringFlip("1010011"));
        System.out.println("=================");
        System.out.println(stringFlip("0010011"));


    }

    static int stringFlip(String s) {
        flipCount = 0;
        int cnt0=0;
        int cnt1=0;


        while (!chkIsFlip(s)) {
            cnt0 = 0;
            cnt1 = 0;

            if (s.charAt(0) == '1') cnt1++;
            else cnt0++;

            for (int i = 1; i < s.length(); i++) {
                if (s.charAt(i) != s.charAt(i - 1)) {
                    if (s.charAt(i) == '0') cnt0++;
                    else cnt1++;
                }
            }
            s = flipString(s,Math.min(cnt0,cnt1)==cnt0?'0':'1');

        }

        return flipCount;
    }

    private static boolean chkIsFlip(String s) {
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) != s.charAt(i)) return false;
        }
        return true;
    }

    private static String flipString(String s, char flipNum) {
        StringBuilder sBuilder = new StringBuilder(s);
        char changeflipNum = flipNum=='0'? '1' : '0';
        flipCount++;
        int startidx = s.indexOf(flipNum);

        while (startidx < s.length() && s.charAt(startidx) ==flipNum){
            sBuilder.setCharAt(startidx,changeflipNum);
            startidx++;
        }

        return sBuilder.toString();

    }

}
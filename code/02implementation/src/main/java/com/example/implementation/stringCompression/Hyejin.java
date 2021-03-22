package com.example.implementation.stringCompression;


public class Hyejin {

    public static void main(String[] args) {


        System.out.println( stringCompression("ababcdcdababcdcd"
        ));
//
        System.out.println( stringCompression("aabbaccc"
        ));
    }

    /**
     * ababcdcdababcdcd
     * 2ab 2cd 2ab 2cd
     */

    //증가시키면서 압축률을 체크한다
    public static int stringCompression(String s) {

        int min = Integer.MAX_VALUE;

        int r = 0;
        while (++r<=s.length()){
            int endIndex = s.length() - s.length() % r;
            //반복되는 곳에 넣을 것
            String repeatS = s.substring(0, endIndex);
            //chekCompression에는 반복되는 순열의 배수까지만 들어간다
            int stringCnt = chekCompression(repeatS,r) +  s.length()%r;
            min = min>stringCnt? stringCnt:min;

        }
        return min;
    }

    //처번째 순열(0~num-1)을 담는다
    //두번째 순열부터 비교

    public static int chekCompression(String s, int n) {
        //반복되는 개수를 cnt하는 용
        int cnt = 1;
        //마지막에 저장될  string 더하는 용
        StringBuilder sb = new StringBuilder();
        String permutation = s.substring(0,n);
        for(int i = n; i< s.length(); i=i+n){
            String comparePermutation = s.substring(i,i+n);
            if(comparePermutation.equals(permutation)){
                cnt++;
            }else{
                String appendCnt = cnt==1?"": String.valueOf(cnt);
                sb.append(appendCnt);
                sb.append(permutation);
                permutation = comparePermutation;
                cnt  =1;
            }
        }
        String appendCnt = cnt==1?"": String.valueOf(cnt);
        sb.append(appendCnt);
        sb.append(permutation);

        return sb.toString().length();
    }
}

package com.greedy.guild;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Hyunho  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] memberList = new int[N];
        HashMap<Integer, Integer> member = new HashMap<>();
        int result = 0;

        for (int i=0; i<N; i++){
            memberList[i] = scanner.nextInt();
        }

        Arrays.sort(memberList);

        //같은 값 별로 구분
        for(int num : memberList){
            member.put(num, member.get(num) == null ? 1 : member.get(num)+1);
        }
        //그룹이 가능한 인원 수 확인
        for(int num : member.keySet()){
            result += member.get(num)/num;
        }

        System.out.println("result-=="+result);

    }
}
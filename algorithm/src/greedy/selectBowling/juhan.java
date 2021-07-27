package greedy.selectBowling;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class juhan {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int[] arr = new int[n];
    int result = 0;

    for (int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
    }

    for(int i = 0; i < arr.length-1; i++){
        for(int j = i+1; j < arr.length; j++){
            if(arr[i] != arr[j]) result += 1;
        }
    }// 같으면 패스 같으면 카운트
    System.out.println(result);
    }
}
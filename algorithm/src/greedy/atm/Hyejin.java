package greedy.atm;

import java.util.Arrays;
import java.util.Scanner;

//20210728
//https://www.acmicpc.net/problem/11399
public class Hyejin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(atm(arr));
    }

    public static int atm(int[] arr){
        int sum =0;
        int answer = 0;
        Arrays.sort(arr);
        for(int i : arr){
            sum+= i;
            answer +=sum;
        }
        return answer;

    }
}

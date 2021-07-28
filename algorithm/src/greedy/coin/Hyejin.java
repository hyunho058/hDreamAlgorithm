package greedy.coin;

import java.util.Scanner;

public class Hyejin {
    //20210727
    //https://www.acmicpc.net/problem/11047
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //화폐의 개수
        int k = sc.nextInt(); //목포 K원
        int [] arr = new int[n];

        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(cntCoin(arr,k));

    }

    public static int cntCoin(int [] arr, int k){
        int answer = 0;
        int tmp = k;
        for(int i = arr.length-1; i >=0; i--){
            int minus = tmp/arr[i];
            if(minus >=1){

                answer+=minus;
                tmp -= arr[i]*minus;

            }

        }

        return answer;
    }
}


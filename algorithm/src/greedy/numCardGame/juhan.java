package greedy.numCardGame;

import java.util.Arrays;
import java.util.Scanner;

public class juhan {
    /**
     * 문제 목표 : N,M 값을 입력받아 -> 2차원 배열을 만들고
     * 배열 안에 값들을 입력받고 확인하여 열에 작은 값들중 가장 큰 수를 찾기.
     *  123 - 1
     *  212 - 1
     *  789 - 7  출력 : 7
     * **/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("알고리즘 2일차");
        System.out.println("N 의 값을 입력 : ");
        int n = sc.nextInt();
        System.out.println("M 의 값을 입력 : ");
        int m= sc.nextInt();
        int[][] arr = new int[n][m]; // 입력받을 값을 넣을 배열을 생성.

        if(n>0 && m>0) {
            for(int i = 0; i < n; i++){
                for(int j = 0; j < m; j++){
                    System.out.println((i+1)+","+j + "값을 입력:");
                    arr[i][j] = sc.nextInt(); // 값을 하나씩 입력.
                }
            }// 정상 배열값 들어왔음.
            System.out.println("결과 : " + calc(arr));

        }else{
            System.out.println("배열의 행/열은 1 이상");
            System.out.println("N = " + n + "M =" +m);
            return;
        }// 배열의 예외처리
    }
    public static int calc(int[][] arr){
        int[] nMin = new int[arr.length];
//        System.out.println("배열 길이[N] :" +arr[0].length);
//        System.out.println("배열 길이[M] :" +arr.length);

        for(int i = 0 ; i < arr.length; i ++){
            int result = arr[i][0];
            for(int j = 0; j <arr[0].length; j++){
                if(arr[i][j] < result){
                    result = arr[i][j];
                }
            }
            nMin[i] = result;
        }

        Arrays.sort(nMin);
        return nMin[arr.length-1];
    }// 계산하는 메서드(알고리즘)


}

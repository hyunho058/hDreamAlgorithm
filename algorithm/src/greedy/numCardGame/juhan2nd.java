package greedy.numCardGame;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class juhan2nd {
    /*
    값을 입력 받아서 배열에 넣기
     */


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("알고리즘 2일차");
        System.out.println("N 의 값을 입력 : ");
        int n = sc.nextInt();
        System.out.println("M 의 값을 입력 : ");
        int m= sc.nextInt();

        int[] arrN = new int[m]; // 입력받을 값을 넣을 배열을 생성.
        int[][] arr = new int[n][m]; // 입력받을 값을 넣을 배열을 생성.

        if(n>0 && m>0) {
            for(int i = 0; i < n; i++){
                System.out.println("값 입력: ");
                int inputNum = sc.nextInt();
                for(int q = arr[0].length; q > 0; q --){
                    arrN[q-1] = inputNum%10;
                    inputNum = inputNum/10;
                }// 숫자를 받아서 배열에 넣기 123 = [1,2,3]
                for(int j = 0; j < m; j++){
                    arr[i][j] = arrN[j];
                }
            }
            System.out.println("결과 : " + calc2(arr));

        }else{
            System.out.println("배열의 행/열은 1 이상");
            System.out.println("N = " + n + "M =" +m);
            return;
        }
    }

    public static int calc2(int[][] arr){
        int[] nMin = new int[arr.length];

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

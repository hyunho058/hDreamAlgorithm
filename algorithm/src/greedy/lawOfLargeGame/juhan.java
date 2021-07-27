package greedy.lawOfLargeGame;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class juhan {
    public static void main(String[] args) {
        int n,k,m,result = 0;
        int swapCnt = 0;

        Scanner sc = new Scanner(System.in);
        Random random = new Random();


        System.out.println("N 값을 입력하여 주세요.");
        n = sc.nextInt();
        int ran[] = new int[n];
        System.out.println("K 값을 입력하여 주세요.");
        k = sc.nextInt();
        System.out.println("M 값을 입력하여 주세요.");
        m = sc.nextInt();
        sc.close();

        for(int i = 0; i < n; i++) {
            ran[i] = random.nextInt(10);
        }// 1 ~ 10 까지 숫자를 생성.

        Arrays.sort(ran); // 내림차순 정렬
        for(int i = 0; i < n; i++) {
            System.out.print(ran[i] + " ");
        }

        if(k == 1) {
            for(int i = 0; i < m; i++) {
                result = result + ran[n-1];
                n--;
            }
        }else {
            while(m > 0) {
                for(int i = 0; i < k; i ++) {
                    result = result + ran[n-1];
                    m--;
                    if(m == 0) break;
                }
                if(m == 0) break;
                for(int i = 0; i < k; i++) {
                    result = result + ran[n-2];
                    m--;
                    if(m == 0) break;
                }
                if(m == 0) break;
            }
        }
        System.out.println("result = " + result);
    }
}

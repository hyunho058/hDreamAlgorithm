package greedy.atm;

import java.util.Arrays;
import java.util.Scanner;

public class hyunho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] P = new int[N];

        for (int i = 0; i < P.length; i++){
            P[i] = scanner.nextInt();
        }

        Arrays.sort(P); //작은수 순서대로 정렬
        int minTime = 0;
        int result = 0;

        for (int i = 0; i < P.length; i++){
            minTime += P[i];
            result += minTime;
        }

        System.out.println("result = "+ result);
    }
}

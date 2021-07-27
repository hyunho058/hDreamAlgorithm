package greedy.impossiblePrice;

import sun.security.krb5.Asn1Exception;

import java.util.Arrays;
import java.util.Scanner;

public class Hyejin {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("===동전의 개수===");
        int num = s.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i< num; i++){
            System.out.println(i+1+"//===동전 입력===");
            arr[i] = s.nextInt();
        }

        System.out.println(impossible(arr));
//
//        System.out.println(impossible(new int[]{3,2,1,1,9}));
//        System.out.println(impossible(new int[]{3,8,15}));

    }

    public static int impossible(int arr[]) {
        int answer = 1;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (answer < arr[i]) break;
            answer += arr[i];
        }
        return answer;
    }
}

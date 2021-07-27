package implementation.stringSorting;

import java.util.Arrays;
import java.util.Scanner;

public class Hyejin {

    public static void main(String[] args) {
        System.out.println(stringSorting("K1KA5CB7"));
        System.out.println(stringSorting("AJKDLSI412K4JSJ9D"));

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println((stringSorting(s)));

    }

    /**
     *
     * 일단 정렬 후 숫자가 앞으로 오기 때문에
     * 영어가 시작되는분 idx를 찾는다
     * 영어가 시작되는 부분을 먼저 더하고 숫자부분을 이어 붙인다
     *
     */
    public static String stringSorting(String s) {

        String[] arr = s.split("");
        Arrays.sort(arr);
        String answer = "";
        int idx = -1;
        //숫자부분 찾기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].charAt(0) >= 65) {
                idx = i;
                break;
            }
        }
        //숫자부분이 있으면 뒤로 옮기기
        if (idx > -1) {
            for (int i = idx; i < arr.length; i++) {
                answer += arr[i];
            }
            for (int i = 0; i < idx; i++) {
                answer += arr[i];
            }
            return answer;
        }

        return arr.toString();
    }
}

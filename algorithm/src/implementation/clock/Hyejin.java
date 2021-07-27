package implementation.clock;

import java.security.PublicKey;
import java.util.Scanner;

public class Hyejin {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
        System.out.println(clock(1));
        System.out.println(clock2(1));
        System.out.println(clock(2));
        System.out.println(clock2(2));
        System.out.println(clock(5));
        System.out.println(clock2(5));

    }

    /**
     * String 으로 변환한 다음 3이 포함되면  count++
     */
    public static int clock(int num) {
        int count = 0;

        //  시
        for (int h = 0; h <= num; h++) {
            //분
            for (int m = 0; m < 60; m++) {
                //초
                for (int s = 0; s < 60; s++) {
                    String clock = h + "" + m + "" + s;

                    if (clock.indexOf(String.valueOf(3)) != -1) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    /**
     * 3을 찾고 싶을 때  n%10 ==3 n/10==3 (30을 위해) 을 하면 찾을 수 있다
     */

    public static int clock2(int num) {
        int count = 0;

        //  시

        for (int i = 0; i <= num; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    // 매 시각 안에 '3'이 포함되어 있다면 카운트 증가
                    if (check(i, j, k)) count++;
                }
            }
        }
        return count;
    }

    public static boolean check(int h, int m, int s) {
        if (h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3) {
//            System.out.println( h + "" + m + "" + s);
            return true;
        }
        return false;

    }
}

package short_term_growth.binomial_coefficient;

import java.util.Scanner;

/**
 * No.11401
 * https://www.acmicpc.net/problem/11401
 *
 * @author hyunho
 * @since 2021/08/19
 **/
public class Hyunho {
    static long P = 1000000007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        System.out.println(bc(n, k));
    }

    public static long bc(long n, long k) {

        if (k == 1) {
            return n % P;
        }
        long temp = bc(n, k / 2);

        if (k % 2 == 1) {
            return (temp * temp % P) * n % P;
        }

        return temp * temp % P;
    }
}

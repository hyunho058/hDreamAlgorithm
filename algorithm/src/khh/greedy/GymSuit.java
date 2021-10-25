package khh.greedy;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42862?language=java
 *
 * @author hyunho
 * @since 2021/10/25
 **/
public class GymSuit {
    public static void main(String[] args) {
        System.out.println("solution(5, new int[]{2,4}, new int[]{1,3,5}) = " + solution(5, new int[]{2, 4}, new int[]{1, 3, 5}));
        System.out.println("solution(5, new int[]{2,4}, new int[]{3}) = " + solution(5, new int[]{2, 4}, new int[]{3}));
        System.out.println("solution(5, new int[]{2,4}, new int[]{3}) = " + solution(12, new int[]{1, 2, 3, 4, 8, 9, 10, 11}, new int[]{9, 10}));
        System.out.println("solution(5, new int[]{2,4}, new int[]{3}) = " + solution(10, new int[]{5, 7, 9}, new int[]{1, 2, 3, 4, 6, 8}));
        System.out.println("solution(3, new int[]{3}, new int[]{1}) = " + solution(3, new int[]{3}, new int[]{1}));
    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;

        for (int i = 0; i < lost.length; i++) {
            for (int j = answer; j < reserve.length; j++) {
                if (reserve[j] > lost[i] + 2) {
                    break;
                }
                if (reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
                    answer++;
                    break;
                }
            }
        }
        answer += (n - lost.length);
        return answer;
    }
}

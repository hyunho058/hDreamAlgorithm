package khh.fullsearch;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42840?language=java
 * 수포자는 수학을 포기한 사람의 준말입니다. 수포자 삼인방은 모의고사에 수학 문제를 전부 찍으려 합니다. 수포자는 1번 문제부터 마지막 문제까지 다음과 같이 찍습니다.
 * <p>
 * 1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
 * 2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
 * 3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 * <p>
 * 1번 문제부터 마지막 문제까지의 정답이 순서대로 들은 배열 answers가 주어졌을 때, 가장 많은 문제를 맞힌 사람이 누구인지 배열에 담아 return 하도록 solution 함수를 작성해주세요.
 *
 * @author hyunho
 * @since 2021/10/19
 **/
public class MockExam {
    public static void main(String[] args) {
        System.out.println("solution(new int[]{1,2,3,4,5}) = " + Arrays.toString(solution(new int[]{1, 2, 3, 4, 5})));
        System.out.println("solution(new int[]{1,3,2,4,2}) = " + Arrays.toString(solution(new int[]{1, 3, 2, 4, 2})));
    }

    public static int[] solution(int[] answers) {
        int[] answer = {};
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int aAnswer = 0, bAnswer = 0, cAnswer = 0;

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == a[i % a.length]) {
                aAnswer++;
            }
            if (answers[i] == b[i % b.length]) {
                bAnswer++;
            }
            if (answers[i] == c[i % c.length]) {
                cAnswer++;
            }
        }

        int maxNum = Math.max(Math.max(aAnswer, bAnswer), cAnswer);

        ArrayList<Integer> list = new ArrayList<Integer>();
        if (maxNum == aAnswer) {
            list.add(1);
        }
        if (maxNum == bAnswer) {
            list.add(2);
        }
        if (maxNum == cAnswer) {
            list.add(3);
        }
        answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}

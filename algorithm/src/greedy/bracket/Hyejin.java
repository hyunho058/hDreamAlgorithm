package greedy.bracket;

import java.util.Scanner;

//20210729
//https://www.acmicpc.net/problem/1541
public class Hyejin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(bracket(input));

    }

    public static int bracket(String expression) {
        String tmp[] = expression.split("-");
        int answer = 0;
        for (int i = 0; i < tmp.length; i++) {
            if (tmp[i].contains("+")) {
                int sum = 0;
                String[] plusTmp = tmp[i].split("\\+");
                for (String s : plusTmp) {
                    sum += Integer.parseInt(s);
                }
                tmp[i] = String.valueOf(sum);
            }
        }

        answer = Integer.parseInt(tmp[0]);
        for (int i = 1; i < tmp.length; i++) {
            answer -= Integer.parseInt(tmp[i]);
        }
        return answer;
    }

    ///////////////
    //다른사람 풀이
    ///////////////

    public static int bracket2(String expression) {
        int sum = Integer.MAX_VALUE;	// 초기 상태 여부 확인을 위한 값으로 설정

        String[] subtraction =expression.split("-");

        for(int i = 0; i < subtraction.length; i++) {
            int temp = 0;

            // 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰들을 더한다.
            String[] addition = subtraction[i].split("\\+");

            // 덧셈으로 나뉜 토큰들을 모두 더한다.
            for(int j = 0; j < addition.length; j++) {
                temp += Integer.parseInt(addition[j]);
            }

            // 첫 번째토큰인 경우 temp값이 첫 번째 수가 됨
            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        return sum;
    }

}

package khh.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/77484
 */
public class LottoMinMax {

    public static void main(String[] args) {
        System.out.println("solution() = " + solution(new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}));
    }

    public static int[] solution(int[] lottos, int[] win_nums) {
        int zeroCount = 0;
        int sameCount = 0;

        for (int number : lottos) {
            if (number == 0) {
                zeroCount++;
                continue;
            }

            for (int winNumber : win_nums) {
                if (number == winNumber){
                    sameCount++;
                    break;
                }
            }
        }
        return new int[]{7-Math.max(sameCount+zeroCount,1),7-Math.max(sameCount,1)};
    }

}

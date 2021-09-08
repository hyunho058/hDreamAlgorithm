package khh.binary_search;

import java.util.Arrays;

public class Immigration {
    public static void main(String[] args) {
        System.out.println("solution() = " + solution(6, new int[]{7, 10}));
    }

    //https://yubh1017.tistory.com/30
    public static long solution(int n, int[] times) {
        long answer = Long.MAX_VALUE;
        long start = 0;
        long end = Long.MAX_VALUE;
        long midValue;  //심사를 받는데 주어진 시간
        long sum;   //주어진 시간동안 심사를 받을 수 있는 사람 수

        Arrays.sort(times);

        while (start <= end) {
            midValue = (start + end) / 2;
            sum = 0;

            for (int i = 0; i <times.length; i++){
                //주어진 시간동안 몇명 검사 할 수 있는지 누적합
                sum += midValue/times[i];
                if (sum >= n) break;
                System.out.println("sum = " + sum);
            }


            if (n > sum){
                //비교 대상(사람 수)
                //검사 다 못할 때(시간 부족)
                start = midValue+1;
            }else {
                //검사 다 했을 때(시간 남음)
                end = midValue -1;
                answer = Math.min(answer, midValue);
                System.out.println("answer = " + answer);
            }
        }

        return answer;
    }
}

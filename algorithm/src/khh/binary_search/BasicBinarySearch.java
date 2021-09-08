package khh.binary_search;

public class BasicBinarySearch {
    public static void main(String[] args) {
        System.out.println("result1 = " + solution(6, new int[]{1, 2, 3, 4, 5, 6}));
        System.out.println("result2= " + solution(4, new int[]{1, 2, 3, 5, 6, 7}));
        System.out.println("result3= " + solution(4, new int[]{1, 2, 5, 6, 7}));
    }

    public static long solution(int n, int[] times) {
        long answer = 0;

        //이진탐색 이용
        //검사할 배열에 첫자리, 끝자리 를 변수에 담는다.
        //탐색할 배역의 중간 값을 n 갑과 비교 -> 값이 같으면 바로 값 반환, n보다 작으면 n을 마지막 값으로 지정후 해당 반복

        int firstValue = 0;
        int lastValue = times.length - 1;
        int midIdx = 0;

        while (firstValue <= lastValue) {
            midIdx = (lastValue + firstValue) / 2;
            System.out.println("firstValue = " + firstValue + " /lastValue = "+lastValue);

            //n 값과 times 의 값이 같은게 없을 경우 n값이 위치해야 할 index;
            if (firstValue == lastValue){
                if (times[lastValue] > n){
                    answer = midIdx;
                }else {
                    answer = midIdx+1;
                }
            }

            if (times[midIdx] == n) {
                answer = midIdx;
                System.out.println("answer = " + answer);
                break;
            } else if (times[midIdx] < n) {
                firstValue = midIdx + 1;
            } else if (times[midIdx] > n) {
                lastValue = midIdx - 1;
            }
            System.out.println("midIdx = " + midIdx);
        }

        return answer;
    }


}

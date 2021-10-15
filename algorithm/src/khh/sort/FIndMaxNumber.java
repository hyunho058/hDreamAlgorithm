package khh.sort;


import java.util.Arrays;
import java.util.Comparator;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42746?language=java
 * <p>
 * 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
 * <p>
 * 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
 * <p>
 * 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.
 *
 * @author hyunho
 * @since 2021/10/15
 **/
public class FIndMaxNumber {
    public static void main(String[] args) {
        System.out.println("result = " + solution(new int[]{6, 10, 2}));
        System.out.println("result = " + solution(new int[]{3, 30, 34, 5, 9}));
    }

    //1. 내림차순 정렬
    //2. 가장 큰 수부터 answer에 담고 length가 2이상일 경우 Index1 값을 비교한다.
    public static String solution(int[] numbers) {
        String answer = "";
        String[] tempList = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            tempList[i] = String.valueOf(numbers[i]);
        }

        //compareTo() - String 클래스에서 문자열 간 크기(순서)를 비교해주는 메소드
        Arrays.sort(tempList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return ((o2 + o1).compareTo(o1 + o2));
            }
        });

        if (tempList[0].equals("0")){
            return "0";
        }

        for (String s : tempList) {
            answer += s;
        }

        return answer;
    }
}

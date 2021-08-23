package short_term_growth.matrix_squared;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Hyunho {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("resultCount == " + solution(3, new String[]{"alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"}));
        System.out.println("resultCount == " + solution(3, new String[]{"alex111 100", "cheries2 200", "alex111 200", "cheries2 150", "coco 50", "coco 200"}));
        System.out.println("resultCount == " + solution(3, new String[]{"cheries2 200", "alex111 100", "coco 150", "puyo 120"}));

    }

    //2
//    2	["cheries2 200", "alex111 100", "coco 150", "puyo 120"]	3

//    ["alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"]

    public static int solution(int K, String[] user_scores) {
        int answer = 0;
        int count = 1;
        TreeMap<Integer, String> scoreMap = new TreeMap<>();
        List<String> userList = new ArrayList<>();

        String[] firstValue = user_scores[0].split(" ");
        scoreMap.put(Integer.parseInt(firstValue[1]), firstValue[0]);

        for (int i = 1; i < user_scores.length; i++) {
            String[] value = user_scores[i].split(" ");

            for (Integer integer : scoreMap.keySet()) {
                if (scoreMap.get(integer).equals(value[0])) {
                    if (integer < Integer.parseInt(value[1])) {
                        scoreMap.remove(integer);
                        scoreMap.put(Integer.parseInt(value[1]), value[0]);
                        break;
                    }
                } else if (scoreMap.size() < K) {
                    scoreMap.put(Integer.parseInt(value[1]), value[0]);
                    count++;
                    break;
                } else {
                    if (Integer.parseInt(value[1]) > integer) {

                        System.out.println("result == " + integer);
                        scoreMap.remove(integer);
                        scoreMap.put(Integer.parseInt(value[1]), value[0]);
                        count++;

                        break;
                    }
                }
            }
        }
        for (String value : scoreMap.values()) {
            System.out.println("result == " + value);
        }
        answer = count;
        return answer;
    }


    //3
//[4, 2, 2, 5, 3] => [2, 3, 1, 5, 4]
//    public int[] solution(int N, int[] coffee_times) {
//        int[] answer = {};
//        int currentPosition = N;
//
////        PriorityQueue<Integer> jobQueue = new LinkedList<>();
//        List<Integer> jobList = new ArrayList<>();
//        Map<Integer, Integer> jobMap = new HashMap<>();
//        for (int i = 0; i < coffee_times.length; i++){
//            jobMap.put(i, coffee_times[i]);
//            if (i < N){
//                jobList.add(coffee_times[i]);
//            }
//        }
//
//
//        while (true){
//
//        }
//
//
//
//        return answer;
//    }


    //1

    public static int solution(int[] estimates, int k) {
        int answer = 0;
        for (int i = 0; i < estimates.length - (k - 1); i++) {
            int num = 0;
            for (int j = i; j < i + k; j++) {
                num += estimates[j];
//                System.out.println("testn um" + num);
            }
            if (num > answer) answer = num;
        }
        return answer;
    }


    /**
     * https://programmers.co.kr/learn/courses/30/lessons/42586?language=java
     *
     * @author hyunho
     * @since 2021/08/20
     **/
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        int maxJob = 100;
        List<Integer> resultList = new ArrayList<>();
        Queue<Integer> jobQueue = new LinkedList<>();

        for (int i = 0; i < progresses.length; i++) {
            int result = (maxJob - progresses[i]) / speeds[i];
            int resultJob = ((maxJob - progresses[i]) % speeds[i] == 0) ? result : result + 1;
            System.out.println("resultJob == " + resultJob);
            jobQueue.add(resultJob);
        }

        while (jobQueue.size() > 0) {
            int count = 1;
            int firstValue = jobQueue.poll();
            System.out.println("jobQueue.size() == " + jobQueue.size());
            for (int i = 0; i < jobQueue.size(); i++) {
                System.out.println(i + "  /  jobQueue.peek() == " + jobQueue.peek() + " /// firstValue == " + firstValue);
                if (jobQueue.peek() <= firstValue) {
                    jobQueue.poll();
                    --i;
                    count++;
                } else {
                    break;
                }
            }
            resultList.add(count);
        }
        answer = resultList.stream().mapToInt(i -> i).toArray();
        return answer;
    }


    public String[] solution(String[] s) {
        String[] answer = {};
        int tempIdx = 0;
        int strCount = 0;
        boolean tempIdxStatus = false;
        String findStr = "111";
        StringBuilder sb = new StringBuilder();

//        ["1110","100111100","0111111010"]	["1101","100110110","0110110111"]
        for (int i = 0; i < s.length; i++) {
            int startCount = 0;
            String tempStr = s[i];
            while (tempStr.contains("110")) {
                // "110" 가 존재할떄 까지 반복
                for (int j = startCount; j < s.length; j++) {
                    if (s[i].charAt(j) == '1') {
                        sb.append("1");
                        strCount++;
                        if (strCount == 3) {

                        }
                    } else {

                    }
                }
                if (s[i].contains("111")) {

                } else {

                }
            }

        }

        return answer;
    }

    public static String solution(String number, int k) {
        String answer = "";
        String tempNumber = "";
        List<String> valueList = new ArrayList<>();


        while (valueList.size() == number.length() - k) {
            int maxNumber = Integer.parseInt(number.charAt(0) + "");
            int maxNumberIdx = 0;
            for (int i = 1; i < k; i++) {
                //k범위 안에 드는 가장 큰수를 찾는다.
                int num = Integer.parseInt(number.charAt(i) + "");
                if (num > maxNumber) {
                    maxNumber = num;
                    maxNumberIdx = i;
                    valueList.add(String.valueOf(number.charAt(i)));
                    tempNumber = number.substring(0, i);
                    System.out.println("tempNumber == " + tempNumber);
                }
            }
            if (maxNumberIdx == k - 1) {
                answer = number.substring(maxNumberIdx + 1);
                break;
            }
        }


        return answer;
    }

//    public static String solution(String number, int k) {
//        String answer = "";
//        int maxNumber = Integer.parseInt(number.charAt(0)+"");
//        int maxNumberIdx = 0;
//
//        while (answer.length() == number.length()-k){
//
//        }
//        for (int i = 1; i < k; i++){
//            //k범위 안에 드는 가장 큰수를 찾는다.
//            int num = Integer.parseInt(number.charAt(i)+"");
//            if (num > maxNumber){
//                maxNumber = num;
//                maxNumberIdx = i;
//            }
//        }
//        if (maxNumberIdx == k-1){
//            answer = number.substring(maxNumberIdx+1);
//        }
//
//
//        return answer;
//    }

    public static boolean solution(String s) {
        boolean answer = true;
        int leftSize = 0;
        int rightSize = 0;
        if (s.isEmpty()) {
            answer = false;
        } else {
            if (s.length() % 2 == 0) {
                if (s.charAt(s.length() - 1) == '(') {
                    answer = false;
                } else if (s.charAt(0) == '(') {
                    for (int i = 0; i < s.length(); i++) {
                        if (s.charAt(i) == '(') {
                            leftSize++;
                        } else {
                            rightSize++;
                        }
                    }
                    if (leftSize == rightSize) {
                        answer = true;
                    } else {
                        answer = false;
                    }
                } else {
                    answer = false;
                }
            } else {
                answer = false;
            }
        }
        return answer;
    }

    public static int[] solution(int n, int m) {
        int[] answer = {0, 0};
        ;
        int min = (n < m) ? n : m;
        int max = 0;

        for (int i = 1; i <= min; i++) {
            if (n % i == 0 && m % i == 0) {
                max = i;
            }
        }
        answer[0] = max;
        answer[1] = n * m / max;
        return answer;
    }

    public boolean solution(int x) {
        boolean answer = true;
        String tempValue = String.valueOf(x);
        int sum = 0;
        for (int i = 0; i < tempValue.length(); i++) {
            sum += Integer.parseInt(tempValue.charAt(i) + "");
        }

        answer = x % sum == 0;

        return answer;
    }


}

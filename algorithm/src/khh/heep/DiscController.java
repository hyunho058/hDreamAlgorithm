package khh.heep;

import java.util.*;

public class DiscController {

    public static void main(String[] args) {

    }

    public static int solution(int[][] jobs) {
        int answer = 0;
        int currentTime = 0;
        PriorityQueue<Integer> jobQueue = new PriorityQueue<>();
        Map<Integer, Integer> jobMap = new HashMap<>();
        List<Integer> resultJobList = new ArrayList<>();

        for (int i = 0; i < jobs.length; i++) {
            jobQueue.offer(jobs[i][1]);
            jobMap.put(jobs[i][0], jobs[i][1]);
        }

        while (!jobQueue.isEmpty()) {
            int tempValue = jobQueue.poll();
            int startPosition;
            for (Integer value : jobMap.values()) {

            }
            resultJobList.add(calcTime(tempValue, currentTime));
            currentTime += tempValue;
        }

        return answer;
    }

    public static int calcTime(int a, int b){
        int result = a+b;
        return 0;
    }

    public static int resultJobTime(List<Integer> list) {
        int result = 0;

        for (Integer integer : list) {
            result += integer;
        }

        return result / list.size();
    }
}

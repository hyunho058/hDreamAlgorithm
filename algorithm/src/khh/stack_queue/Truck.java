package khh.stack_queue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42583?language=java
 *
 * @author hyunho
 * @since 2021/09/27
 **/
public class Truck {

    public static void main(String[] args) {
        System.out.println("solution(2, 10, new int[7,4,5,6]) = " + solution(2, 10, new int[]{7, 4, 5, 6}));
        System.out.println("solution(100, 100, new int[]{10}) = " + solution(100, 100, new int[]{10}));
        System.out.println("solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}) = " + solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sumWeight = 0;

        Queue<Integer> truckQueue = new LinkedList<>();

        for (int truck_weight : truck_weights) {
            while (true) {
                if (truckQueue.isEmpty()) {
                    //다리가 비어 있을때
                    truckQueue.offer(truck_weight);
                    sumWeight += truck_weight;
                    answer++;
                    break;
                } else if (truckQueue.size() == bridge_length) {
                    //다리가 차있을때
                    sumWeight -= truckQueue.poll();
                } else {
                    //다리에 공간이 있을때
                    if (truck_weight + sumWeight > weight) {
                        //합이 다리 최대 하중을 넘으면
                        truckQueue.offer(0);
                        answer++;
                    } else {
                        truckQueue.offer(truck_weight);
                        sumWeight += truck_weight;
                        answer++;
                        break;
                    }
                }
            }
        }
        return answer + bridge_length;
    }


}

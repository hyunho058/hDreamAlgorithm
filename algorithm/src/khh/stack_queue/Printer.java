package khh.stack_queue;

import java.util.*;

public class Printer {
    public static void main(String[] args) {
        System.out.println("result == "+solution(new int[]{2, 1, 3, 2}, 2));
        System.out.println("result == "+solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
//        System.out.println("result == "+solution(new int[]{1 ,2, 3, 5, 9, 8, 7, 6}, 0));
    }

    public static int solution(int[] priorities, int location) {
        int answer = 0;
        PriorityQueue<Integer> prior = new PriorityQueue<>(Collections.reverseOrder());

        for(int number:priorities){
            prior.offer(number);
        }

        while(!prior.isEmpty()){
            for(int i = 0; i < priorities.length; i++){
                System.out.println("priorities[i] = " + priorities[i] + " /  prior.peek() = " + prior.peek());
                if(prior.peek() == priorities[i]){
                    prior.poll();
                    answer++;
                    System.out.println("location = " + location+"  /  i = " + i);
                    if(location == i){
                        prior.clear();
                        break;
                    }
                    System.out.println("prior.size() = " + prior.size());
                }
            }
        }
        return answer;
    }

//    static public int solution(int[] priorities, int location) {
//        int answer = 0;
//        int locationPosition = location;
//        int[] sortPriorities = priorities.clone();
//        Arrays.sort(sortPriorities);
//        Queue<Integer> jobQueue = new LinkedList<>();
//        for (int i = 0; i < priorities.length; i++) {
//            jobQueue.offer(priorities[i]);
//        }
//        boolean position = false;
//
//        for (int i = sortPriorities.length-1; i > 0; i--) {
//            System.out.println("----------------------sortPriorities[i] = " + sortPriorities[i]+"----------------------");
//            for (int j = 0; j < jobQueue.size(); j++) {
//                int tempValue = jobQueue.poll();
//
//                System.out.println("tempValue = " + tempValue);
//                if (sortPriorities[i] == tempValue) {
//                    if (locationPosition == 0){
//                        position = true;
//                    }
//                    locationPosition--;
//                    System.out.println("--locationPosition poll= " + locationPosition+" --");
//                    break;
//                } else {
//                    jobQueue.offer(tempValue);
//                    if (locationPosition == 0) {
//                        locationPosition = jobQueue.size();
//                    }else {
//                        locationPosition--;
//                    }
//                    System.out.println("--locationPosition = " + locationPosition+" --");
//                }
//            }
//            answer ++;
//            if (position){
//                break;
//            }
//        }
//        return answer;
//    }
}

package programmers;

import java.lang.annotation.ElementType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

//https://programmers.co.kr/learn/courses/30/lessons/42862
public class Gymsuit {


    public static void main(String[] args) {
//        System.out.println(solution(5, new int[]{2, 4}, new int[]{1, 3, 5})); //5
//        System.out.println(solution(5, new int[]{2, 4}, new int[]{3})); //4
//        System.out.println(solution(3, new int[]{3}, new int[]{1})); //2
        System.out.println(solution(3, new int[]{1,2}, new int[]{2,3})); //2
        System.out.println(solution(5, new int[]{2,4}, new int[]{3,1})); //5


    }

    public static int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        HashSet<Integer> resList = new HashSet<>();
        HashSet<Integer> losList = new HashSet<>();

        for (int i : reserve)
            resList.add(i);
        for (int i : lost) {
            if(resList.contains(i))
                resList.remove(i);
            else
                losList.add(i);
        }
        for (int i : lost) {
            if(losList.contains(i)) {
                if(resList.contains(i-1))
                    resList.remove(i-1);
                else if(resList.contains(i+1))
                    resList.remove(i+1);
                else
                    answer--;
            }
        }
        return answer;
    }
}

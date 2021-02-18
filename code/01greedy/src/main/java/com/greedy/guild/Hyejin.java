package com.greedy.guild;

import java.util.HashMap;
import java.util.Map;

public class Hyejin {
    /**
     * MAP 으로 각 값별로 값 저장
     * KEY와 VALUE가 같은 것중 가장 큰 값 반환
     */

    public static void main(String[] args) {

        System.out.println(guild(new int[]{2, 3, 1, 2, 2}));

        System.out.println(guild(new int[]{3, 3,3, 2, 2}));
        System.out.println(guild(new int[]{4, 3,3, 2, 3}));
    }

    public static int guild(int[] people) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        //map에 공포도별 사람 넣기
        for (int person : people) {
            map.put(person, map.getOrDefault(person, 0) + 1);
        }

        //인원수가 되면서 가장 큰 수 찾기
        for(Integer group : map.keySet()){
            int p = map.get(group);
            //그룹이랑 사람 수랑 같은지 비교
            if(p >= group && answer <group){
                answer = group;
            }

        }
        return answer;
    }
}

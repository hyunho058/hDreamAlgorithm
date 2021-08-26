package khh;

import java.util.HashMap;
import java.util.Map;


public class ClothesCombination {
    public static void main(String[] args) {
        System.out.println(solution(new String[][]{{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}}));
        System.out.println(solution(new String[][]{{"crowmask", "face"}, {"bluesunglasses", "face"}, {"smoky_makeup", "face"}}));
    }

    static public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> clothMap = new HashMap<String, Integer>();
        for (int i = 0; i < clothes.length; i++) {
            String key = clothes[i][1];
            clothMap.put(key, clothMap.getOrDefault(key, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : clothMap.entrySet()) {
            answer *= entry.getValue() + 1;
        }
        return answer - 1;
    }
}

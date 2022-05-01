package khh.naver;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class coupon {
    public static void main(String[] args) {
        System.out.println("solution(new String[]{\"A B C D\", \"A D\", \"A B D\", \"B D\"}), 2 = " + solution(new String[]{"A B C D", "A D", "A B D", "B D"}, 2));
        System.out.println("solution" + solution(new String[]{"JAY", "JAY ELLE JAY MAY", "MAY ELLE MAY", "ELLE MAY", "ELLE ELLE ELLE", "MAY"}, 3));

    }
    
    //map 으로 아이들ㄹ key, 쿠폰 받은 수를 value로 한다
    //일자별로 포문을 돌아 아이디가 있으면 value 에 넣는다.
    public static int solution(String[] id_list, int k) {
        int answer = 0;
        Map<String, Integer> userMap = new HashMap<>();
        for (int i = 0; i < id_list.length; i++){
            String[] users = id_list[i].split(" ");
            HashSet<String> hashSet = new HashSet<>(Arrays.asList(users));
            String[] userList = hashSet.toArray(new String[0]);
            for (String s : userList) {
                userMap.put(s, userMap.getOrDefault(s, 0)+1);
                if (userMap.get(s) > k){
                    userMap.put(s, k);
                }
            }
        }

        for (Integer value : userMap.values()) {
            answer += value;
        }

        return answer;
    }
}

package khh.programmers.openchatting;

import java.util.HashMap;
import java.util.Map;

public class OpenChatting {

    public static void main(String[] args) {
        String[] results = solution(new String[]{"Enter uid1234 Muzi", "Enter uid4567 Prodo","Leave uid1234","Enter uid1234 Prodo","Change uid4567 Ryan"});
        for (String result : results){
            System.out.println("result = " + result);
        }
    }

    /**
     *id, name 쌍을 가지는 HashMap을 이용하였다.
     * record를 순회하면서 id, name 쌍을 만들고 요청이 있을 경우 name을 업데이트 한다.
     * name은 변경될 수 있으므로 name대신 id를 넣어서 문자열을 저장해둔다.
     * 순회가 끝난 후 문자열 내 id를 name으로 변경한다.
     */
    public static String[] solution(String[] record) {
        Map<String, String> userMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < record.length; i++) {
            String str = record[i];
            String[] arr = str.split(" ");
            switch (arr[0]){
                case "Enter":
                    stringBuilder.append(arr[1]).append("님이 들어왔습니다.-");
                    userMap.put(arr[1], arr[2]);
                    break;
                case "Leave":
                    stringBuilder.append(arr[1]).append("님이 나갔습니다.-");
                    break;
                case "Change":
                    userMap.put(arr[1], arr[2]);
                    break;
            }
        }

        String str = stringBuilder.toString();
        String[] result = str.split("-");
        for (int i = 0; i < result.length; i++){
            String key = result[i].substring(0, result[i].indexOf("님"));
            result[i] = result[i].replaceAll(key, userMap.get(key));
        }

        return result;
    }
}


package khh.naver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * logs	result
 * ["0001 3 95", "0001 5 90", "0001 5 100", "0002 3 95", "0001 7 80", "0001 8 80", "0001 10 90", "0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90"]	["0001", "0002"]
 * ["1901 1 100", "1901 2 100", "1901 4 100", "1901 7 100", "1901 8 100", "1902 2 100", "1902 1 100", "1902 7 100", "1902 4 100", "1902 8 100", "1903 8 100", "1903 7 100", "1903 4 100", "1903 2 100", "1903 1 100", "1101 1 95", "1101 2 100", "1101 4 100", "1101 7 100", "1101 9 100", "1102 1 95", "1102 2 100", "1102 4 100", "1102 7 100", "1102 9 100"]	["1101", "1102", "1901", "1902", "1903"]
 * ["1901 10 50", "1909 10 50"]	["None"]
 *
 * @author hyunho
 * @since 2021/10/30
**/
public class Exam {

    public static void main(String[] args) {

    }

    public static String[] solution(String[] logs) {
        String[] answer = {};
        HashMap<String, Integer> countMap = new HashMap<>();
        List<String> userCode = new ArrayList<>();

        for (int i = 0; i < logs.length; i++) {
            String[] data = logs[i].split(" ");
            countMap.put(data[0], countMap.getOrDefault(data[0], 0)+1);
        }

        for (String s : countMap.keySet()) {
            if (countMap.get(s) < 5){
                countMap.remove(s);
            }else {
                userCode.add(s);
            }
        }



        return answer;
    }

}

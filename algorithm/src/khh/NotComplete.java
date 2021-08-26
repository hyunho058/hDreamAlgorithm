package khh;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 * https://programmers.co.kr/learn/courses/30/lessons/42576
 *
 * 수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
 *
 * 마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 *
 * 제한사항
 * 마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
 * completion의 길이는 participant의 길이보다 1 작습니다.
 * 참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
 * 참가자 중에는 동명이인이 있을 수 있습니다.
 *
 * @author hyunho
 * @since 2021/08/26
**/
public class NotComplete {
    public static void main(String[] args) {

        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        System.out.println(solution(participant, completion));
    }

    static public String solution(String[] participant, String[] completion) {

        String answer = "";
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        List<String> participantList = Arrays.stream(participant).sorted().collect(Collectors.toList());
        Map<String, Integer> participantMap = new HashMap<>();
        for (String s : participant) {
            participantMap.put(s, participantMap.getOrDefault(s, 0)+1);
        }

        for (String s : completion) {
            participantMap.put(s, participantMap.getOrDefault(s, 0)-1);
        }

        for (String s : participantMap.keySet()) {
            if (participantMap.get(s) != 0){
                answer = s;
            }
        }

        return answer;
    }
}

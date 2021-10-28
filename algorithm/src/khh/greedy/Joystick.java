package khh.greedy;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42860?language=java
 * 조이스틱으로 알파벳 이름을 완성하세요. 맨 처음엔 A로만 이루어져 있습니다.
 * ex) 완성해야 하는 이름이 세 글자면 AAA, 네 글자면 AAAA
 * ▲ - 다음 알파벳
 * ▼ - 이전 알파벳 (A에서 아래쪽으로 이동하면 Z로)
 * ◀ - 커서를 왼쪽으로 이동 (첫 번째 위치에서 왼쪽으로 이동하면 마지막 문자에 커서)
 * ▶ - 커서를 오른쪽으로 이동
 * ASCII 65 ~ 90  78(N)이 center
 *
 * @author hyunho
 * @since 2021/10/27
 **/
public class Joystick {

    public static void main(String[] args) {
//        System.out.println("solution(JEROEN) = " + solution("JEROEN"));
//        System.out.println("solution(BBAAB) = " + solution("BBAAB"));
//        System.out.println("solution(JAN) = " + solution("JAN"));
//        System.out.println("solution(BBAAAAB) = " + solution("BBAAAAB"));
//        System.out.println("solution(BBAAAAABAA) = " + solution("BBAAAAABAA"));
//        System.out.println("----------------------------------------------------------------------");
        System.out.println("solution(BBAAAAABA) = " + solution("BBAAAAABA"));
//        System.out.println("solution(BBAAAAABA) = " + solution("BAAAABAAAB"));
    }

    public static int solution(String name) {
        int answer = 0;
        final int asciiKUnder = 65;
        final int asciiKOver = 91;
        int min = name.length() - 1;// 제일 짧은 좌, 우 이동은 그냥 맨 오른쪽으로 이동할 때
        System.out.println("name = " + name);
        for (int i = 0; i < name.length(); i++) {
            if ((int) name.charAt(i) <= 78) {
                answer += ((int) name.charAt(i) - asciiKUnder);
            } else {
                answer += (asciiKOver - (int) name.charAt(i));
            }
            int nextIndex = i + 1;
            while (nextIndex < name.length() && name.charAt(nextIndex) == 'A') {
                nextIndex++;
            }
            System.out.println("min = " + min);
            min = Math.min(min, (i * 2) + name.length() - nextIndex);
            System.out.println("name.length() = "+name.length()+" / i = " + i + " / nestIndex = "+nextIndex);
            System.out.println("(i*2) = " + (i * 2));
            System.out.println("name.length()-nextIndex = " + (name.length() - nextIndex));
            System.out.println("((i * 2) + name.length() - nextIndex) = " + ((i * 2) + name.length() - nextIndex));
            //ì * 2 : 중간까지 왔다가 다시 뒤로 돌아갈 때의 조이스틱 이동 횟수이
            // name.length() - nextIndex : 예시의 오른쪽에서 두번째의 B같은 애들까지의 위치이다. ex)BBAAAABA
        }
        answer += min;
        return answer;
    }
}

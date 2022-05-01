package khh.programmers;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/72410
 */
public class NewIDRecommendation {

    public static void main(String[] args) {

        System.out.println("solution = " + solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println("solution = " + solution("z-+.^."));
        System.out.println("solution = " + solution("=.="));
        System.out.println("solution = " + solution("123_.def"));
        System.out.println("solution = " + solution("abcdefghijklmn.p"));
        System.out.println("solution = " + solution("aserdyaldeqdle.aser"));
    }

    /**
     * 1단계 new_id의 모든 대문자를 대응되는 소문자로 치환합니다.
     * 2단계 new_id에서 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)를 제외한 모든 문자를 제거합니다.
     * 3단계 new_id에서 마침표(.)가 2번 이상 연속된 부분을 하나의 마침표(.)로 치환합니다.
     * 4단계 new_id에서 마침표(.)가 처음이나 끝에 위치한다면 제거합니다.
     * 5단계 new_id가 빈 문자열이라면, new_id에 "a"를 대입합니다.
     * 6단계 new_id의 길이가 16자 이상이면, new_id의 첫 15개의 문자를 제외한 나머지 문자들을 모두 제거합니다.
     * 만약 제거 후 마침표(.)가 new_id의 끝에 위치한다면 끝에 위치한 마침표(.) 문자를 제거합니다.
     * 7단계 new_id의 길이가 2자 이하라면, new_id의 마지막 문자를 new_id의 길이가 3이 될 때까지 반복해서 끝에 붙입니다.
     */
    public static String solution(String new_id) {
        String answer = "";

        answer = addCharacters(lengthExceeded(emptyCheck(pointTrim(consecutiveCharacters(removeSpecialCharacters(convertToLowercase(new_id)))))));

        return answer;
    }

//    public String solution(String new_id) {
//        String id = new_id.toLowerCase(); // 소문자로
//        id = id.replaceAll("[^-_.a-z0-9]", ""); //-_. 영문자 숫자만 남김
//        id = id.replaceAll("[.]{2,}", "."); // .2개 이상 .으로
//        id = id.replaceAll("^[.]|[.]$", ""); // 처음과 끝 . 제거
//
//        if(id.equals("")) // 빈 문자열이라면 a 추가
//            id += "a";
//
//        if(id.length() >= 16){ // 16자 이상이면 15자로
//            id = id.substring(0, 15);
//            id = id.replaceAll("^[.]|[.]$", ""); // 끝 . 제거
//        }
//        if(id.length() <= 2) // 2자 이하라면 3자까지 마지막 문자추가
//            while(id.length() < 3)
//                id += id.charAt(id.length() - 1);
//
//        return id;
//    }

    public static String convertToLowercase(String str) {
        return str.toLowerCase();
    }

    public static String removeSpecialCharacters(String str) {
        //해당 정규식 이외 문자 제거
        String match = "[^0-9a-zA-Z._\\-]";
        return str.replaceAll(match, "");
    }

    public static String consecutiveCharacters(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        for (int i = 0; i < strBuilder.length() - 1; i++) {
            if (strBuilder.charAt(i) == '.' && strBuilder.charAt(i + 1) == '.') {
                strBuilder.deleteCharAt(i + 1);
                i--;
            }
        }
        return strBuilder.toString();
    }

    public static String pointTrim(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        if (strBuilder.charAt(0) == '.') {
            strBuilder.deleteCharAt(0);
        }
        if (strBuilder.length() > 1) {
            if (strBuilder.charAt(strBuilder.length() - 1) == '.') {
                strBuilder.deleteCharAt(strBuilder.length() - 1);
            }
        }
        return strBuilder.toString();
    }

    public static String emptyCheck(String str){
        if (str.isEmpty()){
            str = "a";
        }
        return str;
    }

    public static String lengthExceeded(String str) {
        if (str.length() > 15) {
            str = str.substring(0, 15);
            if (str.charAt(14) == '.') {
                str = str.substring(0, 14);
            }
        }
        return str;
    }

    public static String addCharacters(String str) {
        StringBuilder strBuilder = new StringBuilder(str);
        int scarceCount = 3 - str.length();
        if (scarceCount > 0) {
            for (int i = 0; i < scarceCount; i++) {
                strBuilder.append(strBuilder.charAt(str.length()-1));
            }
        }
        return strBuilder.toString();
    }

}

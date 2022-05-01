package khh.greedy;

public class MakeBigNumbers {
    public static void main(String[] args) {
        System.out.println("solution(\"1924\", 2) = " + solution("1924", 2).equals("94"));
        System.out.println("solution(\"1231234\",3) = " + solution("1231234", 3).equals("3234"));
        System.out.println("solution(\"4177252841\", 4) = " + solution("4177252841", 4));
        System.out.println("solution(\"4177252841\", 4) = " + solution("4177252841", 4).equals("775841"));
    }

    public static String solution(String number, int k) {
        StringBuilder answer = new StringBuilder();
        int count = number.length() - k;

        while (count > 0) {

        }

        return answer.toString();
    }
}

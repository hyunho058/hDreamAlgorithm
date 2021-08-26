package khh;

import java.util.Arrays;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42577
 *
 * @author hyunho
 * @since 2021/08/26
**/
public class PhoneNumberList {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"119", "97674223", "1195524421"}));
        System.out.println(solution(new String[]{"123","456","789"}));
        System.out.println(solution(new String[]{"12","123","1235","567","88"}));
    }

    static public boolean solution(String[] phone_book) {
        System.out.println(Arrays.toString(Arrays.stream(phone_book).toArray()));
        Arrays.sort(phone_book);
        System.out.println(Arrays.toString(Arrays.stream(phone_book).toArray()));
        for (int i = 0; i < phone_book.length-1; i++){
            if (phone_book[i].startsWith(phone_book[i+1])){
                return false;
            }
        }
        return true;
    }
}

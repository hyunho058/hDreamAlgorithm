package implementation.stringSorting;

import java.util.Arrays;
import java.util.Scanner;

public class Hyunho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String mStr = scanner.next();
        System.out.println("RESULT === "+resultSort(mStr.toUpperCase()));
    }

    public static String resultSort(String str){
        String result = "";
        int sumNumber = 0;
        String[] strList = str.split("");
        Arrays.sort(strList);;

        for (int i = 0; i < strList.length; i++){
            if ((int)strList[i].charAt(0) >= 40 && (int)strList[i].charAt(0) <= 57){
                sumNumber += Integer.parseInt(strList[i]);
            }else {
                result += strList[i];
            }
        }
        return  result+sumNumber;
    }
}

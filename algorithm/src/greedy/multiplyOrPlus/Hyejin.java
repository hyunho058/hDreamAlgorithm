package greedy.multiplyOrPlus;

import java.lang.reflect.AnnotatedArrayType;
import java.util.Arrays;

public class Hyejin {

    public static void main(String[] args) {

        System.out.println(StringmultipleyOrPluse("02984"));
        System.out.println(StringmultipleyOrPluse("567"));

    }

    public static int StringmultipleyOrPluse(String s) {

        int answer = 0;

        int[] sArray = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            sArray[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        Arrays.sort(sArray);

        for(int i = sArray.length-1; i>=0; i--){
            if(sArray[i]<=1 || answer==0) answer+= sArray[i];
            else answer *= sArray[i];
        }

        return answer;

    }
}

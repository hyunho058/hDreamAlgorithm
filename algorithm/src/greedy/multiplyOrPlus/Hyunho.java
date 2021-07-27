package greedy.multiplyOrPlus;

import java.util.Scanner;

public class Hyunho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numList = scanner.next();
        scanner.nextLine();
        int resultSum = 0;

        for (int i=0; i<numList.length(); i++){

            //값이 20억 이 넘어가게 되면 이전 으로 돌아감.
            if (resultSum > 200000000){
                i--;
                continue;
            }

            if (i == 0){
                resultSum = Character.getNumericValue(numList.charAt(i));
            }else {
                // Number 1보다 작거나 같으면 +, 이외 는 모두 *
                if (Character.getNumericValue(numList.charAt(i)) <= 1 || resultSum == 0){
                    resultSum += Character.getNumericValue(numList.charAt(i));
                } else {
                    resultSum *= Character.getNumericValue(numList.charAt(i));
                }
            }

        }

        System.out.println("RESULT============ "+resultSum);
    }
}

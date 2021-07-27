package greedy.numCardGame;

import javax.accessibility.AccessibleAction;
import java.util.Arrays;
import java.util.Scanner;

public class Hyejin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("열");
        int column = sc.nextInt();
        System.out.println("행");
        int row = sc.nextInt();

        int[][] cardArray = new int[column][row];
        int i = 0;
        while (column > i) {

            int k = 0;
            while (row > k) {
                System.out.println(i +  "," + k + " 값 입력");
                cardArray[i][k] = sc.nextInt();
                k++;
            }
            i++;
        }
        System.out.println("============결과==========");
        System.out.println(numCardGame(cardArray));

        sc.close();


//        int[][] cardArray = {{3, 1, 2}, {4, 1, 4}, {2, 2, 2}};
//        System.out.println(numCardGame(cardArray));
//
//        int[][] cardArray2 = {{7, 3, 1, 8}, {3, 3, 3, 4}};
//        System.out.println(numCardGame(cardArray2));


    }

    public static int numCardGame(int[][] cardArray) {
        int answer = 0;
        for (int i = 0; i < cardArray.length; i++) {
            Arrays.sort(cardArray[i]);
            answer = answer < cardArray[i][0] ? cardArray[i][0] : answer;
        }

        return answer;

    }
}

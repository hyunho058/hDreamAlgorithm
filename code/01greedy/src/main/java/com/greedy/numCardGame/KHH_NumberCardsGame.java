package greedy;

import java.util.Scanner;

public class NumberCardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int[][] numList = new int[N][M];

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++){
                numList[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Result === "+getMaxNum(numList));
    }

    public static int getMaxNum (int[][] numList){
        int resultNum = 0;

        for (int i = 0; i < numList.length; i++){
            int tempNum = numList[i][0];

            for (int j = 0; j < numList[i].length; j++){
                if (tempNum > numList[i][j]){
                    tempNum = numList[i][j];
                }
            }
            if (i == 0){
                resultNum = tempNum;
            }
            if (tempNum > resultNum){
                resultNum = tempNum;
            }
        }
        return resultNum;
    }
}

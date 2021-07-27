package implementation.upDownLeftRight;

import java.util.Scanner;

public class hyunho {
    public static void main(String[] args) {
        int N = 0;
        String mMovePlan = "";
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        mMovePlan = scanner.next();
        scanner.nextLine();

        int [] result = getPosition(N, mMovePlan.trim().replaceAll(" ","").toUpperCase());
        System.out.println("RESULT === "+result[0]+" "+result[1]);
    }

    //L - left, R - right, U - up, D - down 문자 별로 좌표 이동
    public static int[] getPosition(int n, String movePlan){

        int[] userPosition = {1,1};
        for (int i = 0; i < movePlan.length(); i++){
            switch (String.valueOf(movePlan.charAt(i))){
                case "R":
                    if (userPosition[1] < n) {
                        userPosition[1] += 1;
                        System.out.println("DATA1 === "+userPosition[1]);
                    }
                    break;
                case "L":
                    if (userPosition[1] > 1) {
                        userPosition[1] -= 1;
                        System.out.println("DATA2 === "+userPosition[1]);
                    }
                    break;
                case "U":
                    if (userPosition[0] > 1) {
                        userPosition[0] += 1;
                        System.out.println("DATA3 === "+userPosition[0]);
                    }
                    break;
                case "D":
                    if (userPosition[0] < n) {
                        userPosition[0] += 1;
                        System.out.println("DATA4 === "+userPosition[0]);
                    }
                    break;
            }
        }
        return userPosition;
    }
}
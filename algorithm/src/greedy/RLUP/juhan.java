package greedy.RLUP;

import java.util.Scanner;

public class juhan {

    public static void main(String[] args) {
        System.out.println("N 값을 입력");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("이동 방향을 입력.");
        String moveInput = sc.next();


        System.out.println("결과 : " + solution(n,moveInput) );
    }

    public static String solution(int n, String moveInput){
        String result = "";
        int x = 1;
        int y = 1;
        char[] arr = new char[moveInput.length()];

        for(int i = 0; i < moveInput.length(); i ++){
            arr[i] =  moveInput.charAt(i);
        }// 배열에 값 넣기

        for(int i = 0; i < arr.length; i ++){
            if(x!=1&&arr[i]=='L'){
                x--;
            }else if(x<n&&arr[i]=='R'){
                x++;
            }else if(y!=1&&arr[i]=='U'){
                y--;
            }else if(y<n&&arr[i]=='D'){
                y++;
            }
        }
        result = "x = "+ x + "y = " + y;
        return result;
    }
}

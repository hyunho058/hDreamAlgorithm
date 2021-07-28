package greedy.multiplyOrPlus;


import java.util.Scanner;

public class Juhan {

    public static void main(String[] args) {
        System.out.println("입력 문자열을 넣어주세요.");
        Scanner sc = new Scanner(System.in);

        String sInputValue = ""; // 입력 값
        sInputValue = sc.nextLine();

        System.out.println("최대 값 = " + solution(sInputValue));

    }

    public static String solution(String s){
        int inputInt = Integer.parseInt(s); // 입력 받은 수를 인트로 변환.
        int[] arr = new int[s.length()+1];
        int result = 0;

        for(int i = s.length(); i > 0; i --){
          arr[i-1] = inputInt % 10;
          inputInt = inputInt / 10;
        }//arr 배열에 하나씩 입력 받기.
        if (arr.length % 2 != 0) {
            arr[arr.length] = 0;
        }// 짝수 단위로 계산을 위해서 길이가 홀수 인경우 ex.(1,2,3) 0을 추가하여 1,2,3,0 으로 만들어준다.

        for(int i = 0; i < s.length(); i+=2){
            if(arr[i] != 0 && arr[i+1] != 0 && arr[i] != 1 && arr[i] != 1){
                if (result==0){
                    result = result + (arr[i] * arr[i+1]);
                }else{
                    result = result * (arr[i] * arr[i+1]);
                }
            }else {
                if(result==0) {
                    result = result + (arr[i] + arr[i + 1]);
                }else {
                    result = result * (arr[i] + arr[i + 1]);
                }
            }
        }
        return Integer.toString(result);
    }//알고리즘.
    /*
    * 만약 배열이 짝수면 그냥 진행 홀수면 0을 추가하여 진행.
    * 배열의 0,1 / 2,3 / 4,5 .... N-1, N 의 인덱스의 값을 연산. 하면서 Result 값을 계속 증가하면서 계산.
     */

}

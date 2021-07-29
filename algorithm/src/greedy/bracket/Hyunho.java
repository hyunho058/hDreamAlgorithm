package greedy.bracket;

import java.util.Scanner;

public class Hyunho {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] tempValue = scanner.nextLine().split("-");

        System.out.println(bracket(tempValue));
    }


    public static int bracket(String[] valueList){
        int result = 0;

        for (int i = 0; i < valueList.length; i++){

            String[] addTemp = valueList[i].split("\\+");
            if (addTemp.length > 1){
                //split을 통해 '+'가 포함되어 있으면 해당 값을 연산
                int temp = 0;
                for (int j = 0; j < addTemp.length; j++){
                    temp += Integer.parseInt(addTemp[j]);
                }
                valueList[i] = String.valueOf(temp);
            }
            if (i == 0){
                //첫번째 값 저장
                result = Integer.parseInt(valueList[0]);
            }else {
                result -= Integer.parseInt(valueList[i]);
            }
        }

        return result;
    }
}

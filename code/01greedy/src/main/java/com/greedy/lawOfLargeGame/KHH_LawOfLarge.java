import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class LawOfLarge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int K = scanner.nextInt();

//        String temp = scanner.nextLine().trim();
//        String[] tempList = temp.split(" ");
//        for (String number : tempList){
//            numList.add(Integer.parseInt(number));
//        }

        for (int i = 0; i < N; i++) {
            numList.add(scanner.nextInt());
        }

        System.out.println("RESULT=="+getResult(numList, M, K));
    }

    public static int getResult(ArrayList<Integer> numList, int M, int K){
        int sum = 0;
        int count = 0;
        numList.sort(Comparator.naturalOrder());

        for (int i = 0; i < M; i++){
            if (count != K){
                sum += numList.get(numList.size()-1);
                count++;
            }else {
                sum += numList.get(numList.size()-2);
                count = 0;
            }
        }
        return sum;
    }
}

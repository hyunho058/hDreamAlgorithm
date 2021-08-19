package short_term_growth.tell_center;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * No.1655
 * https://www.acmicpc.net/problem/1655
 *
 * @author hyunho
 * @since 2021/08/19
**/
public class Hyunho {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<Integer> valueList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int value = Integer.parseInt(br.readLine());

            if (i % 2 == 0) {
                maxPQ.add(value);
            } else {
                minPQ.add(value);
            }

            if (!maxPQ.isEmpty() && !minPQ.isEmpty()) {
                if (maxPQ.peek() > minPQ.peek()) { // swap
                    int tmp = maxPQ.poll();
                    maxPQ.add(minPQ.poll());
                    minPQ.add(tmp);
                }
            }
            sb.append(maxPQ.peek()).append("\n");

//            valueList.add(value);
//            sb.append(centerValue(valueList)).append("\n");
        }
        System.out.println(sb);
    }


    //시간초과 코드...
    static int centerValue(List<Integer> values) {
        int value = 0;
        int centerNum = 0;
        if (values.size() == 1) {
            value = values.get(0);
        } else {
            values.sort(Comparator.naturalOrder()); //sort
            if (values.size() % 2 == 1) {
                //홀수
                centerNum = values.size() / 2;
                value = values.get(centerNum);
            } else {
                //짝수
                centerNum = values.size() / 2;
                value = values.get(centerNum - 1);
            }
        }
        return value;
    }
}

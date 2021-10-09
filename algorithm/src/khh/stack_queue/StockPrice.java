package khh.stack_queue;

import java.util.Arrays;
import java.util.Stack;

/**
 * https://programmers.co.kr/learn/courses/30/lessons/42584
 *  
 * @author hyunho
 * @since 2021/09/28 
**/
public class StockPrice {
    public static void main(String[] args) {
        Arrays.stream(solution(new int[]{1, 2, 3, 2, 3}))
                .forEach(list -> System.out.println(list));
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        while (!stack.isEmpty()){
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }

        return answer;
    }
}

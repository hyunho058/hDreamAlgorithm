package khh.fullsearch;

public class FindPrime {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("result = "+solution.solution("17"));
        Solution solution1 = new Solution();
        System.out.println("result = "+solution1.solution("011"));
    }
}

class Solution {
    private boolean[] comb = new boolean[10000000];
    private boolean[] taken = new boolean[7];
    private String num;

    public int solution(String numbers) {
        int ans = 0;
        num = numbers;
        numberOfCases("", 0);
        for (int i = 2; i < 10000000; i++) {
            if (comb[i] && isPrime(i)) {
                ans++;
            }
        }
        return ans;
    }

    public boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
//            System.out.println("num is = " + num+" / i is = "+i);
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void numberOfCases(String str, int idx) {
        System.out.println("str = " + str+" / idx = " + idx);
        // 1. 재귀 함수 탈출 조건
        if (idx == num.length() + 1) {
            return;
        }
        // 2. 현재까지 조합된 숫자를 comb 배열에 표시
        if (!str.equals("")) {
            int num = Integer.parseInt(str);
            comb[num] = true;
        }
        // 3. 0 ~ n-1 까지의 숫자카드 중 아직 사용되지 않은 카드를 하나씩 사용하여 붙여서 다음 재귀로 넘기기
        for (int i = 0; i < num.length(); i++) {
            if (!taken[i]) {
                taken[i] = true;
                numberOfCases(str + num.charAt(i), idx + 1);
                taken[i] = false;
            }
        }
    }
}

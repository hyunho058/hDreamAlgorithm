package khh.naver;

/**
 * n	jump	result
 * 5	3	[5,2]
 * 4	1	[3,2]
 * 3	10	[2,1]
 *
 * @author hyunho
 * @since 2021/10/30
**/
public class Jump {

    public static void main(String[] args) {
        System.out.println("solution(5,3) = " + solution(5, 3));
        System.out.println("solution(4,1) = " + solution(4, 1));
        System.out.println("solution(3,10) = " + solution(3, 10));
    }

    public static int[] solution(int n, int jump) {
        int[] answer = {};
        int[] jumps = new int[n * n];
        int[][] jumpList = new int[n][n];
        int count = 1;

        while (count <= jumps.length) {
            for (int i = 0; i < jumps.length; i += jump) {
                System.out.println("jumps[i] = " + jumps[i]);
                if (jumps[i] == 0) {
                    jumps[i] = count++;
                } else {
                    i = i - jump - 1;
                }

            }
        }

        for (int i : jumps) {
            System.out.println("i = " + i);
        }

        answer = new int[]{0, 0};
        return answer;
    }

}

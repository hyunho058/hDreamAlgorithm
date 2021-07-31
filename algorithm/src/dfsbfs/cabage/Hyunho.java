package dfsbfs.cabage;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1012
public class Hyunho {

    static int testCount = 0;
    static int m[];
    static int n[];
    static int k[];

    static boolean[][] mapList;
    static boolean[][] visited;

    private static final int[] moveX = {0, 0, 1, -1};
    private static final int[] moveY = {1, -1, 0, 0};

    static int visitCount[];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        testCount = scanner.nextInt();

        m = new int[testCount];
        n = new int[testCount];
        k = new int[testCount];
        visitCount = new int[testCount];

        //테스트 케이스 수 만큼 반복
        for (int i = 0; i < testCount; i++) {
            m[i] = scanner.nextInt();
            n[i] = scanner.nextInt();
            k[i] = scanner.nextInt();
            visited = new boolean[m[i]][n[i]];
            mapList = new boolean[m[i]][n[i]];
            scanner.nextLine();
            for (int j = 0; j < k[i]; j++) {
                String temp = scanner.nextLine().trim();
                mapList[Integer.parseInt(temp.charAt(0)+"")][Integer.parseInt(temp.charAt(1)+"")] = true;
            }
            for (int j1 = 0; j1 < m[i]; j1++) {
                for (int j2 = 0; j2 < n[i]; j2++) {
                    if (mapList[j1][j2] && !visited[j1][j2]) {
                        visitCount[i]++;
                        dfs(i, j1, j2);
                    }
                }
            }

            if (i == testCount-1){
                for (int value : visitCount){
                    System.out.println(value);
                }

            }

        }
    }

    public static void dfs(int count, int x, int y) {
        visited[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int resultX = x + moveX[i];
            int resultY = y + moveY[i];
            if (resultX >= 0 && resultY >= 0 && resultX < m[count] && resultY < n[count]) {
                if (mapList[resultX][resultY] && !visited[resultX][resultY]) {
                    dfs(count, resultX, resultY);
                }
            }
        }
    }


    //TEST DATA//
//            m = 5;
//            n = 3;
//            k = 6;
//            visited = new boolean[m][n];
//            mapList = new boolean[m][n];
//            mapList[0][2] = true;
//            mapList[1][2] = true;
//            mapList[2][2] = true;
//            mapList[3][2] = true;
//            mapList[4][2] = true;
//            mapList[4][0] = true;

//            m = 10;
//            n = 10;
//            k = 1;
//            visited = new boolean[m][n];
//            mapList = new boolean[m][n];
//            mapList[5][5] = true;

//            m = 10;
//            n = 8;
//            k = 17;
//            visited = new boolean[m][n];
//            mapList = new boolean[m][n];
//            mapList[0][0] = true;
//            mapList[1][0] = true;
//            mapList[1][1] = true;
//            mapList[4][2] = true;
//            mapList[4][3] = true;
//            mapList[4][5] = true;
//            mapList[2][4] = true;
//            mapList[3][4] = true;
//            mapList[7][4] = true;
//            mapList[8][4] = true;
//            mapList[9][4] = true;
//            mapList[7][5] = true;
//            mapList[8][5] = true;
//            mapList[9][5] = true;
//            mapList[7][6] = true;
//            mapList[8][6] = true;
//            mapList[9][6] = true;


}
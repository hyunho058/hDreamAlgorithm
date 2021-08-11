package dfsbfs.cabage;

import java.util.Scanner;

//https://www.acmicpc.net/problem/1012
public class Hyejin {
    //상하좌우 표현
    static int[] width = {0, 0, 1, -1};
    static int[] hight = {1, -1, 0, 0};
    static int[][] field; //배추밭
    static boolean[][] isVisit; //방문 체크
    static int M;// 배추 밭 가로 길이
    static int N; //배추 밭 세로 길이
    static int K; //배추 심어진 개수

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt(); //테스트 케이스의 개수
        for (int tc = 0; tc < t; tc++) {

            M = sc.nextInt(); //배추 밭의 가로길이
            N = sc.nextInt(); //배추 밭의 세로길이
            K = sc.nextInt(); //배추가 심어진 개수

            field = new int[M][N]; //배추밭 생성
            isVisit = new boolean[M][N]; //isVisit

            //값 세팅
            for (int i = 0; i < K; i++) {
                field[sc.nextInt()][sc.nextInt()] = 1;
            }

            int count = 0; //구역 개수

            //배추밭에서 방문 안한곳, 배추가 있는 곳을 탐색한다
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    //방문안한곳, 배추가 있는 곳 탐색
                    if (!isVisit[i][j] && field[i][j] == 1) {
                        cabage(i, j);
                        count++; //지렁이 카운트
                    }
                }

            }
            System.out.println(count);
        }

    }

    //상하좌우를 탐색하며 이어져있는 배추가 있는지 탐색한다
    private static void cabage(int i, int j) {
        isVisit[i][j] = true;

        //상하좌우 탐색
        for (int move = 0; move < 4; move++) {
            int moveI = i + width[move];
            int moveJ = j + hight[move];
            //유효 값 체크
            if (moveI >= 0 && moveJ >= 0 && moveI < M && moveJ < N) {
                //배추가 있고 방문하지 않은 곳이면 탐색
                if (!isVisit[moveI][moveJ] && field[moveI][moveJ] == 1) {
                    cabage(moveI, moveJ);
                }
            }
        }

    }

}



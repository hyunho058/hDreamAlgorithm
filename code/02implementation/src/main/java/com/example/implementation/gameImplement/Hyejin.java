package com.example.implementation.gameImplement;

public class Hyejin {
    //캐릭터의 방향, 위치
    static int characterdirection = 0;
    static int characterX = 0;
    static int characterY = 0;

    //이동 - 북동남서
    //x축
    static int[] moveX = {0, -1, 0, 1};
    //y축
    static int[] moveY = {-1, 0, 1, 0};

    //맵
    static int[][] map = new int[50][50];
    static int[][] characterVisit = new int[50][50];


    public static void main(String[] args) {

        int[][] map = {{1, 1, 1, 1}, {1, 0, 0, 1}, {1, 1, 0, 1}, {1, 1, 1, 1}};
        int[] caracterPosition = {1, 1, 0};

        System.out.println(gameImp(map, caracterPosition)
        );
    }

    /**
     * 캐릭터가 왼쪽으로 이동
     * 이동 가능한지 판별
     * 네방향 다 이동 못하면 뒤로 이동
     * 뒤로 이동 가능하면 이동
     * 바다면 break
     */
    public static int gameImp(int[][] map, int[] characterPosition) {
        //값 설정
        characterX = characterPosition[0];
        characterY = characterPosition[1];
        characterdirection = characterPosition[2];
        //현재 위치 방문처리
        characterVisit[characterX][characterY] = 1;


        //이동
        int moveCnt = 1;
        int turnTime = 0;
        while (true) {
            //왼쪽으로 이동
            turnLeft();
            int tempX = characterX + moveX[characterdirection];
            int tempY = characterY + moveY[characterdirection];

            //가보지 않은 곳이고 바다가 아닌 경우
            if (characterVisit[tempX][tempY] == 0 && map[tempX][tempY] == 0) {
                moveCnt++;
                characterVisit[tempX][tempY] = 1;
                characterX = tempX;
                characterY = tempY;
                turnTime = 0;
            } else turnTime++;

            //네방향 다 못갈 경우
            if (turnTime >= 4) {
                //되돌아가기
                tempX = characterX - moveX[characterdirection];
                tempY = characterY - moveY[characterdirection];

                //뒤로 이동할 수 있으면 뒤로

                if (map[tempX][tempY] == 0) {
                    characterX = tempX;
                    characterY = tempY;
                } else break;
                turnTime = 0;
            }


        }


        return moveCnt;
    }

    //왼쪽으로 돌리기
    public static void turnLeft() {
        characterdirection -= 1;
        if (characterdirection == -1) characterdirection = 3;
    }


}

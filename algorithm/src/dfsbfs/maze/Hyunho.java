package dfsbfs.maze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Hyunho {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] mazeSize = br.readLine().split(" ");
        int n = Integer.parseInt(mazeSize[0]);
        int m = Integer.parseInt(mazeSize[1]);
        int[][] mazeList = new int[n][m];

        for (int i = 0; i < n; i++){
            String row = br.readLine();
            for (int j = 0; j < m; j++){
                mazeList[i][j] = row.charAt(j) - '0';   //???
            }
        }

        int result = bfs(n, m, mazeList);
        System.out.println(result);
    }


    public static int bfs(int n, int m, int[][] mazeList){
        final int[] moveX = {0, 0, 1, -1};
        final int[] moveY = {1, -1, 0, 0};

        Queue<Point> pointQueue = new LinkedList<>();
        mazeList[0][0] = 0;
        pointQueue.add(new Point(0,0,1));

        while (!pointQueue.isEmpty()){
            Point point = pointQueue.poll();

            if (point.x == n-1 && point.y == m-1){
                return point.count;
            }

            for (int i = 0; i < 4; i++){
                int nx = point.x + moveX[i];
                int ny = point.y + moveY[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m){
                    if (mazeList[nx][ny] == 1){
                        mazeList[nx][ny] = 0;
                        pointQueue.add(new Point(nx, ny, point.count+1));
                    }
                }
            }
        }
        return 0;

    }

    //(x, y)좌표갑과 현재까지 이동한 칸의 수 를 저장
    static class Point {
        int x, y, count;

        public Point(int x, int y, int count) {
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}

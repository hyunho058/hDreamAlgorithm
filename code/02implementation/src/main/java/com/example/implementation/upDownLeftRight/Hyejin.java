package com.example.implementation.upDownLeftRight;

public class Hyejin {

    public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        String arr[] = new String[n];
//        for(int i = 0; i< n; i++){
//            arr[i]= sc.nextLine();
//        }
//
//        System.out.println(upDownLeftRtight(n,arr));

        //testcase
        System.out.println(upDownLeftRtight(5, new String[]{"R", "R", "R", "U", "D", "D"}));
        System.out.println(upDownLeftRtight2(5, new String[]{"R", "R", "R", "U", "D", "D"}));
        System.out.println(upDownLeftRtight(5, new String[]{"U", "R", "R", "U", "D", "D", "L"}));
        System.out.println(upDownLeftRtight2(5, new String[]{"U", "R", "R", "U", "D", "D", "L"}));



    }

    /**
     * r
     * <p>
     * 모험가의 위치 x,y
     * arr의 값을 하나씩 꺼내서 이동
     * r -> 열 증가
     * l -> 열 감소
     * u -> 행 감소
     * d -> 행 증가
     * 이 때 0미만 N초과일 경우는 값 증가x
     */

    public static String upDownLeftRtight(int n, String arr[]) {
        //모험가의 현재 위치
        int x = 1;
        int y = 1;
        //모험가가 움직이는 중
        for (int i = 0; i < arr.length; i++) {

            String act = arr[i];

            switch (act) {
                case "R":
                    if (x == n) continue;
                    x++;
                    break;
                case "L":
                    if (x == 1) continue;
                    x--;
                    break;
                case "U":
                    if (y == 1) continue;
                    y--;
                    break;
                case "D":
                    if (y == n) continue;
                    y++;
                    break;
            }


        }
        return y + " " + x;
    }

    /**
     *
     * 풀이
     *
     * 1. 방향 배열 만들기
     * 2. 방향 마다 x,y 이동 배열 만들기
     * 3. 이동하는 arr를 하나씩 꺼냄
     * 4. 반복문으로 arr의 값에 해당하면 작업 수행
     * 5. 만약 이동하는게 0이나 n초과면 return
     *
     */

    public static String upDownLeftRtight2(int n, String arr[]) {
        //방향배열, 이동배열 만들기
        String[] move = {"L","R","U","D"};
        int [] xMove = {-1,1,0,0};
        int [] yMove = {0,0,-1,1};

        int x=1,y = 1;

        //값 하나씩 꺼내서 이동하기
        for(int i = 0; i< arr.length; i++){
            String movNow = arr[i];

            //어디로 이동했는지 찾기, 이동시키기
            int mx=0, my = 0;
            for(int j = 0; j<move.length; j++){
                if(move[j].equals(movNow)) {
                    mx = x + xMove[j];
                    my = y + yMove[j];
                    break;
                }
            }
            // 크기 벗어나면 안더함
            if(mx<1 || mx >n || my <1 || my >n) continue;
            //이동
            x =mx;
            y = my;

        }


        return y + " " + x;
    }
}

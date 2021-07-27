package implementation.knight;

public class Hyejin {


    public static void main(String[] args) {
        System.out.println(knight("a1"));

    }


    public static int knight(String s){
        int answer=  0;

        //현재의 위치를 숫자로 바꾸기
        char nowY = s.charAt(1);
        char nowX = (char) (s.charAt(0) - 48);

        //이동할 수 있는 경우의 수

        int move[][] = {{2,1}, {2,-1}, {1,2}, {1,-2}, {-2,1}, {2,-1}, {-1,-2}, {-1,2}};

        //현재 위치랑 비교

        for(int i = 0; i< move.length; i++) {
            int moveX = Integer.parseInt(nowX+"") + move[i][0];
            int moveY = Integer.parseInt(nowY+"") + move[i][1];

            //가능하면 경우의 수 증가
            if(moveX <=0 || moveX >8 || moveY <=0 || moveY >8) continue;
            answer++;

        }





        return answer;
    }

}

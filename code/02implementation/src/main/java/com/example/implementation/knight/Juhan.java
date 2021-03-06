package com.example.implementation.knight;


import java.util.Scanner;

public class Juhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 값 : ");
        String inputDat = sc.nextLine();
        int x = inputDat.charAt(0);
        int y = inputDat.charAt(1);
        if(x == 'A' || x == 'a'){
            x = 0;
        }else if (x == 'B' || x == 'b'){
            x = 1;
        }else if (x == 'C' || x == 'c'){
            x = 2;
        }else if (x == 'D' || x == 'd'){
            x = 3;
        }else if (x == 'E' || x == 'e'){
            x = 4;
        }else if (x == 'F' || x == 'f'){
            x = 5;
        }else if (x == 'G' || x == 'g'){
            x = 6;
        }else if (x == 'H' || x == 'h'){
            x = 7;
        }else {
            System.out.println("Err : X 축 입력초과");
        }
        // 질문 : y 를 유니코드 값에서 빼는거 말고 정수형으로 변환이 가능???
        y -= 48;
        x += 1;

        System.out.println("결과 : " + solution(x,y));
    }
    public static int solution(int x, int y){
       int result = 0;
       System.out.println("x = " + x + "Y = " + y);
       if(x>4&&y>4){
           if(x>7&&y>7){
               result = 8;
           }else result = 6;
       }if(x<3&&y<3){
           if((x==2&&y==2)||(x==2&&y==7)||(x==7&&y==2)||(x==7&&y==7)){
               result = 4;
           }if((x==1&&y==1)||(x==1&&y==8)||(x==8&&y==1)||(x==8&&y==8)){
                result = 2;
           }else result = 4;
        }
        return result;
    }

}

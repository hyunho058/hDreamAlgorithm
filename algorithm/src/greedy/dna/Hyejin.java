package greedy.dna;

import java.util.Arrays;
import java.util.Scanner;

//https://www.acmicpc.net/problem/1969
public class Hyejin {
    static int N = 0;
    static int M = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        String [] stringArr = new String[N];
        String[][] arr = new String[N][M];
        sc.nextLine();
        for(int i = 0; i<N; i++){
            stringArr[i] = sc.nextLine();
        }

        for(int i = 0; i<N; i++){
            arr[i] = stringArr[i].split("");
        }

//        N = 5;
//        M = 8;

//        String[][] arr = {
//                {
//                        "T", "A", "T", "G", "A", "T", "A", "C"},
//                {"T", "A", "A", "G", "C", "T", "A", "C"},
//                {"A", "A", "A", "G", "A", "T", "C", "C"},
//                {"T", "G", "A", "G", "A", "T", "A", "C"},
//                {"T", "A", "A", "G", "A", "T", "G", "T"}
//        };

        dna(arr);

    }

    public static void dna(String[][] arr) {
        int hd = 0;
        //각 문자별 해밍거리를 구한다
        for (int i = 0; i < M; i++) {
            int a = 0, t = 0, g = 0, c = 0;

            for (int j = 0; j < N; j++) {
                switch (arr[j][i]) {
                    case "A":
                        a++;
                        break;
                    case "T":
                        t++;
                        break;
                    case "G":
                        g++;
                        break;
                    case "C":
                        c++;
                        break;
                }
            }

            int max = Math.max(a > c ? a : c, g > t ? g : t);

            hd += (N - max);

            System.out.print(toChar(a, t, g, c, max));

        }
        System.out.print("\n" + hd);
    }

    private static char toChar(int a, int t, int g, int c, int max) {
        if (max == a) return 'A';
        else if (max == c) return 'C';
        else if (max == g) return 'G';
        else return 'T';
    }
}



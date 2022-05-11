package com.example.hdreamalgorithm.greedy.competition;

import java.util.Scanner;

//test case//
// 6 3 2 => 2
// 2 1 1 => 0
public class Hyunho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int teamCCount = 0;
        teamCCount = createTeam(n, m, teamCCount);
        System.out.println("teamCCount = " + teamCCount);

        int remain = n - (teamCCount * 2) + (m - teamCCount);
        System.out.println("remain = " + remain);
        if (remain < k) {
            k = k - remain;
            while (k > 0){
                teamCCount--;
                k = k -3;
            }
        }
        System.out.println("teamCCount = " + teamCCount);
    }

    public static int createTeam(int n, int m, int teamCount) {
        System.out.println("n = " + n + ", m = " + m + ", teamCount = " + teamCount);
        if (n >= 2 && m > 0) {
            n = n - 2;
            m--;
            teamCount++;
            return createTeam(n, m, teamCount);
        }
        return teamCount;
    }
}

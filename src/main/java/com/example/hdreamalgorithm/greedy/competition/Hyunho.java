package com.example.hdreamalgorithm.greedy.competition;

import java.util.Scanner;

public class Hyunho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();
        int teamCCount = 0;
        teamCCount = createTeam(n, m, teamCCount);
        System.out.println("teamCCount = " + teamCCount);
        // 6 3 2 => 2
        // 2 1 1 => 0
    }

    public static int createTeam(int n, int m, int teamCount) {
        System.out.println("n = " + n + ", m = " + m + ", teamCount = " + teamCount);
        if (n >= 2) {
            n = n - 2;
            m--;
            teamCount++;
            return createTeam(n, m, teamCount);
        }
        return teamCount;
    }
}

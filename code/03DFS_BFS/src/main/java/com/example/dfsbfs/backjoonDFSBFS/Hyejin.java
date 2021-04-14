package com.example.dfsbfs.backjoonDFSBFS;

import java.util.*;

public class Hyejin {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); //정점 개수
        int m = sc.nextInt(); //간선 개수
        int v = sc.nextInt(); //간선


        int[][] arr = new int[n + 1][n + 1];

        for (int i = 0; i < m; i++) {
            int j = sc.nextInt();
            int k = sc.nextInt();

            arr[j][k] = 1;
            arr[k][j] = 1;
        }

        dfs(arr, v);
        System.out.println();
        bfs(arr, v);


    }

    public static void bfs(int[][] a, int v) {
        Queue<Integer> q = new LinkedList<>();
        boolean[] c = new boolean[a.length + 1];

        int n = a.length - 1;
        q.add(v);
        c[v] = true;
        while (!q.isEmpty()) {
            v = q.poll();
            System.out.print(v + " ");
            for (int i = 1; i <= n; i++) {
                if (a[v][i] == 1 && !c[i]) {
                    q.add(i);
                    c[i] = true;
                }
            }
        }
    }


    public static void dfs(int[][] a, int v) {
        Stack<Integer> stack = new Stack<>();
        boolean[] c = new boolean[a.length + 1];

        int n = a.length - 1;
        stack.push(v);
        c[v] = true;
        System.out.print(v + " ");
        while (!stack.isEmpty()) {
            int vv = stack.peek();
            boolean flag = false;
            for (int i = 1; i <= n; i++) {
                if (a[vv][i] == 1 && !c[i]) {
                    stack.push(i);
                    System.out.print(i + " ");
                    c[i] = true;
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                stack.pop();
            }
        }
    }


}

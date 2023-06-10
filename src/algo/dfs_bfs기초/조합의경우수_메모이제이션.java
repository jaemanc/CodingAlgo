package com.org.jmc.dfs_bfs기초;

import java.util.Scanner;

public class 조합의경우수_메모이제이션 {

    static int answer;
    static int[] chk;
    static int[][] dy = new int[35][35];

    public static int dfs (int n, int r) {
        // 5C3 == > 5명 중에 3명 뽑기
        // 5c3 == 4c2 + 4c3 이다.

        if (dy[n][r] > 0 ) {
            return dy[n][r];
        }
        if (n== r || r==0) {
            return 1;
        } else {

            return dy[n][r] = dfs(n-1, r-1) + dfs (n-1,r);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int r = Integer.parseInt(sc.next());

        System.out.println(dfs(n, r));
    }
}

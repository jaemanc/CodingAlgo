package com.org.jmc.dfs_bfs기초;

import java.util.Scanner;

public class 재귀함수_스택프레임_연습 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        dfs(n);

    }

    // 깊이우선 탐색
    // 스택 프레임을 통한 백트래킹을 할 수 있다?
    public static void dfs(int n) {

        if (n==0) {
            return;
        } else {
            dfs(n-1);
            System.out.print(n+ " ");
        }
    }


}

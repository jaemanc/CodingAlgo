package com.org.jmc.dfs_bfs기초;

import java.util.Scanner;

public class 경로탐색_인접행렬 {

    // DFS
    // 방향 그래프가 주어지면 1번 정점에서 N 번정점으로 가는 모든 경로의
    // 가짓수를 출력하는 프로그램을 작성하세요.

    // 예시입력 :
    //5 9
    //1 2
    //1 3
    //1 4
    //2 1
    //2 3
    //2 5
    //3 4
    //4 2
    //4 5  --> 6 출력

    static int n,m,answer=0;
    static int[][] graph;
    static int[] chk;

    public static void dfs(int v) {
        if (v==n) {
            answer++;
        } else {
            for (int i=1; i<=n; i++) {
                if (graph[v][i] == 1 && chk[i]==0) {
                    chk[i]=1;
                    dfs(i);
                    // 빽 하는 시점이니까 체크를 푼다.
                    chk[i]=0;
                }
            }
        }
    }

    // 백트래킹방식 풀이입니다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());
        m = Integer.parseInt(sc.next());

        graph = new int[n+1][n+1];
        chk = new int[n+1];

        for (int i=0; i<m; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            graph[a][b]=1;
        }
        chk[1] = 1;
        dfs(1);
        System.out.println(answer);
    }
}

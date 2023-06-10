package com.org.jmc.dfs_bfs기초;

import java.util.ArrayList;
import java.util.Scanner;

public class 경로탐색_인접리스트 {

    static int n,m,answer=0;

    // 요게 키포인트임
    static ArrayList<ArrayList<Integer>> graph;
    static int[] chk;


    // 가짓수를 출력하니까 도달하면 바로 가짓수++
    public static void dfs(int v) {
        if (v==n) {
            answer++;
        } else {
            for (int nv : graph.get(v)) {
                if (chk[nv]==0) {
                    chk[nv]=1;
                    dfs(nv);
                    chk[nv]=0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());
        m = Integer.parseInt(sc.next());

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        chk = new int[n+1];
        for (int i=0; i<m; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            graph.get(a).add(b);
        }
        chk[1] = 1;
        dfs(1);
        System.out.println(answer);
    }

}

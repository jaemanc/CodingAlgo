package com.org.jmc.dfs_bfs활용;

import java.io.*;
import java.util.*;

public class 백준2667단지번호 {

    static int[] dx ={-1,1,0,0};
    static int[] dy ={0,0,1,-1};
    static int[][] chk;
    static int[][] graph;
    static int cnt;
    static int n;

    public static void main(String[] args) throws Exception {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

        n = Integer.parseInt(in.readLine());

        graph = new int[n][n];
        chk = new int[n][n];

        for (int i=0; i<n; i++) {
            String line = in.readLine();
            for (int j=0; j<n; j++) {
                graph[i][j] = line.charAt(j) - '0';
            }
        }
        chk[0][0] = 1;

        int dangeNum = 0;

        List<Integer> arr = new ArrayList<>();

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (graph[i][j] == 1) {
                    dangeNum++;
                    dfs(i, j, graph, 0);
                    arr.add(cnt);
                    cnt=0;
                }
            }
        }

        Collections.sort(arr);

        System.out.println(dangeNum);
        for(int i=0; i<arr.size();i++){
            System.out.println(arr.get(i));
        }

    }

    static void dfs(int x, int y, int[][] graph, int cnter ) {

        for (int i=0; i<4; i++) {
            int nx = x+dx[i];
            int ny = y+dy[i];
            if (nx >= 0 && ny >= 0 && nx < n && ny < n && graph[nx][ny]==1 ) {
                graph[nx][ny] = 0;
                dfs(nx,ny,graph , ++cnter);
                cnt= Math.max(cnt,cnter);
            }
        }
    }


}

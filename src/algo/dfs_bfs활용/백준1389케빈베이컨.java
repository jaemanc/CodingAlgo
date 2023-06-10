package com.org.jmc.dfs_bfs활용;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준1389케빈베이컨 {  // 플로이드 워셜이라는데 나 뭐 감도 안와..?

    static int[] chk;
    static int[] dist;
    static ArrayList<ArrayList<Integer>> arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        chk = new int[n+1];
        dist = new int[n+1];

        Arrays.fill(dist, 5000);

        arr = new ArrayList<ArrayList<Integer>>();

        for (int i=0; i<n; i++) {
            arr.add(new ArrayList<Integer>());
        }

        for (int i=0; i<m; i++) {
            StringTokenizer tt = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(tt.nextToken());
            int b = Integer.parseInt(tt.nextToken());
            arr.get(a).add(b);
        }


    }

    public void bfs() {


    }
}

class bacon {
    int num;
    int value;

    bacon(int num, int value) {
        this.num = num;
        this.value = value;
    }

}

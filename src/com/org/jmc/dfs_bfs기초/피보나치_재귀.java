package com.org.jmc.dfs_bfs기초;


import java.util.Scanner;

public class 피보나치_재귀 {

    static int[] fibo;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        fibo = new int[n+1];
        dfs(n);
        for (int i=1; i<=n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }

    public static int dfs(int n) {

        if (fibo[n] > 0) return fibo[n];

        if (n==1) {return fibo[n]=1;}
        else if (n==2) { return fibo[n]=1;}
        else {
            return fibo[n] = dfs(n-2)+dfs(n-1);
        }
    }

}

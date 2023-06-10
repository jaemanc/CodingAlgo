package com.org.jmc.동적계획법;

import java.util.Arrays;
import java.util.Scanner;

public class 동전교환_냅색_연습 {

    static int[] dy;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] coin = new int[n];
        for (int i=0; i<n; i++) {
            coin[i]= sc.nextInt();
        }
        int m = sc.nextInt();
        dy = new int[m+1];

        Arrays.fill(dy, Integer.MAX_VALUE);

        dy[0] = 0;
        for (int i=0; i<n; i++) {

            for (int j=coin[i]; j<=m; j++) {
                dy[j] = Math.min(dy[j], dy[j - coin[i]]+1);
            }

        }

        System.out.println(dy[m]);

    }

}

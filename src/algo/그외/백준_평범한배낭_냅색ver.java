package com.org.jmc.그외;

import java.util.ArrayList;
import java.util.Scanner;

public class 백준_평범한배낭_냅색ver {

    static Integer[][] dp;
    // dp[i][j] = 처음부터 i번째까지의 물건을 살펴보고,
    // 배낭의 용량이 j였을 때 배낭에 들어간 물건의 가치합의 최댓값

    static int[] w;
    static int[] v;
    static int maxV;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int weight = sc.nextInt();

        // dp[num][weight] 에 최댓값이 들어가도록 구현.

        // 점화식 : dp[i][j]에는,
        //   dp[i-1][j] 의 값과 dp[i-1][j-w[i]]+v[i]의 값 중 더 큰 값이 들어감.

        w = new int[num];
        v = new int[num];

        dp = new Integer[num][weight+1];

        for (int i=0; i<num; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        // top-down 방식이므로,
        System.out.println(knapsack(num-1, weight));

    }

    // TOP-down 방식
    static int knapsack(int i, int k) {
        // 범위 밖이 된다면.
        if (i < 0) {
            return 0;
        }

        // 탐색하지 않은 위치라면.
        System.out.println(i + " / " + k );
        if (dp[i][k] == null) {

            // 현재 물건을 추가로 못담는 경우 ( 이전 i 값 탐색.)
            if (w[i] > k ) {
                dp[i][k] = knapsack(i-1, k);
            } else {
                // 현재 물건을 담을 수 있는 경우.
                // 이전 i 값과 이전 i 값에 대한 k-w[i]의 값 + 현재 가치 ( v[i] ) 중 큰 값을 저장.
                dp[i][k] = Math.max(knapsack(i-1, k), knapsack(i-1,k-w[i]+v[i]));
            }

        }

        return dp[i][k];
    }


}







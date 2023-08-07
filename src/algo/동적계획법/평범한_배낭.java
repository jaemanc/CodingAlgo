package algo.동적계획법;

import java.util.Scanner;

public class 평범한_배낭 {

    /*
    첫 줄에 물품의 수 N(1 ≤ N ≤ 100)과 준서가 버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)가 주어진다. 두 번째 줄부터 N개의 줄에 거쳐 각 물건의 무게 W(1 ≤ W ≤ 100,000)와 해당 물건의 가치 V(0 ≤ V ≤ 1,000)가 주어진다.
    입력으로 주어지는 모든 수는 정수이다.

    return : 한 줄에 배낭에 넣을 수 있는 물건들의 가치합의 최댓값을 출력한다.

    EX )
    4 7
    6 13
    4 8
    3 6
    5 12
     */
    static int N,K;
    static int dp[][], w[], v[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        dp = new int[N+1][K+1];
        w = new int[N+1];
        v = new int[N+1];

        for (int i=0; i<N; i++) {
            w[i] = sc.nextInt();
            v[i] = sc.nextInt();
        }

        for (int i=1; i<=N; i++) {
            for (int j=1; j<=K; j++) {
                dp[i][j] = dp[i-1][j]; // 이전 행의 결과를 복사.

                if(j - w[i]>=0) {
                    dp[i][j] = Math.max(dp[i][j],dp[i-1][j-w[i]]+v[i]);
                }

            }
        }

        System.out.println(dp[N][K]);

    }

}

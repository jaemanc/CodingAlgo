package algo.동적계획법;

import java.util.Scanner;

public class 백준1_2_3더하기 {
    /*
     ex )
3
4
7
10
     */
    static int[] dp = new int[11];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        dp[1] = 1;
        dp[2] = 2;  // 점화식을 떠올리기 까지의 과정이 DP풀이의 포인트이나 상당히 어려운 과정이라 함.. ㅜㅜ
        dp[3] = 4;  // 점화식을 세워야 한다. dp[n] = dp[n-3] + dp[n-2] + dp[n-1];

        for (int j=0; j<T; j++) {
            int N  = sc.nextInt();
            for (int i=4; i<11; i++) {
                dp[i] = dp[i-3] + dp[i-2] + dp[i-1];
            }
            System.out.println(dp[N]);
        }

    }

}

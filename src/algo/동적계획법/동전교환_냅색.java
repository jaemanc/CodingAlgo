package algo.동적계획법;

import java.util.*;

// 다이나믹으로 풀이합니다.
public class 동전교환_냅색 {

    // dy[i] 는 i 금액을 만드는데 드는 최소 동전 개수
    static int[] dy;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in );

        int n = sc.nextInt(); // 동전 개수
        int[] coin = new int[n];  // 코인 종류.

        for (int i=0; i<n; i++) {
            coin[i] = sc.nextInt();
        }

        int m = sc.nextInt();  // 최소 코인개수를 가질 경우를 찾자.

        dy = new int[m+1];
        Arrays.fill(dy,Integer.MAX_VALUE);

        dy[0] = 0;
        for (int i=0; i<n; i++) {

            // 최소 개수 값 - 코인종류의 값만큼 뺀다 ==> 코인 종류 1개만추가하면 된다.
            for (int j=coin[i]; j<=m; j++) {
                dy[j] = Math.min(dy[j], dy[j-coin[i]] +1);
            }

        }
        System.out.println(dy[m]);
    }

}

package algo.dfs_bfs기초;



import java.util.Scanner;

public class 부분집합구하기_깊이우선탐색 {

    // 특정 입력값의 부분 집합을 모두 구하시오.

    static int n;
    static int[] check;
    public static void dfs(int L) {
        if (L==n+1) {
            String tmp ="";
            for (int i=1; i<=n; i++) {
                if (check[i]==1) tmp+=( i+" ");
            }
            if (tmp.length() > 0 ) System.out.println(tmp);
        } else {
            check[L]=1;
            dfs(L+1);  // 왼쪽
            check[L]=0;
            dfs(L+1);  // 오른쪽!
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(sc.next());
        check = new int[n+1];
        dfs(1);
    }

}

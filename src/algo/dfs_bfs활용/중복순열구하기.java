package algo.dfs_bfs활용;

import java.util.Scanner;

public class 중복순열구하기 {

    static int[] pm;
    static int n,m;

    public static void dfs(int L) {
        if (L==m) {
            for (int x : pm) System.out.print( x + " ");
            System.out.println();
        } else {
            for (int i=1; i<=n; i++) {
                pm[L] = i;
                dfs(L+1);
            }
        }

    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(sc.next());
        m = Integer.parseInt(sc.next());
        pm = new int[m];
         dfs(0);
    }

}

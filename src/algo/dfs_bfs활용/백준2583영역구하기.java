package algo.dfs_bfs활용;

import java.util.*;

public class 백준2583영역구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();  // 모눈종이는 M x N 사이즈이다.
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[][] board = new int[m+1][n+1];


        for (int i=0; i<k; i++) {

            int sx = sc.nextInt();
            int sy = sc.nextInt();
            int ex = sc.nextInt();
            int ey = sc.nextInt();

            for (int j=0; j<m; j++) {
                for (int v=0; v<n; v++) {
                    if ( (j>=sx && j<ex ) && (v >=sy && v < ey)) {
                        board[v][j] = 1;
                    }
                }
            }
        }

        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    public static void dfs() {

    }


}

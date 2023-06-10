package com.org.jmc.dfs_bfs활용;

import java.util.*;

public class 섬나라아일랜드_bfs {

    static int n;
    static int answer;
    // 8 방향.
    static int[] dx ={1,0,0,-1,1,-1,1,-1};
    static int[] dy ={0,1,-1,0,1,-1,-1,1};
    static Queue<Point_island_bfs> Q = new LinkedList<>();

    public static void bfs (int x, int y, int[][] board ) {
        Q.offer(new Point_island_bfs(x,y));
        while (!Q.isEmpty()){
            Point_island_bfs temp = Q.poll();
            for (int i=0; i<8; i++) {
                int nx = temp.x + dx[i];
                int ny = temp.y + dy[i];
                if (nx >=0 && nx < n && ny >=0&& ny < n && board[nx][ny] ==1) {
                    Q.offer(new Point_island_bfs(nx,ny));
                    board[nx][ny] = 0;
                    bfs(nx,ny,board);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());

        int[][] board = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = Integer.parseInt(sc.next());
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (board[i][j] == 1) {
                    board[i][j] =0;
                    answer++;
                    bfs(i,j, board);
                }
            }
        }
        System.out.println(answer);
    }

}

class Point_island_bfs {
    int x;
    int y;
    public Point_island_bfs(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

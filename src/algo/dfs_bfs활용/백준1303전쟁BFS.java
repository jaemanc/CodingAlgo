package com.org.jmc.dfs_bfs활용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 백준1303전쟁BFS {

    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,1,-1};
    static int wteamAnswer = 0;
    static int bteamAnswer = 0;
    static char[][] arr;
    static boolean[][] chk;
    static int n;
    static int m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
         n = Integer.parseInt(st.nextToken());
         m = Integer.parseInt(st.nextToken());

        arr = new char[n+1][m+1];
        chk = new boolean[n+1][m+1];

        for (int i=0; i<n; i++) {
            String line = br.readLine();
            for (int j=0; j<m; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if ('B'== arr[i][j]) {
                    int bteam = bbfs(i,j);
                    bteamAnswer += bteam * bteam;

                }
                if ('W' == arr[i][j]) {
                    int wteam = wbfs(i,j);
                    wteamAnswer += wteam * wteam;
                }
            }
        }

        System.out.println(" w team : " + wteamAnswer + "  b team : " + bteamAnswer);

    }

    private static int bbfs(int x, int y) {
        Queue<warBfs> queue = new LinkedList<>();
        queue.offer(new warBfs(x,y));

        int bteam =1;
        chk[x][y] = true;

        while (!queue.isEmpty()) {
            warBfs temp = queue.poll();
            for (int i=0; i<4; i++) {
                int nx = temp.x+dx[i];
                int ny = temp.y+dy[i];

                if ( 0 <= nx && nx < n && 0 <= ny && ny < m && arr[nx][ny] == 'B' && !chk[nx][ny]) {
                    chk[nx][ny] = true;
                    bteam++;
                    queue.offer(new warBfs(nx,ny));
                }
            }
        }

        return bteam;
    }

    private static int wbfs(int x, int y) {
        Queue<warBfs> queue = new LinkedList<>();
        queue.offer(new warBfs(x,y));
        int wteam = 1;

        chk[x][y] = true;

        while (!queue.isEmpty()) {
            warBfs temp = queue.poll();
            for (int i=0; i<4; i++) {
                int nx = temp.x+dx[i];
                int ny = temp.y+dy[i];

                if (0 <= nx && nx < n && 0 <= ny && ny < m && arr[nx][ny] == 'W' && !chk[nx][ny] ) {
                    queue.offer(new warBfs(nx,ny));
                    chk[nx][ny] = true;
                    wteam++;
                }
            }
        }

        return wteam;
    }
}

class warBfs {
    int x;
    int y;

    warBfs(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
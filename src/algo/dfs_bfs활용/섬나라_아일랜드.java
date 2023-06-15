package algo.dfs_bfs활용;

import java.util.*;

public class 섬나라_아일랜드 {

    //N*N의 섬나라 아일랜드의 지도가 격자판의 정보로 주어집니다.
    //각 섬은 1로 표시되어 상하좌우와 대각선으로 연결되어 있으며, 0은 바다입니다.
    //섬나라 아일랜드에 몇 개의 섬이 있는지 구하는 프로그램을 작성하세요.

    //첫 번째 줄에 자연수 N(3<=N<=20)이 주어집니다.
    //두 번째 줄부터 격자판 정보가 주어진다.

    // 입력 : 7
    //1 1 0 0 0 1 0
    //0 1 1 0 1 1 0
    //0 1 0 0 0 0 0
    //0 0 0 1 0 1 1
    //1 1 0 1 1 0 0
    //1 0 0 0 1 0 0
    //1 0 1 0 1 0 0

    // 출력 : 5

    static int[][] chk;
    static int n;
    static int answer;
    // 8 방향.
    static int[] dx ={1,0,0,-1,1,-1,1,-1};
    static int[] dy ={0,1,-1,0,1,-1,-1,1};




    public static void dfs (int x, int y, int[][] board ) {

        for (int t=0; t<8; t++) {
            int nx = x + dx[t];
            int ny = y + dy[t];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny]==1) {
                board[nx][ny] = 0;
                dfs(nx, ny, board);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());

        int[][] board = new int[n][n];
        chk = new int[n][n];

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                board[i][j] = Integer.parseInt(sc.next());
            }
        }

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    dfs(i,j, board);
                }
            }
        }
        System.out.println(answer);
    }

}

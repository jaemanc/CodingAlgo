package algo.dfs_bfs활용;

import java.util.*;

class Point_bfs_miro{
    public int x, y;
    Point_bfs_miro(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class 미로의최단거리통로_BFS {

    static int[][] board, dis;
    static int answer=0;
    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    static void bfs(int x, int y){
        Queue<Point_bfs_miro> Q = new LinkedList<>();
        Q.offer(new Point_bfs_miro(x, y));
        board[x][y]=1;
        while (!Q.isEmpty()) {
            Point_bfs_miro tmp = Q.poll();
            for (int i=0; i<dx.length; i++) {
                int nx = tmp.x+dx[i];
                int ny = tmp.y+dy[i];
                if (nx>=1 && nx <=7 && ny>=1 && ny <=7 && board[nx][ny]==0) {
                    board[nx][ny]=1;
                    Q.offer(new Point_bfs_miro(nx,ny));
                    dis[nx][ny] = dis[tmp.x][tmp.y]+1; // 기존 꺼낸 값에서 1을 더한 값을 넣음.
                }
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        dis = new int[8][8];
        for (int i=1; i<=7; i++) {
            for (int j=1; j<=7; j++) {
                board[i][j] = Integer.parseInt(sc.next());
            }
        }

        board[1][1] = 1;
        bfs(1,1);

        if (board[7][7]==0) {
            System.out.println(-1);
        } else {
            System.out.println(dis[7][7]);
        }
    }

}

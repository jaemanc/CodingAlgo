package algo.dfs_bfs활용;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
    public static void main(String[] args) {
        int[][] maps = {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}};
        solution(maps);
    }

    static boolean[][] chk;
    static int[][] dist;
    static int[] dx ={-1,1,0,0};
    static int[] dy = {0,0,1,-1};

    public static int solution(int[][] maps) {
        chk = new boolean[maps.length][maps[0].length];
        chk[0][0] = true;
        dist = new int[maps.length][maps[0].length];
        // 시작점 1,1 -> 우측 하단까지.

        bfs(maps, 0,0);
        System.out.println(dist[maps.length-1][maps[0].length-1]);

        if (dist[maps.length-1][maps[0].length-1]==0){
            return -1;
        }
        return dist[maps.length-1][maps[0].length-1] + 1;  // 시작점을 0으로 잡아서..ㅜ
    }

    // 최단거리 = bfs 0 = 벽   1 = 길
    public static void bfs(int[][] maps , int x, int y) {
        Queue<miroQ> queue = new LinkedList<>();
        queue.add(new miroQ(x,y));
        while (!queue.isEmpty()) {
            miroQ q = queue.poll();

            if (q.x == maps.length && q.y == maps[0].length){
                return;
            }
            for (int i=0; i<4; i++) {
                int tempX = q.x+dx[i];
                int tempY = q.y+dy[i];
                    if ( tempX >= 0 &&tempY >= 0 && tempX < maps.length && tempY < maps[0].length && !chk[tempX][tempY]) {
                        if (maps[tempX][tempY]!=0) {
                            chk[tempX][tempY] = true;
                            dist[tempX][tempY] = dist[q.x][q.y] + 1;
                            queue.add(new miroQ(tempX, tempY));
                        }
                    }
            }
        }
    }
}

class miroQ {
    int x;
    int y;
    miroQ (int x, int y) {
        this.x = x;
        this.y = y;
    }
}

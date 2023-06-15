package algo.dfs_bfs활용;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준1012유기농배추 {

    static int[][] baecho;
    static int M;
    static int N;
    static int K;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static boolean[][] visit;
    static int count;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            count=0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            baecho = new int[M][N];
            visit = new boolean[M][N];

            for (int j = 0; j < K; j++) {
                StringTokenizer tt = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(tt.nextToken());
                int b = Integer.parseInt(tt.nextToken());
                baecho[a][b] = 1;
            }

            for (int x = 0; x < M; x++) {
                for (int y = 0; y < N; y++) {
                    if (baecho[x][y] == 1 && !visit[x][y]) {
                        dfs_baechu(x,y);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    static void dfs_baechu(int x, int y){

        visit[x][y] = true;

        for (int i=0; i<4; i++) {
            int xx = dx[i]+x;
            int yy = dy[i]+y;

            if (xx>=0 && yy>=0 && xx <M && yy<N && !visit[xx][yy] && baecho[xx][yy] ==1) {
                dfs_baechu(xx,yy);
            }
        }
    }
}

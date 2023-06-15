package algo.dfs_bfs활용;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class 백준2606바이러스 {

    static int[][] arr;
    static boolean[] chk;
    static int count;
    static int node;
    static int line;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        node = Integer.parseInt(br.readLine());
        line = Integer.parseInt(br.readLine());

        arr = new int[node+1][node+1];
        chk = new boolean[node+1];

        for (int i=0; i<line;i++) {
            StringTokenizer str = new StringTokenizer(br.readLine());
            int aa = Integer.parseInt(str.nextToken());
            int bb = Integer.parseInt(str.nextToken());
            arr[aa][bb] = 1;
            arr[bb][aa] = 1;
        }

        dfs(1);

        System.out.println(count - 1);

    }

    public static void dfs(int start) {

        chk[start] = true;
        count++;

        for (int i=0; i<=node; i++) {
            if (arr[start][i] == 1 && !chk[i]) {
                dfs(i);
            }

        }


    }


}

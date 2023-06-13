package algo.dfs_bfs활용;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class 백준18352특정거리의도시찾기 {

    // 메모리 사용량 초과 나옵니다... ㅠㅠ


    private static int n;
    private static int m;
    private static int k;
    private static int x;
    private static int[][] arr;
    private static int[] dist;
    private static ArrayList<Integer> answer = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        dist = new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        arr = new int[m][m];

        for (int i=0; i<m; i++) {
            StringTokenizer tt = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(tt.nextToken());
            arr[i][1] = Integer.parseInt(tt.nextToken());
        }
        dfs(0, x);

        List<Integer> ans = new ArrayList<>();

        for (int i=0; i< dist.length; i++) {
            if (dist[i] == k ) {
                ans.add(i);
            }
        }

        if (ans.size() < 1) {
            System.out.println(-1);
        } else {
            Collections.sort(ans);
            for (int i=0; i< ans.size(); i++){
                System.out.println(ans.get(i));
            }
        }
    }

    public static void dfs(int L, int start) {
        if (L < k){
            L = L+1;
            for (int i=0; i<arr.length; i++) {
                if (arr[i][0] == start) {
                    int target = arr[i][1];
                    dist[target] = Math.min(dist[target], L);
                    dfs(L, target);
                }
            }
        }
    }
}

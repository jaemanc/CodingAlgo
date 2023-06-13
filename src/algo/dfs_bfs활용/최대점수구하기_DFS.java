package algo.dfs_bfs활용;

import java.util.*;

public class 최대점수구하기_DFS {

    static int N;
    static int M;
    static int sum;
    static int answer = Integer.MIN_VALUE;

    public static void dfs (int L, int score , int time, List<ArrayList<Integer>> arrmap) {

        // 부분집합이 하나 완성되었다면.
        if (L == N) {
            answer = Math.max(answer, score);
        }
        if (time > M) {
            return;
        } else {
            dfs(L+1,score + arrmap.get(L).get(0), time+arrmap.get(L).get(1), arrmap);
            dfs(L+1, score, arrmap.get(L).get(1),arrmap);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = Integer.parseInt(sc.next());
        M = Integer.parseInt(sc.next());

        List<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        for (int i=0; i<=N; i++) {
            arr.add(new ArrayList<Integer>());
        }

        for (int i=0; i<N; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());

            arr.get(i).add(a);
            arr.get(i).add(b);
        }
        dfs(0,0,sum,arr);
        System.out.println(answer);

    }

}

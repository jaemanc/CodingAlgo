package algo.dfs_bfs기초;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 그래프최단거리_BFS {

    // 입력 예제 :
    //6 9
    //1 3
    //1 4
    //2 1
    //2 5
    //3 4
    //4 5
    //4 6
    //6 2
    //6 5

    // 출력 예제
    // 2 : 3
    // 3 : 1
    // 4 : 1
    // 5 : 2



    static int n,m,answer=0;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] chk , dis;

    public static void bfs(int v) {
        Queue<Integer> queue = new LinkedList<>();
        chk[v] = 1;
        dis[v] = 0;
        queue.offer(v);

        while ( !queue.isEmpty() ) {
            int cv = queue.poll();

            for (int nv : graph.get(cv)) {
                if (chk[nv] == 0) {
                    chk[nv]=1;
                    queue.offer(nv);
                    dis[nv] = dis[cv]+1;
                }
            }

        }

    }

    // bfs
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());
        m = Integer.parseInt(sc.next());

        graph = new ArrayList<ArrayList<Integer>>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Integer>());
        }
        chk = new int[n+1];
        dis = new int[n+1];
        for (int i=0; i<m; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            graph.get(a).add(b); // 인접 리스트를 만듭니다.
        }
        chk[1] = 1;
        bfs(1);

        // 답을 2번 정점부터 출력하라고 해서!
        for (int i=2; i<=n; i++) {
            System.out.println(i+" : " + dis[i]);
        }
    }

}

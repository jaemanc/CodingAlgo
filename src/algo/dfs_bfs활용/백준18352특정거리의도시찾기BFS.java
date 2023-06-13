package algo.dfs_bfs활용;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class 백준18352특정거리의도시찾기BFS {

    private static int n;
    private static int m;
    private static int k;
    private static int x;
    private static int[] dist;
    static List<Integer>[] nodes;
    private static ArrayList<Integer> answer = new ArrayList<>();

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        x = Integer.parseInt(st.nextToken());

        nodes = new ArrayList[n+1];
        dist = new int[n+1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i=1; i<n+1; i++) {
            nodes[i] = new ArrayList<Integer>();
        }

        for (int i=0; i< m; i++) {
            st= new StringTokenizer(br.readLine());

            nodes[Integer.parseInt(st.nextToken())].add(Integer.parseInt(st.nextToken()));
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x,0});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            if (dist[now[0]] <= now[1]) continue;
            dist[now[0]] = now[1];

            for (int e : nodes[now[0]]) {
                queue.offer(new int[] {e,now[1]+1});
            }
        }

        boolean flag = false;

        for (int i = 1 ; i < n+1 ; i++) {
            if(dist[i] == k) {
                flag = true;
                System.out.println(i);
            }
        }
        if(!flag) System.out.println(-1);

    }
}


package algo.greedy;

import java.util.*;

public class 다익스트라알고리즘 {

    // 1번 정점에서 가중치 방향그래프 내의 모든 정점으로 최소 거리 비용을 출력하는 프로그램을 작성하자.
    // 경로가 없다면 impossible을 출력한다.

    static int n,m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(sc.next());
        m = Integer.parseInt(sc.next());

        graph = new ArrayList<ArrayList<Edge>>();

        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Edge>());
        }

        dis = new int[n+1];
        Arrays.fill(dis, Integer.MAX_VALUE);

        for (int i=0; i<m; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            graph.get(a).add(new Edge(b,c));
        }

        solution(1);

        for(int i=2; i<=n; i++){
            if(dis[i]!=Integer.MAX_VALUE) System.out.println(i+" : "+dis[i]);
            else System.out.println(i+" : impossible");
        }

    }

    public static void solution (int v) {
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v,0));

        dis[v]=0;
        while(!pQ.isEmpty()) {
            Edge tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;

            if (nowCost > dis[now])  {
                continue;
            }

            // 현재 정점 + 다음 정점 비용 --> 1에서 현재 정점 비용 + 다음 정점까지 비용을 계산한다는 의미임.
            for (Edge ob : graph.get(now)) {
                if (dis[ob.vex] > nowCost+ob.cost) {
                    dis[ob.vex] = nowCost+ob.cost;
                    pQ.offer(new Edge(ob.vex, nowCost+ob.cost));
                }
            }
        }

    }

}

class Edge implements Comparable<Edge> {

    public int vex; // 정점
    public int cost; // 비용

    Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}
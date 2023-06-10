package com.org.jmc.greedy;


import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

// 프림 알고리즘. union & find 말고 priority queue를 사용해서 만듦.
// 다익스트라와 달리 무방향 가중치 임.
public class 원더랜드_프림 {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        ArrayList<ArrayList<Edge_wonder>> graph = new ArrayList<ArrayList<Edge_wonder>>();
        for (int i=0; i<=n; i++) {
            graph.add(new ArrayList<Edge_wonder>());
        }

        int[] ch = new int[n+1];
        for (int i=0; i< m; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());

            graph.get(a).add(new Edge_wonder(b,c));

            // 무방향이라 b에서 a로도 갈 수 있으니까.
            graph.get(b).add(new Edge_wonder(a,c));
        }
        int answer=0;

        PriorityQueue<Edge_wonder> pQ = new PriorityQueue<>();
        pQ.offer(new Edge_wonder(1,0));

        while(!pQ.isEmpty()) {
            Edge_wonder tmp = pQ.poll();
            int ev = tmp.vex;
            if (ch[ev] ==0 ) {
                ch[ev] = 1;
                answer+=tmp.cost;
                for (Edge_wonder ob : graph.get(ev)) {
                    if (ch[ob.vex] == 0) pQ.offer(new Edge_wonder(ob.vex, ob.cost));

                }
            }

        }
        System.out.println(answer);

    }

}

class Edge_wonder implements Comparable<Edge_wonder> {

    public int vex;
    public int cost;

    Edge_wonder(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge_wonder o) {
        return this.cost - o.cost;
    }

}








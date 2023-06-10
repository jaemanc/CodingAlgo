package com.org.jmc.dfs_bfs활용;

import java.util.*;

public class 피자배달거리_DFS_조합구하기 {

    static int[][] house;
    static int[][] board;
    static int n,m;
    static int answer = Integer.MAX_VALUE;
    static int[] combi;
    static ArrayList<Point_pizza> pz, hs;
    static int len;
    // 8 방향.
    static int[] dx ={1,0,0,-1,1,-1,1,-1};
    static int[] dy ={0,1,-1,0,1,-1,-1,1};

    static void dfs (int L ,int s) {

        // 조합? : 피자 집 개수 중 m 개를 뽑는다.
        // 조합이 하나 나왔을 때,
        if (L==m) {
            int sum = 0;
            // 집목록 중 집 하나 선택 :: 살아남은 ( 조합에 낀 ) 피자집중 최소 거리를 구한다.
            for (Point_pizza h: hs) {
                int dis = Integer.MAX_VALUE;
                for (int i: combi) {
                    dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
                }
                sum += dis;
            }
            answer= Math.min(answer,sum);

            /* 조합은 이런식으로 출력.
            for (int x: combi) {
                System.out.print(x + " ");
            }
            System.out.println();*/
        } else {
            // len = 피자집 6개 중에 N 개를 뽑는다. 인덱스로,
            for (int i=s; i<len; i++) {
                combi[L]=i;
                // 조합 뽑는 규칙.
                dfs(L+1, i+1);
            }
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(sc.next());
        m = Integer.parseInt(sc.next());

        board = new int[n][n];
        house = new int[n][n];

        pz = new ArrayList<>();
        hs = new ArrayList<>();

        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                int tmp = Integer.parseInt(sc.next());
                if (tmp == 1) {
                    hs.add(new Point_pizza(i,j));
                } else if (tmp ==2) {
                    pz.add(new Point_pizza(i,j));
                }
            }
        }

        len = pz.size();
        combi = new int[m];

        dfs(0,0);
        System.out.println(answer);

    }

}
class Point_pizza {
    int x, y;
    public Point_pizza(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
package algo.dfs_bfs기초;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class 송아지찾기_bfs상태트리탐색 {

    static int L=0;
    static int answer = 0;
    static int[] dis ={1 , -1 , 5};
    static int[] chk;
    static Queue<Integer> Q = new LinkedList<>();

    public static int bfs(int s, int e) {

        chk = new int[10001];
        chk[s] = 1;
        Q.offer(s);
        int L=0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i=0; i<len; i++) {
                int x= Q.poll();
                for (int j=0; j<3; j++) {
                    int nx = x+dis[j];
                    if (nx==e) return L+1;
                    if (nx>=1 && nx <= 10000 && chk[nx] == 0) {
                        chk[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }

        return L;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = Integer.parseInt(sc.next());
        int e = Integer.parseInt(sc.next());

        System.out.println(bfs (s,e));
    }

}

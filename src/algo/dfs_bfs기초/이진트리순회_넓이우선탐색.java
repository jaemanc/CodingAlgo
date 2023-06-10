package com.org.jmc.dfs_bfs기초;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Nodebfs  {
    int data;
    Nodebfs lt;
    Nodebfs rt;
    public Nodebfs(int val) {
        data = val;
        lt = null;
        rt = null;
    }
}

public class 이진트리순회_넓이우선탐색 {

    public static void bfs(Nodebfs root) {
        Queue<Nodebfs> Q = new LinkedList<>();
        Q.offer(root);

        // 레벨
        int L=0;

        while(!Q.isEmpty()) {
            int len=Q.size();
            System.out.print(L+" : ");

            for (int i=0; i<len; i++) {
                Nodebfs cur = Q.poll();
                System.out.print(cur.data+ " ");
                if (cur.lt != null) {
                    Q.offer(cur.lt);
                }
                if (cur.rt != null) {
                    Q.offer(cur.rt);
                }
            }
            L++;
            System.out.println();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        Nodebfs root = new Nodebfs(1);
        root.lt = new Nodebfs(2);
        root.rt = new Nodebfs(3);
        root.lt.lt = new Nodebfs(4);
        root.lt.rt = new Nodebfs(5);
        root.rt.lt = new Nodebfs(6);
        root.rt.rt = new Nodebfs(7);

        bfs(root);

    }

}

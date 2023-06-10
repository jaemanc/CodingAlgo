package com.org.jmc.dfs_bfs기초;

import java.util.*;

class Node_tree_bfs {
    int data;
    Node_tree_bfs lt;
    Node_tree_bfs rt;

    public Node_tree_bfs(int val) {
        data = val;
        Node_tree_bfs lt=null;
        Node_tree_bfs rt=null;
    }
}

public class Tree말단노드까지의가장짧은경로_bfs {

    static Node_tree_bfs root;

    static int bfs(Node_tree_bfs root) {
        Queue<Node_tree_bfs> Q = new LinkedList<>();
        Q.offer(root);
        int L=0;
        while (!Q.isEmpty()) {
            int len = Q.size();

            for (int i=0; i<len; i++) {
                Node_tree_bfs cur = Q.poll();

                // 말단 노드를 발견 할 경우.
                if (cur.lt ==null && cur.rt==null) {
                    return L;
                }
                if (cur.lt!=null ) Q.offer(cur.lt);
                if (cur.rt!=null ) Q.offer(cur.rt);
            }
            L++;
        }
        return 0;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        root = new Node_tree_bfs(1);
        root.lt = new Node_tree_bfs(2);
        root.rt = new Node_tree_bfs(3);
        root.lt.lt = new Node_tree_bfs(4);
        root.lt.rt = new Node_tree_bfs(5);

        System.out.println(bfs(root));

    }

}

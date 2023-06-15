package algo.dfs_bfs기초;

import java.util.Scanner;

class Node_tree_dfs {
    int data;
    Node_tree_bfs lt;
    Node_tree_bfs rt;

    public Node_tree_dfs (int val) {
        data = val;
        Node_tree_bfs lt=null;
        Node_tree_bfs rt=null;
    }
}

// 보통 가장 짧은 경로는 dfs로 풀어야 한다.
public class Tree말단노드까지의가장짧은경로_dfs {

    static Node_tree_bfs root;

    static int dfs (int L, Node_tree_bfs root) {
        if (root.lt == null && root.rt == null) return L;
        // 둘 중에 하나만 없어도 에러가 납니다...
        else return Math.min(dfs(L+1,root.lt) , dfs (L+1,root.rt));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        root = new Node_tree_bfs(1);
        root.lt = new Node_tree_bfs(2);
        root.rt = new Node_tree_bfs(3);
        root.lt.lt = new Node_tree_bfs(4);
        root.lt.rt = new Node_tree_bfs(5);

        System.out.println(dfs(0, root));
    }

}

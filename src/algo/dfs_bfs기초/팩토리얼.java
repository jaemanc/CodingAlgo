package algo.dfs_bfs기초;


import java.util.Scanner;

public class 팩토리얼 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        System.out.println(dfs(n));

    }

    public static int dfs (int n) {

        if (n==1) {

            return n;
        } else {
            int count = n*dfs(n-1);
            System.out.println("count : " + count);
            return count;
        }

    }

}

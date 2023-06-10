package com.org.jmc.dfs_bfs활용;

import java.util.Scanner;

public class 조합구하기 {

    //1부터 N 까지 번호 구슬 중 M 개를 뽑는 방법의 수를 출력하시오.
    // 4 2 입력 받음
    // --> 출력
    // 1 2
    // 1 3
    // 1 4
    // 2 3
    // 2 4
    // 3 4


    static int answer;
    static int n;
    static int m;
    static int[] combi;

    static void dfs(int L, int s) {

        if (L==m) {
            for (int x : combi) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i=s; i<= n; i++) {
                combi[L] = i;
                dfs(L+1, i+1);

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(sc.next());
        m = Integer.parseInt(sc.next());
        combi = new int[m];

        dfs(0,1);

    }

}

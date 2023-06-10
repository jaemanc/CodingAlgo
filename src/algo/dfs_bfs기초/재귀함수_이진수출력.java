package com.org.jmc.dfs_bfs기초;

import java.util.Scanner;

public class 재귀함수_이진수출력 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        dfs(n);
    }

    public static void dfs (int n) {

        int 몫 = n / 2;
        int 나머지 = n%2;

        System.out.println(" 몫 : " +  몫 + " / 나머지 : " + 나머지);

        if (몫 <= 0) {
            System.out.print(나머지 + " ");
            return;
        } else {
            dfs(몫);
            System.out.print(나머지 + " ");
        }

    }

}

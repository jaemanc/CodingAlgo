package com.org.jmc.dfs_bfs활용;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 동전교환 {

    // 최소 개수이므로 bfs 풀이.
    static int answer = Integer.MAX_VALUE ;
    static int n , m;
    static Integer[] arr;

    public static void bfs (int L, int sum, Integer[] arr) {
        if (sum > m ) {
            return;
        }

        if (L > answer) {
            return;
        }

        if (sum == m ) {
            answer = Math.min(answer,L );
            return;
        } else {
            for (int i=0; i< arr.length; i++) {
                bfs(L+1,sum+arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.next());

        arr = new Integer[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(arr, Collections.reverseOrder());

        m = Integer.parseInt(sc.next());

        bfs(0, 0, arr);
        System.out.println(answer);

    }

}

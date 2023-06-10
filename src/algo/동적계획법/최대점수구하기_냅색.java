package com.org.jmc.동적계획법;

import java.util.*;

public class 최대점수구하기_냅색 {

    static int[] dy;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt(); // 제한 시간.
        int[] dy = new int[m+1];

        for (int i=0; i<n; i++) {
            int ps = sc.nextInt();
            int pt = sc.nextInt();

            for (int j=m; j>=pt; j--) {
                dy[j] = Math.max(dy[j] , dy[j-pt] + ps);
            }
        }

        System.out.println(dy[m]);
    }
}

class Exam {
    int score;
    int time;

    public Exam(int score, int time) {
        this.score = score;
        this.time = time;
    }
}

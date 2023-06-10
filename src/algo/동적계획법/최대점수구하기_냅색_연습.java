package com.org.jmc.동적계획법;

import java.util.*;

public class 최대점수구하기_냅색_연습 {

    static int[] dy;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        dy = new int[m+1];
        ArrayList<Exam_1> arr = new ArrayList<Exam_1>();

        for (int i=0; i<n; i++) {
            arr.add(new Exam_1(sc.nextInt(), sc.nextInt()));
        }

        for (Exam_1 temp : arr ) {
            for (int i=m; i>=temp.time; i--) {
                dy[i] = Math.max(dy[i],dy[i-temp.time]+temp.score);
            }
        }
        System.out.println(dy[m]);
    }
}

class Exam_1 {

    int score;
    int time;

    public Exam_1 (int score, int time) {
        this.score = score;
        this.time = time;
    }
}

package com.org.jmc.배열;

import java.util.Scanner;

public class 격자판최대합 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.next());

        int answer = Integer.MIN_VALUE;

        int[][] board = new int[size][size];

        for (int i=0; i<size; i++) {
            for (int j=0; j<size; j++){
                board[i][j] = Integer.parseInt(sc.next());
            }
        }


        // 행 열
        for (int i=0; i<size; i++) {
            int temp = 0;
            int temp2 = 0;
            for (int j=0; j<size; j++) {
                temp+=board[i][j];
                temp2+=board[j][i];
            }
            answer = Math.max(answer,temp);
            answer = Math.max(answer,temp2);
        }

        // 대각선
        int temp = 0;
        int temp2 = 0;
        for (int i=0; i<size; i++) {
            temp+=board[i][i];
            temp2+=board[i][size-i-1];
        }
        answer = Math.max(answer,temp);
        answer = Math.max(answer,temp2);


        System.out.println(answer);

    }
}

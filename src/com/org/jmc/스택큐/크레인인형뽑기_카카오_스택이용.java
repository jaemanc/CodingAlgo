package com.org.jmc.스택큐;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class 크레인인형뽑기_카카오_스택이용 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int boardSize = Integer.parseInt(sc.next());
        int[][] board = new int[boardSize][boardSize];

        for (int i=0; i<boardSize; i++) {
            for (int j=0; j<boardSize; j++) {
                board[i][j] = Integer.parseInt(sc.next());
            }
        }

        int moveNum = Integer.parseInt(sc.next());
        int[] moves = new int[moveNum];
        for (int i=0; i<moveNum; i++) {
            moves[i] = Integer.parseInt(sc.next());
        }

        int answer=0;
        Stack<Integer> stack = new Stack<>();
        for (int pos : moves) {
            for (int i=0; i<board.length; i++) {
                if (board[i][pos-1] != 0) {
                    int tmp = board[i][pos-1];
                    board[i][pos-1]=0;
                    if (!stack.isEmpty() && tmp == stack.peek()) {
                        answer+=2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}

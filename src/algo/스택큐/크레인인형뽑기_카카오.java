package algo.스택큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 크레인인형뽑기_카카오 {

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

        LinkedList<Integer> queue = new LinkedList<>();

        for (int i=0; i<moves.length; i++) {
            int moveTarget = moves[i]-1;
            for (int j=0; j<boardSize; j++) {
                if (board[j][moveTarget]!=0) {
                    // System.out.println(" 뽑는 위치 : " + moveTarget + " 뽑은 인형 : " + board[j][moveTarget]);
                    queue.offer(board[j][moveTarget]);
                    board[j][moveTarget] = 0;
                    break;
                } else {
                    // System.out.println(" 인형이없어요!");
                }
            }
        }

        int answerCount =0;
        for (int i=0; i< queue.size()-1; i++) {
            if (queue.get(i) == queue.get(i+1)) {
                queue.remove(i);
                queue.remove(i);
                answerCount++;
                i=0;
            }
        }
        System.out.println(answerCount*2);
    }
}

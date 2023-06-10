package com.org.jmc.배열;

import java.util.Scanner;

public class 봉우리 {

    //지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
    //
    //각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
    //
    //격자의 가장자리는 0으로 초기화 되었다고 가정한다.


    //첫 줄에 자연수 N이 주어진다.(2<=N<=50)
    //
    //두 번째 줄부터 N줄에 걸쳐 각 줄에 N개의 자연수가 주어진다. 각 자연수는 100을 넘지 않는다.

    //5
    //0000000
    //0537230
    //0371610
    //0725340
    //0436410
    //0873520
    //0000000   --> 답 = 10

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());

        int[][] board = new int[N+2][N+2];

        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                board[i][j] = Integer.parseInt(sc.next());
            }
        }

        int answer=0;

        int[] dx = {-1,0,1,0};
        int[] dy = {0,1,0,-1};


        for (int i=1; i<=N; i++) {
            for (int j=1; j<=N; j++) {
                boolean flag = true;
                for (int k=0; k<4; k++) {
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if (board[nx][ny] >= board[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }

        System.out.println(answer);
    }
}

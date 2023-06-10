package com.org.jmc.배열;

import java.util.Scanner;

public class 뒤집은소수찾기 {

    //N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
    //
    //예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
    //
    //첫 자리부터의 연속된 0은 무시한다

    // ex ) -->
    // 9
    // 32 55 62 20 250 370 200 30 100

    // return :
    // 23 2 73 2 3

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numbs = sc.nextInt();
        int[] tgt = new int[numbs];

        for (int i=0; i<numbs; i++) {
            int reverseTgt=0;
            int temp = sc.nextInt();
            while(temp > 0) {
                int t = temp % 10;
                reverseTgt = reverseTgt * 10 + t;
                temp = temp/10;
            }

            tgt[i] = reverseTgt;
        }

        String answer = new String();

        for (int i=0; i<tgt.length; i++) {
            boolean flag = true;
            int temp = tgt[i];
            for (int j=2; j<temp; j++) {
                if (temp % j == 0) {
                    flag = false;
                };
            }

            if (flag && temp != 1) {
                answer += temp + " ";
            }
        }

        System.out.println(answer);

    }
}


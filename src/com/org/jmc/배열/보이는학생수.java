package com.org.jmc.배열;

import java.util.Arrays;
import java.util.Scanner;

public class 보이는학생수 {

    // 선생님이 N명의 학생을 일렬로 세웠습니다.
    // 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때,
    // 맨 앞에 서 있는
    // 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요.
    // (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)


    /*

     8
     130 135 148 140 145 150 150 153

     ==> 5 출력
    */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        String[] students = sc.nextLine().split(" ");

        int temp = 0;
        int answer = 0;
        for (int i=0; i<students.length; i++) {
            int bigStudnt = Integer.parseInt(students[i]);
            if (bigStudnt > temp) {
                answer++;
                temp = bigStudnt;
            }
        }

        System.out.println(answer);
    }
}

package com.org.jmc.투포인터슬라이딩윈도;

import java.util.Scanner;

public class 연속된자연수의합 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.next());


        int lt=0;
        int answerCount =0;
        int sum =0;
        for (int rt=0; rt<num; rt++){
            sum += rt;
            if (sum == num) {
                answerCount++;
            }
            while (sum > num) {
                sum-=lt++;
                if (sum==num) {
                    answerCount++;
                }
            }
        }

        System.out.println(answerCount);
    }
}
package com.org.jmc.그외;

import java.util.Scanner;

public class 트레드링스 {

    // 10 -> 4,5 나와야 합니다.
    // 19 -> 4,6


    // 17 -> 4,6
    // 16 -> 4,5

    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        long n = 23;
        long max = 0;
        long min = 0;

        if ( n / 7 <= 1) {

            if (n <= 5) {
                min = 0;
                max = 2;
            } else if(n%7 == 0) {
                min = 2;
                max = 2;
            } else {
                min =1;
                max =2;
            }
            System.out.println("min1 " + min);
            System.out.println("max1 " + max);


        } else {
            min = (n / 7) *2;

            if ((n % 7) - 1 > 2) {
                max = min + 2;
            } else if ((n % 7) - 1 < 2) {
                max = min + 1;
            }
            System.out.println("min2 " + min);
            System.out.println("max2 " + max);

        }


    }
}

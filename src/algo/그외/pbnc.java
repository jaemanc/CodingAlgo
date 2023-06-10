package com.org.jmc.그외;

import java.util.Scanner;

public class pbnc {

    public static void main(String[] args) {

        // 배열로 짤 경우.
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int a=1, b=1, c=0;

        for (int i=2; i<n; i++) {
            c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }


}

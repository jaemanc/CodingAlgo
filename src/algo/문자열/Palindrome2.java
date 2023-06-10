package com.org.jmc.문자열;

import java.util.*;

public class Palindrome2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String target = sc.nextLine().toUpperCase().replaceAll("[^A-Z]", "");

        for (int i=0; i < target.length()/2; i++) {
           if (target.charAt(i) != target.charAt(target.length()-i-1)) {
                System.out.println("NO");
                return;
           }
        }

        // 또는,

        String temp = new StringBuilder(target).reverse().toString();

        if (target.equals(temp)) {
            System.out.println(" 이걸로도 차즌ㄴ구만..?!");
        }

        System.out.println("YES");
    }

}

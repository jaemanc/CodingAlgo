package com.org.jmc.문자열;

import java.util.*;

public class FlippingCertainCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String target = sc.next();

        char[] str = target.toCharArray();
        int lt=0;
        int rt = str.length-1;

        while (lt < rt) {

            if (!Character.isAlphabetic(str[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(str[rt])) {
                rt--;
            } else {
                char tmp = str[lt];
                str[lt] = str[rt];
                str[rt] = tmp;
                lt++;
                rt--;
            }
        }
        String answer = String.valueOf(str);
        System.out.println(answer);
    }
}

package com.org.jmc.배열;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 바로앞수보다큰수 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers = Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String[] strArray = str.split(" ");
        String answer = "";
        answer+=strArray[0];
        for (int i=0; i< strArray.length-1; i++) {

            int iNum = Integer.parseInt(strArray[i]);
            int iNxt = Integer.parseInt(strArray[i+1]);

            if (iNxt > iNum) {
                answer+=" "+strArray[i+1];
            }
        }
        System.out.println(answer);
    }

}

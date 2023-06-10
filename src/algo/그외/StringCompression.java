package com.org.jmc.그외;

import java.util.ArrayList;
import java.util.Arrays;

public class StringCompression {

    public static void main(String[] args ) {

        String s = "abcabcdede";
        System.out.println(solution(s));
    }

    public static int solution( String s ) {
        int answer = 0;

        // 약수 혹은 반으로 나눈 숫자 까지만 갈수있음.
        int maximumDivide = s.length()/2 + 1 ;

        System.out.println(s.length() +" / " + s.length()/2 );

        String a = "";

        for ( int i = 1; i < maximumDivide; i ++ ) {

            ArrayList<String> t = new ArrayList<>();
            ArrayList<String> dividedBlock = new ArrayList<String>();

            a = s.substring(0 , i);
            System.out.println ( " answr : " + a );
            t.add(a);

            while (true) {
                String temp = s.substring(0,i);
                dividedBlock.add(temp);
            }

        }

        return answer;

    }
}












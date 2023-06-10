package com.org.jmc.그외;

import java.util.Scanner;

public class WordFlip {

    //N개의 단어가 주어지면 각 단어를 뒤집어 출력하는 프로그램을 작성하세요.

    //첫 줄에 자연수 N(3<=N<=20)이 주어집니다.
    //두 번째 줄부터 N개의 단어가 각 줄에 하나씩 주어집니다. 단어는 영어 알파벳으로만 구성되어 있습니다.
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer N = sc.nextInt();
        String[] target = new String[N];
        for (int t=0; t<N; t++) {
            target[t] = sc.next();
        }
        String[] answer = new String[N];


        for (int i=0; i<target.length; i++) {
            String temp = target[i];
            StringBuffer sb = new StringBuffer();
            for (int j=temp.length()-1; j>=0; j--) {
                sb.append(temp.charAt(j));
            }
            System.out.println(sb.toString());
        }

    }
}

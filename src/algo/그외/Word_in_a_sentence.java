package com.org.jmc.그외;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Word_in_a_sentence {

    //한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요.
    //
    //문장속의 각 단어는 공백으로 구분됩니다.

    // 공백 정규 표현식.
    //String[] sentenceArray = sentence.split("\\s" );

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String sentence = sc.nextLine();

        String[] sentenceArray = sentence.split(" " );

        String answer = "";
        for (int i = 0 ; i < sentenceArray.length; i ++ ) {
            if (sentenceArray[i].length() > answer.length()) {
                answer = sentenceArray[i];
            }
        }

        System.out.println(answer);
    }
}

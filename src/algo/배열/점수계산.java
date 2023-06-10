package com.org.jmc.배열;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 점수계산 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numbs = Integer.parseInt(sc.next());

        List<Integer> arrayList = new ArrayList<>();

        for (int i=0; i<numbs; i++) {
            arrayList.add(Integer.parseInt(sc.next()));
        }

        int answerCount =0;
        int answer =0;

        for (int t: arrayList){

            if ( t == 1) {
                answerCount++;
                answer+= answerCount;
            } else {
                answerCount=0;
            }

        }
        System.out.println(answer);

    }

}

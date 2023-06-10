package com.org.jmc.배열;

import java.util.*;

public class 등수구하기 {

    //N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
    //
    //같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
    //
    //즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.

    //5
    //87 89 92 100 76  --> 4 3 2 1 5


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int num = Integer.parseInt(sc.next());
        Integer[] answer = new Integer[num];

        for (int i=0; i<num; i++) {
            answer[i] = 1;
            list.add(Integer.parseInt(sc.next()));
        }


        for (int i=0; i<list.size(); i++) {
            for (int j=0; j<list.size(); j++) {
                if (list.get(i) < list.get(j)){
                    answer[i]+=1;
                }
            }
        }

        for(int k=0; k<answer.length; k++){
            System.out.print(answer[k]+" ");
        }
    }

}

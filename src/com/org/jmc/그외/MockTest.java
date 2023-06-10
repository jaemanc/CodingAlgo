package com.org.jmc.그외;

import java.util.Arrays;

public class MockTest {

    public static void main(String[] args) {
        /*
        1번 수포자 :  1, 2, 3, 4, 5, 반복
        2번 수포자 :  2, 1, 2, 3, 2, 4, 2, 5 반복
        3번 수포자 :  3, 3, 1, 1, 2, 2, 4, 4, 5, 5 반복
         */
        // return : 높은 점수를 받은 사람 + 여러명이라면 오름차순으로.
        int[] answers = {1,3,2,4,2};
        int[] one = {1, 2, 3, 4, 5};
        int[] two = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] three = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

        int[][] arrays = {{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};
        int[] counts = new int[3];

        for (int i=0; i < 3; i++) {

            int count = 0;

            int k = 0;
            System.out.println(" 수포자 " +i +"번 학생 채점 시작! " );
            for (int j=0; j < answers.length; j++) {

                System.out.println(" answer : " + answers[j] + " my answer : " + arrays[i][k]);


                if(answers[j] == arrays[i][k]) {
                    count++;
                }

                if (k == arrays[i].length) {
                    k = 0;
                    continue;
                }

                k++;
            }

            counts[i] = count;
        }

        System.out.println(Arrays.toString(counts));

    }


}

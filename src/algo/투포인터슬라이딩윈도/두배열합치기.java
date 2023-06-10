package com.org.jmc.투포인터슬라이딩윈도;

import java.util.ArrayList;
import java.util.Scanner;

public class 두배열합치기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();
        int[] firstArray = new int[firstNum+1];
        for (int i=0; i<firstNum; i++) {
            firstArray[i] = sc.nextInt();
        }
        int secNum = sc.nextInt();
        int[] secArray = new int[secNum];
        for (int i=0; i<secNum; i++) {
            secArray[i] = sc.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();
        int p1 =0, p2=0;

        while ( p1 < firstNum && p2 < secNum ) {
            if (firstArray[p1] < secArray[p2]) {
                answer.add(firstArray[p1++]);
            } else {
                answer.add(secArray[p2++]);
            }
        }

        while (p1<firstNum) answer.add(firstArray[p1++]);
        while (p2<secNum) answer.add(secArray[p2++]);

        for (int i=0; i<answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }

    }

}

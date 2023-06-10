package com.org.jmc.이분검색및정렬;

import java.util.LinkedList;
import java.util.Scanner;

public class 삽입정렬 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.next());

        int[] arr = new int[size];
        for (int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        for (int i=1; i<size; i++) {
            int temp = arr[i];
            int j=0;
            for (j=i-1; j>=0; j--) {
                if (arr[j] > temp ) {
                    arr[j+1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j+1] = temp;
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


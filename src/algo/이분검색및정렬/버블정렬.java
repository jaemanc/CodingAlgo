package algo.이분검색및정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 버블정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.next());

        int[] array = new int[size];
        for (int i=0; i<size; i++) {
            array[i] = Integer.parseInt(sc.next());
        }

        for (int j=0; j<size; j++) {
            for (int i=0; i < size-1-j; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i+1];
                    array[i+1] = array[i];
                    array[i] = temp;
                }
            }
        }

        for (int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}

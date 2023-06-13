package algo.이분검색및정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class 장난꾸러기 {

    //https://cote.inflearn.com/contest/10/problem/06-06

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.next());

        int[] array = new int[size];
        for (int i=0; i<size; i++) {
            array[i] = Integer.parseInt(sc.next());
        }

        int[] temp = Arrays.copyOf(array, array.length);
        Arrays.sort(temp);

        List<Integer> answer = new ArrayList<>();

        for (int i=0; i<size; i++) {

            if (temp[i] != array[i]) {
                answer.add(i+1);
            }
        }

        for (int i=0; i<answer.size(); i++) {
            System.out.print( answer.get(i) + " ");
        }

    }

}

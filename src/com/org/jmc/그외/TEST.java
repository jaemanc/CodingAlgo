package com.org.jmc.그외;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TEST {

    static Set<Integer> hashSet = new HashSet<>();

    public static void main(String[] args) {
        int n = 21;

        int answer =0;


        dfs(0, n);
    }


    public static int dfs (int L, int sum) {

        if (hashSet.contains(sum)) {
            System.out.println(" 주ㅡㅇ복 무한 루프 반복됩니다. ");
            return -1;
        }
        hashSet.add(sum);


        String[] arr = String.valueOf(sum).split("");
        System.out.println(Arrays.toString(arr));
        int[] arrays = new int[arr.length];
        int sumVal = 0;

        for (int i=0; i< arr.length; i++) {
            arrays[i] = Integer.parseInt(arr[i]);
            sumVal += (arrays[i] * arrays[i]);
        }

        if (sumVal == 1) {
            return L;
        } else if (sumVal == 0) {
            return 0;
        } else {
            return dfs(L+1, sumVal);
        }

    }


}

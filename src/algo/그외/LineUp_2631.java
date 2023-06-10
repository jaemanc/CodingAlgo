package com.org.jmc.그외;

public class LineUp_2631 {

    public static void main(String[] args) {
        // 3 7 5 2 6 1 4
        // 최소 방법으로 오름차순 배치 => 최소 수?
        // 3 5 6 의 최장 증가 수열을 제외한 아이들을 옮기는게 포인트
        int[] array = {3,7,5,2,6,1,4};

        int size = array.length;
        int[] dp = new int[size];
        for (int i = 0; i < array.length; i ++ ) {
            dp[i]=1;
            for (int j = 0; j< i; j ++) {
                if(array[j] < array[i] && dp[i] <= dp[j]) {
                    dp[i]++;
                }
            }
        }

        int max = 0;
        for(int i =0; i < dp.length; i ++ ) {
            if (max < dp[i]){
                max = dp[i];
            }
        }

        System.out.println(" ans : " + (size - max));

    }

}
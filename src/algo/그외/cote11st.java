package com.org.jmc.그외;

public class cote11st {

    public static void main(String[] args) {
        //  자릿수마다 더한 값만큼을 다 더해서.
        int N = 1990;
        int origin = N;
        int sum = 0;
        int answer = Integer.MAX_VALUE;
        int returnVal=1;
        while (N > 0 ) {
            sum += N%10;
            N/=10;
        }

        System.out.println(sum);

        boolean breakFlag = true;
        int count =0;
        while (breakFlag) {
            count++;
            int temp =0;
            int target = origin+count;

            while (target > 0 ) {
                temp += target%10;
                target/=10;
            }

            if (temp == sum ) {
                returnVal = origin+count;
                breakFlag =false;
            }

        }

        System.out.println(returnVal);
    }



}

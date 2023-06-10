package com.org.jmc.그외;

public class Camping {

    public static void main(String[] args) {
//        int P = 8;
//        int L = 5;
//        int V = 20;

//        int P = 8;
//        int L = 5;
//        int V = 17;

        int P = 0;
        int L = 0;
        int V = 0;


        // 연속하는 P 일 중에 L 일 동안만 쓸 수 있다.
        // 내 휴가는 V 일 짜리이다.
        // 최대 며칠 쓸 수 있나?!
        int k = 0;
        int i = 0;

        if (V!=0) {
            k = V/P * L;
            i = V%P;
        }

        System.out.println(k+i);







    }

}

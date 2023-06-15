package algo.그외;

import java.util.Arrays;

public class 택배배달과수거하기 {

    public static void main(String[] args) {

        int cap = 4;
        int n = 5;
        int[] deleveries = {1,0,3,1,2};
        int[] pickups = {0,3,0,4,0};

        solution(cap, n, deleveries, pickups);
    }

    public static long solution(int cap, int n, int[] deliveries, int[] pickups){
        long answer = -1;

        int[][] arrays = new int[n][2];

        for (int i=0; i < deliveries.length; i++) {
            arrays[i][0] = deliveries[i];
            arrays[i][1] = pickups[i];
        }

        int bus = 0;
        int del = 0;
        int pic = 0;
        int maxL = 0;

        while (  Arrays.stream(deliveries).sum() <= 0 ) {

            for (int i=n; i>0; i--) {
                if (deliveries[n] == 0 && pickups[n] == 0 ) {
                    continue;
                }
                answer += n;
                del += deliveries[n];
                if (del >= cap) {
                    deliveries[n] =  del - cap;
                    del = cap;
                }

                pic += pickups[n];
                for (int j=i; j>0; j--) {


                }

                if ((pic + pickups[n]) <= cap) {
                    pic += pickups[n];
                    pickups[n] = 0;
                }

            }



            if (pic == cap && del == cap ) {
                maxL = Math.max(maxL, n);
                answer+=maxL;
            }

        }


        return answer;
    }

}

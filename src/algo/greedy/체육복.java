package algo.greedy;

import java.util.Arrays;

public class 체육복 {

    /*

     */

    public static void main(String[] args) {

        int n = 5;
        int[] reserve = {1,3,5};
        int[] lost = {2,4};
        System.out.println(solution(n, lost, reserve));

    }

    public static int solution (int n, int[] lost, int[] reserve) {
        Arrays.sort(reserve);
        Arrays.sort(lost);
        int answer = n - lost.length;

        for (int i=0; i<lost.length; i++) {
            int a = lost[i];
            for (int j=0; j<reserve.length; j++) {
                int b = reserve[j];
                if (a == b) {
                    answer = answer + 1;
                    lost[i] = -100;
                    reserve[j] = -100;
                }
            }
        }

        for (int i=0; i<lost.length; i++) {
            int a = lost[i];
            for (int j=0; j<reserve.length; j++) {
                int b = reserve[j];
                if ( (a-1 == b) || (a+1 == b) ) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }

        return answer;
    }

}

















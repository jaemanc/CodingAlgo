package algo.이분검색및정렬;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class K번째수 {

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        // 2 ~ 5만큼 자르고 정렬 , 3번째 수를 구함. + 4 ~ 4만큼 자르고 정렬, 1번째 수를 구함 + 1 ~ 7만큼 자르고 정렬, 3번째 수를 구함.
        System.out.println(Arrays.toString(solution(array, commands)));

    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int a=0;
        for (int i=0; i<commands.length; i++) {

            int[] arr = new int[commands[i][1]-commands[i][0]+1];
            int t=0;

            for (int j=commands[i][0]-1; j<commands[i][1]; j++) {
                arr[t] = array[j];
                t+=1;
            }

            Arrays.sort(arr);
            answer[a] = arr[commands[i][2]-1];
            a+=1;
        }

        return answer;
    }

}

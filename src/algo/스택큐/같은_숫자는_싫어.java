package algo.스택큐;

import java.util.*;

public class 같은_숫자는_싫어 {

    public static void main(String[] args) {

        int[] arr = {1,1,3,3,0,1,1}; // return 1,3,0,1

        System.out.println(Arrays.toString(solution(arr)));

    }

    public static int[] solution (int [] arr) {
        int[] answer = {};

        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i=1; i<arr.length; i++) {
            if (arr[i] != stack.peek()) {
                stack.push(arr[i]);
            }
        }

        answer = stack.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }


}

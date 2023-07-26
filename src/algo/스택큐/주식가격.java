package algo.스택큐;

import java.util.*;

public class 주식가격 {

    /*
    초 단위로 기록된 주식가격이 담긴 배열 prices가 매개변수로 주어질 때, 가격이 떨어지지 않은 기간은 몇 초인지를 return 하도록 solution 함수를 완성하세요.
    제한사항
    prices의 각 가격은 1 이상 10,000 이하인 자연수입니다.
    prices의 길이는 2 이상 100,000 이하입니다.

    덱으로 풀수 있나봐요.

    입출력 예
    prices	            return
    [1, 2, 3, 2, 3]	    [4, 3, 1, 1, 0]

    확인용 테케 1.
    1,2,3,4,1 => return :
    4,3,2,1,0

     */
    public static void main(String[] args) {

        int[] prices = {1,2,3,4,1};
        System.out.println(Arrays.toString(solution(prices)));
    }

    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Stack<Integer> stack = new Stack();

        for (int i=0; i<prices.length; i++) {
            while (!stack.isEmpty() && prices[i] < prices[stack.peek()]) {
                answer[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }

        // 값을 구하지 못한 index == 끝까지 가격이 떨어지지 않은 주식
        while (!stack.isEmpty()) {
            answer[stack.peek()] = prices.length - stack.peek() - 1;
            stack.pop();
        }

        return null;
    }
}

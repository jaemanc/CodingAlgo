package algo.힙;

import java.util.*;
public class 더_맵게 {

//    scoville	            K	return
//    [1, 2, 3, 9, 10, 12]	7    2
    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        int k = 7;
        System.out.println(solution(scoville, k));
    }

    public static int solution (int[] scoville, int k) {
        int answer = 0;
        Arrays.sort(scoville);

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i=0; i<scoville.length; i++) {
            priorityQueue.offer(scoville[i]);
        }

        while(!priorityQueue.isEmpty()){
            answer++;
            int first = priorityQueue.poll();

            if (first >= k ) {
                return 0;
            }

            if (priorityQueue.isEmpty()) {
                return -1;
            }
            int second = priorityQueue.poll();
            int sum = first + (second*2);

            priorityQueue.offer(sum);
//            System.out.println(" fir : " + first + " sec : " + second + " sum : " + sum);

            if (priorityQueue.peek() >= k) {
                break;
            }
        }

        return answer;
    }

}


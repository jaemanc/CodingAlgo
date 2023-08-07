package algo.힙;

import java.util.*;
public class 디스크_컨트롤러 {

    public static void main(String[] args) {
        // jobs                 	return
        // [[0, 3], [1, 9], [2, 6]]	 9
        int[][] jobs = {{0, 3}, {1, 9}, {2, 6}};
        System.out.println(solution(jobs));
    }

    public static int solution(int[][] jobs) {
        int answer = 0;

        Arrays.sort(jobs, (a,b) -> a[0] - b[0]);

        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o1[1] - o2[1]);

        int index = 0;
        int count = 0;
        int total = 0;
        int end = 0;

        while(count < jobs.length) {

            while(index < jobs.length && jobs[index][0] <= end) {
                pq.add(jobs[index++]);
            }

            if ( pq.isEmpty()) {
                end = jobs[index][0];
            } else {
                int[] cur = pq.poll();
                total += cur[1] + end - cur[0];
                end += cur[1];
                count++;
            }

        }

        return total / jobs.length;
    }

}



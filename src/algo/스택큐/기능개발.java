package algo.스택큐;

import java.util.*;

public class 기능개발 {
    //progresses	    speeds	        return
    //[93, 30, 55]	    [1, 30, 5]	    [2, 1]

    // 7 , 3, 45
    public static void main(String[] args) {
        int[] progress = {93, 30, 55};
        int[] speeds = {1, 30, 5};
        System.out.println(Arrays.toString(solution(progress, speeds)));
    }

    public static int[] solution(int[] progresses, int[] speeds) {

        Queue<Integer> queue = new LinkedList<>();

        for (int i=0; i<progresses.length; i++) {
            int restProgress = 100-progresses[i];
            int needsDays = restProgress / speeds[i];
            if (restProgress % speeds[i] > 0) {
                needsDays+=1;
            }
            queue.offer(needsDays);
        }

        int count = 1;
        int first = queue.poll();
        List<Integer> lis = new ArrayList<>();

        while(!queue.isEmpty()){
            if (first >= queue.peek()) {
                count++;
                queue.poll();
                if (queue.isEmpty()) {
                    lis.add(count);
                    break;
                }
            } else {
                first = queue.peek();
                lis.add(count);
                count = 0;
            }
        }
        int[] answer = lis.stream().mapToInt(Integer::intValue).toArray();

        return answer;
    }

}

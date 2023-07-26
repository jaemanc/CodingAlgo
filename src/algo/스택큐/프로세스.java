package algo.스택큐;

import java.util.*;

public class 프로세스 {

    // priorities	        location	return
    //[2, 1, 3, 2]	        2	        1
    //[1, 1, 9, 1, 1, 1]	0	        5
    public static void main(String[] args) {
//        int[] priorities = {2,1,3,2};
//        int location = 2;

        int[] priorities = {1, 1, 9, 1, 1, 1};
        int location = 0;

        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location) {
        // location 0 부터 시작됨 유의
        int answer = 0;
        Queue<priority> queue = new LinkedList<>();
        for (int i=0; i<priorities.length; i++) {
            int loc = -1;
            if (i == location) {
                loc = location;
            }
            priority temp =new priority(priorities[i],loc);
            queue.offer(temp);
        }

        int count = 0;
        while ( true ) {
            priority target = queue.poll();
            boolean flag = false;
            for (priority item : queue) {
                if (target.pri < item.pri) {
                    queue.offer(target);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                count++;
            }
            if (target.loc == location && !flag) {
                return count;
            }

        }
    }

}

class priority {
    int pri;
    int loc;

    public priority(int pri, int loc) {
        this.pri = pri;
        this.loc = loc;
    }

}
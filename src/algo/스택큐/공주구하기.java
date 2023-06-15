package algo.스택큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class 공주구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.next());
        int num = Integer.parseInt(sc.next());


        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=size; i++) {
            queue.offer(i);
        }
        int answer = 0;
        while (!queue.isEmpty()) {
            for (int i=1; i<num; i++) {
                queue.offer(queue.poll());
            }
            queue.poll();
            if (queue.size()==1)  {
                answer = queue.poll();
            }
        }

        System.out.println(answer);

    }
}

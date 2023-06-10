package com.org.jmc.그외;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Printer {

    public static void main(String[] args ) {

        int[] priorities = {2,1,3,2};
        int location =2;


        System.out.println(solution(priorities, location));
    }

    public static int solution(int[] priorities, int location ){
        int answer = 0;

        Queue<Integer> queue_list = new LinkedList<>();

        for (int k : priorities) {
            queue_list.offer(k);
        }

        // location = 내가 요청한 문서가 몇 번쨰로 인쇄가 되는가???
        for (int i = 0 ; i < location ; i ++) {
            int peeked_num = queue_list.peek();

            int k = queue_list.stream().filter(c -> c > peeked_num).findFirst().get();
            System.out.println( " k : " + k + " / " + peeked_num);

            if (peeked_num < k ) {
                queue_list.add(queue_list.peek());
                queue_list.poll();
                i--;
            } else {
                i ++;
            }
            answer++;
        }

        return answer;
    }




}

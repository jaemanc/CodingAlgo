package com.org.jmc.그외;


import java.util.*;
import java.util.stream.Collectors;

public class FunctionDev {

    public static void main(String[] args) {

        int[] progresses = {93, 30, 55};
        int[] speeds = {1,30,5};

//        int[] progresses = {95, 90, 99, 99, 80, 99};
//        int[] speeds = {1, 1, 1, 1, 1, 1};

        solution(progresses, speeds);

    }

    public static int[] solution(int[] progresses, int[] speeds){

        // Stack<Integer> stack = new Stack<Integer>();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0 ; i < progresses.length; i ++ ) {
            int count = 0;

            while (progresses[i] < 100) {
                progresses[i] += speeds[i];
                count++;
            }
            queue.add(count);
        }

        int temp = 0 ;
        int count_num = 0;

        List<Integer> lists = new ArrayList<>();

        int k = queue.peek();

        while ( !queue.isEmpty() ) {
            temp = queue.poll();

            if ( k >= temp ) {
                // 동시 배포 할 작업 개수를 늘린다.
                count_num++;

            } else {
                // 배포 했으므로, 작업 개수를 초기화한다.
                lists.add(count_num);
                count_num = 1;
            }

            if (queue.isEmpty()) {
                lists.add(count_num);
            }

            if ( k < temp ) {
                k = temp;
            }

        }

        int[] answer = new int[lists.size()];

        for (int i = 0 ; i < lists.size(); i ++ ) {
            answer[i] = lists.get(i);
        }

        return answer;
    }



}

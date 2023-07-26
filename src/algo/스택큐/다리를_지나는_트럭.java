package algo.스택큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class 다리를_지나는_트럭 {

    /*
    bridge_length	        weight        	truck_weights   	    return
    2	                    10	            [7,4,5,6]	            8
    100	                    100         	[10]                	101
    100                 	100	            [10,10,10,10,10,10,10,10,10,10]	110
     */
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        System.out.println(solution(bridge_length, weight, truck_weights));
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> queue = new LinkedList<>();
        for (int i=0; i<truck_weights.length; i++) {
            queue.offer(truck_weights[i]);
        }

        while (!queue.isEmpty()) {
            int truckNum = 0;
            int count = 0;
            int 무게 = weight;
            int target = queue.poll();
            System.out.println("다리위로 진입 : "+ target);
            truckNum++;
            while ( !queue.isEmpty()&& 무게 - target >= 0 ) {
                int nextTruck = queue.peek();

                if (무게 - target - nextTruck > 0) {
                    queue.poll();
                    truckNum++;
                    무게-=nextTruck;
                    System.out.println(" 하나 더 진입 : " + nextTruck+ " / 무게 : " + 무게);
                } else {
                    break;
                }
            }

            count+=bridge_length+truckNum;
            System.out.println(" 건넜다 : " + count+ "  초 소요! ");
            answer+=count;
        }

        return answer;
    }

}

package algo.스택큐;

import java.util.*;

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
        int sum = 0;
        int time = 0;

        // 큐 = 다리에 올라간 트럭으로 인식해야 한다.
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i=0; i< truck_weights.length; i++) {
            int truck = truck_weights[i];

            while( true ) {
                if (deque.isEmpty()) {
                    deque.add(truck);
                    sum += truck;
                    time ++; // 다리 오름
                    break;
                } else if (deque.size() == bridge_length) {
                    sum -= deque.poll();
                } else {
                    if (sum + truck <= weight) {
                        deque.add(truck);
                        sum += truck;
                        time++;
                        break;
                    } else {
                        // 다리에 있는 트럭에 0값을 넣는 것 == 트럭이 다리를 건너는 것과 마찬가지라고 생각해야 함.
                        deque.add(0);
                        time++;
                    }

                }
            }
        }
        return time + bridge_length;
    }

}


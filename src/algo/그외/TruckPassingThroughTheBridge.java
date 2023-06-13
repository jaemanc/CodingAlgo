package algo.그외;

import java.util.*;
import java.util.stream.Collectors;

public class TruckPassingThroughTheBridge {

    /*
    * 트럭 여러 대가 강을 가로지르는 일차선 다리를 정해진 순으로 건너려 합니다.
    * 모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다.
    * 다리에는 트럭이 최대 bridge_length대 올라갈 수 있으며, 다리는 weight 이하까지의 무게를 견딜 수 있습니다.
    * 단, 다리에 완전히 오르지 않은 트럭의 무게는 무시합니다.
    * 예를 들어, 트럭 2대가 올라갈 수 있고 무게를 10kg까지 견디는 다리가 있습니다.
    * 무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.
    */


    public static void main(String[] args) {
        // test case  ::

        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = {7,4,5,6};
        // return : 8

        //int bridge_length = 100;
        //int weight = 100;
        //int[] truck_weights = {10};
        // return : 101

//        int bridge_length = 100;
//        int weight = 100;
//        int[] truck_weights = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10};

        System.out.println(solution(bridge_length, weight, truck_weights));

    }
    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0 ;

        Queue<Integer> pass_brdg_truck = new LinkedList<>();

        int second = 0;

        int all_weights = 0;

        // 1대 넣고 시작했으니까 인덱스는 1부터 시작.

        // 다리의 길이도 고려해야한다. 다리의 길이가 100이라면 건너는 시간도 100이 들어가야한당..
//        while ( pass_brdg_truck.size() != 0 ) {

        int i = 0;


        // 7456 순서로 들어간다.

        for (int j = 0 ; j < truck_weights.length; j ++) {
            // 다리 길이 제한이 안 걸려있고, weight 보다 무게가 덜 나가그?
            while ( pass_brdg_truck.size() < bridge_length && all_weights < weight ) {
                System.out.println(" 현재 다리 무게 : " + all_weights );

                if (  ( all_weights + truck_weights[i] ) <= weight ){
                    pass_brdg_truck.offer(truck_weights[i]);
                    System.out.println( i +" 번째 트럭 (" + truck_weights[i]+ "톤) 이 다리에 진입." );
                    all_weights+=truck_weights[i];
                    i++;

                } else {
                    System.out.println(" 진입 실패 ! 무게 초과 !! ");
                    all_weights = pass_brdg_truck.stream().reduce(0, Integer::sum);
                    pass_brdg_truck.poll();
                }

//                all_weights = pass_brdg_truck.stream().reduce(0, Integer::sum);
//                pass_brdg_truck.poll();

                second++;
                System.out.println(" 초 경과 :: " + second + "초");
            }

        }

        // 마지막 트럭이 다 빠졌다면 다리 길이를 계산한다.
        second += bridge_length;
        System.out.println(" ANSWER >>> " + second);

        return answer;

    }
}

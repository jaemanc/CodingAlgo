package algo.해시맵트리셋정렬;

import java.util.*;

public class 폰켓몬 {
    public static void main(String[] args) {
        /*
            6마리의 폰켓몬이 있으므로, 3마리의 폰켓몬을 골라야 합니다.
            가장 많은 종류의 폰켓몬을 고르기 위해서는 3번 폰켓몬 한 마리와 2번 폰켓몬 두 마리를 고르거나,
            혹은 3번 폰켓몬 두 마리와 2번 폰켓몬 한 마리를 고르면 됩니다. 따라서 최대 고를 수 있는 폰켓몬 종류의 수는 2입니다.
         */

        int[] nums = {3,3,3,2,2,2}; // result = 2;
        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        // 선택은 최대 n/2 마리.
        Map<Integer,Integer> map = new HashMap<>();
        Integer[] arr = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(arr);

        for (int i=0; i<arr.length; i++) {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        return map.size() > nums.length / 2 ? nums.length / 2 : map.size();
    }

}




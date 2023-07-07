package algo.해시맵트리셋정렬;

import java.util.*;

public class 의상 {

    /*
    코니는 각 종류별로 최대 1가지 의상만 착용할 수 있습니다. 예를 들어 위 예시의 경우 동그란 안경과 검정 선글라스를 동시에 착용할 수는 없습니다.
    착용한 의상의 일부가 겹치더라도, 다른 의상이 겹치지 않거나, 혹은 의상을 추가로 더 착용한 경우에는 서로 다른 방법으로 옷을 착용한 것으로 계산합니다.
    코니는 하루에 최소 한 개의 의상은 입습니다.
     */

    public static void main(String[] args) {
        // String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}}; // return 3;

        String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}}; // return 5;
        System.out.println(solution(clothes));
    }

    public static int solution(String[][] clothes) { // 옷의 가짓수 조합 안입는 경우 -1
        int answer = 1;
        Map<String,Integer> gazitsu = new HashMap<>();

        for (int i=0; i<clothes.length; i++) {
            gazitsu.put( clothes[i][1], gazitsu.getOrDefault(clothes[i][1],1)+1);
        }

        for (String kind : gazitsu.keySet()) {
            answer *= gazitsu.get(kind);
        }

        return answer-1;
    }

}

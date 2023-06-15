package algo.해시맵트리셋정렬;

import java.util.*;

public class 매출액의종류 {

    //현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
    //각 구간별로 구하라고 했습니다.
    //만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
    //20 12 20 10 23 17 10
    //각 연속 4일간의 구간의 매출종류는
    //첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
    //두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
    //세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
    //네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.

    //N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
    //매출액의 종류를 출력하는 프로그램을 작성하세요.

    //7 4
    //20 12 20 10 23 17 10
    // --> 3 4 4 3 출력

    // 이렇게 풀면 타임아웃...
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.next());
        int arraySize = Integer.parseInt(sc.next());

        String[] arrays = new String[size];
        for (int i=0; i<size; i++) {
            arrays[i] = sc.next();
        }
        for (int i=0; i<= size-arraySize; i++) {
            Map<String,Integer> map = new HashMap<>();
            for (int j=i; j < arraySize+i; j++) {
                map.put(arrays[j],map.getOrDefault(arrays[j],0)+1);
            }
            System.out.print(map.size()+ " ");
        }
    }*/

    // hash / sliding window 방식으로 써야 함. + 투포인터
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.next());
        int arraySize = Integer.parseInt(sc.next());

        int[] arrays = new int[size];
        for (int i=0; i<size; i++) {
            arrays[i] = Integer.parseInt(sc.next());
        }

        HashMap<Integer,Integer> hmap = new HashMap<>();
        for (int i=0; i<arraySize-1; i++) {
            hmap.put(arrays[i], hmap.getOrDefault(arrays[i],0)+1);
        }

        // 투포인터 용
        int lt=0;
        ArrayList<Integer> answer = new ArrayList<>();
        for (int rt= arraySize-1; rt<size; rt++) {
            hmap.put(arrays[rt], hmap.getOrDefault(arrays[rt],0)+1);
            answer.add(hmap.size());
            hmap.put(arrays[lt], hmap.get(arrays[lt])-1);
            if (hmap.get(arrays[lt])==0) {
                hmap.remove(arrays[lt]);
            }
            lt++;
        }

        for (int i=0; i<answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }

    }


}



















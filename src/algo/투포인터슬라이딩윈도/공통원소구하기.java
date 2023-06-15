package algo.투포인터슬라이딩윈도;

import java.sql.Array;
import java.util.*;

public class 공통원소구하기 {

    //A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.

    //첫 번째 줄에 집합 A의 크기 N(1<=N<=30,000)이 주어집니다.
    //
    //두 번째 줄에 N개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
    //
    //세 번째 줄에 집합 B의 크기 M(1<=M<=30,000)이 주어집니다.
    //
    //네 번째 줄에 M개의 원소가 주어집니다. 원소가 중복되어 주어지지 않습니다.
    //
    //각 집합의 원소는 1,000,000,000이하의 자연수입니다.

    // -->  투 포인터스 알고리즘. --> 오름차순 정렬이 필수다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.next());
        int[] aArray = new int[a];
        for (int i=0; i<a; i++) {
            aArray[i] = Integer.parseInt(sc.next());
        }

        int b = Integer.parseInt(sc.next());
        int[] bArray = new int[b];
        for (int i=0; i<b; i++) {
            bArray[i] = Integer.parseInt(sc.next());
        }

        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(aArray);
        Arrays.sort(bArray);

        int p1 = 0, p2 = 0;
        while (p1 < aArray.length && p2 < bArray.length) {
            if (aArray[p1] == bArray[p2]) {
                answer.add(aArray[p1]);
                p1++;
                p2++;
            } else if (aArray[p1] < bArray[p2]) {
                p1++;
            } else {
                p2++;
            }
        }
        for (int i=0; i<answer.size(); i++) {
            System.out.print(answer.get(i) + " ");
        }
    }


}

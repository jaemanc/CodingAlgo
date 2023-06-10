package com.org.jmc.그외;

import java.util.*;

//이 문제는 아주 평범한 배낭에 관한 문제이다.
//한 달 후면 국가의 부름을 받게 되는 준서는 여행을 가려고 한다. 세상과의 단절을 슬퍼하며 최대한 즐기기 위한 여행이기 때문에, 가지고 다닐 배낭 또한 최대한 가치 있게 싸려고 한다.
//준서가 여행에 필요하다고 생각하는 N개의 물건이 있다.
// 각 물건은 무게 W와 가치 V를 가지는데,
// 해당 물건을 배낭에 넣어서 가면 준서가 V만큼 즐길 수 있다.
// 아직 행군을 해본 적이 없는 준서는 최대 K만큼의 무게만을 넣을 수 있는 배낭만 들고 다닐 수 있다.
// 준서가 최대한 즐거운 여행을 하기 위해 배낭에 넣을 수 있는 물건들의 가치의 최댓값을 알려주자.


//첫 줄에 물품의 수 N(1 ≤ N ≤ 100)과
// 준서가 버틸 수 있는 무게 K(1 ≤ K ≤ 100,000)가 주어진다.
// 두 번째 줄부터 N개의 줄에 거쳐 각 물건의 무게 W(1 ≤ W ≤ 100,000)와
// 해당 물건의 가치 V(0 ≤ V ≤ 1,000)가 주어진다.
//입력으로 주어지는 모든 수는 정수이다.

// 출력 : 배낭에 넣을 수 있는 물건들의 가치합의 최댓값

// 예제 입력 1 :
//4 7
//6 13
//4 8
//3 6
//5 12  --> 출력 : 14


public class 백준_평범한배낭_냅색 {

    static int n; // 물품 개수
    static int k; // 최대 무게
    static int maxV;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt();
        k = sc.nextInt();

        ArrayList<BagPoint> arr = new ArrayList<>();

        for (int i=0; i<n; i++) {
            arr.add(new BagPoint(sc.nextInt(), sc.nextInt()));
        }

        napsack(0, 0,0, arr);
        System.out.println(" 최대 가치 값 : " + maxV);
    }

    // 냅색 없이 갈 경우. 재귀
    public static void napsack (int L, int w, int value, List<BagPoint> arr) {

        if (w <= k) {
            maxV = Math.max(maxV, value);
        }

        if (L > arr.size()) {
            return;
        } else {
            for (int i=0; i<arr.size(); i++) {
                napsack(L+1, w+arr.get(i).w, value + arr.get(i).v, arr);
            }
        }

    }

}

class BagPoint {
    int w;
    int v;

    public BagPoint(int w, int v) {
        this.w = w;
        this.v = v;
    }

}


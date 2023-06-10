package com.org.jmc.greedy;

import java.util.*;

public class 씨름선수 {

    //현수는 씨름 감독입니다. 현수는 씨름 선수를 선발공고를 냈고, N명의 지원자가 지원을 했습니다.
    //현수는 각 지원자의 키와 몸무게 정보를 알고 있습니다.
    //현수는 씨름 선수 선발 원칙을 다음과 같이 정했습니다.
    //“A라는 지원자를 다른 모든 지원자와 일대일 비교해서 키와 몸무게 모두 A지원자 보다 높은(크고, 무겁다) 지원자가
    //존재하면 A지원자는 탈락하고, 그렇지 않으면 선발된다.”
    //N명의 지원자가 주어지면 위의 선발원칙으로 최대 몇 명의 선수를 선발할 수 있는지 알아내는 프로그램을 작성하세요.

    //첫째 줄에 지원자의 수 N(5<=N<=30,000)이 주어집니다.
    //두 번째 줄부터 N명의 흰돌 능력치와 검은돌 능력치 정보가 차례로 주어집니다.
    //각 선수의 흰돌능력치가 모두 다르고, 검은돌 능력치도 모두 다릅니다. 능력치 값은 1,000,000이하의 자연수입니다.
    // 그리디 : 현재 시점에서 제일 좋은 것을 선택한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        ArrayList<Body> arr = new ArrayList<>();

        for (int i=0; i<n; i++) {
            arr.add(new Body(Integer.parseInt(sc.next()), Integer.parseInt(sc.next())));
        }

        Collections.sort(arr);

        int cnt = 0;

        int max = Integer.MIN_VALUE;
        for (Body body : arr) {
            if (body.h > max) {
                max = body.h;
                cnt++;
            }
        }
        System.out.println(cnt);

    }


}

class Body implements Comparable<Body> {
    int w,h;
    public Body(int w, int h) {
        this.w = w;
        this.h = h;
    }

    @Override
    public int compareTo(Body o) {
        if (this.w==o.w) {
            // 음수값 리턴 --> 오름차순.
            // return this.h-o.h;

            // 내림차순이라면 -> 양수 리턴
            return o.h  - this.h  ;

        } else {
            // return this.w-o.w;

            // 내림차순이라면 ->
            return  o.w - this.w ;
        }
    }
}



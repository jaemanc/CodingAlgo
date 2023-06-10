package com.org.jmc.greedy;

import java.util.*;

public class 회의실배정_답 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        List<Time> arr = new ArrayList<>();

        for (int i=0; i<n; i++) {
            arr.add(new Time(Integer.parseInt(sc.next()),Integer.parseInt(sc.next())));
        }

        Collections.sort(arr);

        int et = 0;
        int cnt=0;
        for (Time ob : arr) {
            if (ob.s >= et) {
                cnt++;
                et = ob.e;
            }
        }

        System.out.println(cnt);
    }

}

// 정렬이 포인트임 굳이 재귀로 할 필요가 없음..
class Time implements Comparable<Time> {

    public int s,e;

    Time (int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o) {

        // 끝나는 시간(오름차순) 동일할 경우 시작 시간 오름차순 정렬
        // 음수값 리턴 --> 오름차순.
        if (this.e == o.e) {
            return this.s - o.s;
        } else {
            return this.e - o.e;
        }
    }
}


package com.org.jmc.greedy;

import java.util.*;

public class 결혼식 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());

        List<Member_a> arr= new ArrayList<>();

        for (int i=0; i<n; i++) {
            int s = Integer.parseInt(sc.next());
            int e = Integer.parseInt(sc.next());
            arr.add(new Member_a(s,'s'));
            arr.add(new Member_a(e,'e'));
        }

        Collections.sort(arr);
        int answer = Integer.MIN_VALUE;
        int cnt =0;

        // 존나 허무하네 ;;
        for (Member_a ob : arr) {
            if (ob.state =='s') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }

        System.out.println(answer);
    }
}

class Member_a implements Comparable<Member_a>{
    int time;
    char state;

    Member_a(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Member_a o) {

        if (this.time==o.time ) {
            return this.state - o.state; // 알파벳으로 정렬.
        } else {
            return this.time - o.time;
        }

    }
}








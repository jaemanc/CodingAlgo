package algo.greedy;

import java.util.*;

public class 회의실배정_재귀_정렬_타임리밋나옴 {

    //한 개의 회의실이 있는데 이를 사용하고자 하는 n개의 회의들에 대하여 회의실 사용표를 만들려고 한다.
    //각 회의에 대해 시작시간과 끝나는 시간이 주어져 있고, 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 최대수의 회의를 찾아라.
    //단, 회의는 한번 시작하면 중간에 중단될 수 없으며 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다.
//첫째 줄에 회의의 수 n(1<=n<=100,000)이 주어진다. 둘째 줄부터 n+1 줄까지 각 회의의 정보가 주어지는데
//
//이것은 공백을 사이에 두고 회의의 시작시간과 끝나는 시간이 주어진다. 회의시간은 0시부터 시작한다.
//
//회의의 시작시간과 끝나는 시간의 조건은 (시작시간 <= 끝나는 시간)입니다.

    //5 -- 입력
    //1 4
    //2 3
    //3 5
    //4 6
    //5 7
    // 출력 : 3
    static int n;
    static int answer=0;

    public static void dfs(int L, int x, int y, List<Meeting> arr) {

        if (x == (n-1) || y == (n-1)) {
            answer = Math.max(answer,L);
        } else {
            int endTime = arr.get(y).e;
            for (int i=y; i<n; i++) {
                if (arr.get(i).s >= endTime) {
                    dfs(L+1,i,i,arr);
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(sc.next());

        List<Meeting> arr = new ArrayList<>();

        for (int i=0; i<n; i++) {
            arr.add(new Meeting(Integer.parseInt(sc.next()),Integer.parseInt(sc.next())));
        }

        // 끝나는 시간이 기준이 되었어야 한다.
        Collections.sort(arr);

        // 정렬 기준이 잘못됨.
        for (int i=0; i<n; i++) {
            dfs(1, i,i,arr);
        }

        System.out.println(answer);
    }

}

class Meeting implements Comparable<Meeting>{
    int s,e;
    public Meeting(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Meeting o) {

        return this.s - o.s;
    }
}



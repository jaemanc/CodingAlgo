package algo.greedy;

import java.util.*;

public class 최대수입스케줄 {

    static int n, max = Integer.MIN_VALUE;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(sc.next());

        ArrayList<lecture> arr = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int m = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());
            arr.add(new lecture(m,d));
            if (d > max) max=d;
        }

        PriorityQueue<Integer> Q = new PriorityQueue(Collections.reverseOrder());
        Collections.sort(arr);

        int j=0;
        int answer=0;
        for (int i=max; i>=1; i--) {

            // J 를 밖에 선언하는 이유가 있음.
            // i 가 5라면 5 time을 큐에 넣고 break;  <-- j는 0
            // 그 다음 반복문에서는 i 가 4 이면서 j는 1이 되기 때문임.
            for ( ; j<n; j++) {
                if (arr.get(j).time < i )break;
                Q.offer(arr.get(j).money);
            }
            if (!Q.isEmpty()) {
                // 가장 페이가 큰 강연을 poll 한다 ! Q는 priority Queue로 선언했기 때문에.
                answer += Q.poll();
            }
        }

        System.out.println(answer);


    }
}

class lecture implements Comparable<lecture> {
    int money;
    int time;

    public lecture(int pay, int day) {
        this.money = pay;
        this.time = day;
    }

    // 시간 기준으로 내림차순 정렬
    @Override
    public int compareTo(lecture o) {
        return o.time - this.time;
    }
}

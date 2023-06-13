package algo.greedy;

import java.util.*;

public class 원더랜드_크루스칼 {

    static int[] unf;

    public static int find(int a) {
        if (unf[a] == a) {
            return a;
        } else {
            return unf[a] = find(unf[a]);
        }
    }

    public static void union (int a, int b) {
        int fa = find(a);
        int fb = find(b);

        if (fa!=fb) {
            unf[fa] = fb;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        ArrayList<City> arr = new ArrayList<>();
        unf = new int[m+1];

        for (int i=1; i<=n; i++) {
            unf[i] = i;
        }

        for (int i=0; i< m; i++) {
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());

            arr.add(new City(a,b,c));
        }

        int answer =0;
        // 비용순 정렬
        Collections.sort(arr);

        // 트리가 되어야 하므로, 공통의 합쳐진 회로가 되어선 안된다.
        for (City ct : arr) {
            int fv1 = find(ct.v1);
            int fv2 = find(ct.v2);

            if (fv1 != fv2) { // 그래서 회로가 아닌 케이스 ( 안 이어저 있던 경우에만 ) 유니온 처리.
                answer += ct.cost;
                union(ct.v1, ct.v2);
            }
        }
        System.out.println(answer);
    }
}

class City implements Comparable<City>{
    public int v1;
    int v2;
    int cost;

    public City(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(City o) {
        return this.cost - o.cost;
    }
}

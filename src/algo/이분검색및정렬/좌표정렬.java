package algo.이분검색및정렬;

import java.util.*;

class Point implements Comparable<Point> {
    public int x,y;
    Point(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x==o.x) {
            // 음수값 리턴 --> 오름차순.
            return this.y-o.y;

            // 내림차순이라면 ->
            // return o.y - this.y;

        } else {
           return this.x-o.x;

           // 내림차순이라면 ->
           // return o.x-this.x;

        }
    }
}

public class 좌표정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = Integer.parseInt(sc.next());

        List<Point> arr = new ArrayList<>();
        for (int i=0; i<size; i++) {
            int x= sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Point(x,y));
        }
        Collections.sort(arr);

        for (Point o : arr) {
            System.out.println(o.x + " " + o.y);
        }

    }

}

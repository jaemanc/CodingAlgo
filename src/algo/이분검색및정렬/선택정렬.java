package algo.이분검색및정렬;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 선택정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbs = sc.nextInt();
        List<Integer> target = new ArrayList<>();

        for (int i=0; i<numbs; i++) {
            target.add(Integer.parseInt(sc.next()));
        }

        for (int i=0; i<target.size(); i++) {
            for (int j=0; j< target.size()-1; j++) {
                if (target.get(j) > target.get(j+1)) {
                    int temp = target.get(j+1);
                    target.set(j+1, target.get(j));
                    target.set(j,temp);
                }
            }
        }

        for (int i=0; i< target.size(); i++) {
            System.out.print(target.get(i) + " ");
        }
    }

}

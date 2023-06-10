package com.org.jmc.이분검색및정렬;

import java.util.*;

public class 이분검색 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        int[] array = new int[n];
        for (int i=0; i< n; i++) {
            array[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(array);
        int answer = 0;

        int lt=0, rt =n-1;

        // 검색 타겟보다 큰값인지 작은 값인지
        // 계속 서치해나감
        while (lt<=rt) {
            int mid=(lt + rt) / 2;
            if (array[mid]==m) {
                answer = mid+1; // 정답의 index 는 0이 아닌 1부터 시작하니까.
                break;
            }
            if (array[mid]>m) {
                rt=mid-1;
            } else {
                lt=mid+1;
            }
        }

        System.out.println(answer);

    }




    // 내가 푼거?
    // 이건 그냥 중간 부터 탐색이고 이분검색이랑은 달라.
    // 답이 나오기는 해 하지만 이분검색은 이런게 아냐!
   /* public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        int[] array = new int[n];
        for (int i=0; i< n; i++) {
            array[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(array);
        int answer = 0;
        int lt =(n/2)-1, rt =n/2;
        while (true) {

            if (array[lt] == m ) {
                answer= lt;
                break;
            }

            if (array[rt] ==m ) {
                answer = rt;
                break;
            }

            lt-=1;
            rt+=1;
        }
        System.out.println(answer+1);
    }*/

}

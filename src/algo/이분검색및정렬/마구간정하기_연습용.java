package algo.이분검색및정렬;

import java.util.Arrays;
import java.util.Scanner;

public class 마구간정하기_연습용 {

    // 이진검색 결정 알고리즘 생각보다 어려움...?
    // 실제 코테에서 이런 유형이 나오면 이로직이 생각이 날까 싶은데요..?

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(arr);

        int lt=1;
        int rt = arr[n-1];
        int answer =0;

        while (lt <= rt) {
            int mid = (lt+rt)/2;
            if (count(arr,mid) >= c) {
                answer = mid;
                lt= mid+1;
            } else {
                rt = mid-1;
            }
        }

        System.out.println(answer);
    }

    public static int count(int[] arr, int dist) {
        int cnt=1;
        int ep =arr[0];

        for (int i=1; i<arr.length; i++) {
            if ((arr[i]-ep) >= dist) {
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }

}



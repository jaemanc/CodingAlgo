package algo.이분검색및정렬;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class 마구간정하기_결정알고리즘 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int c = Integer.parseInt(sc.next());

        int[] arr = new int[n];

        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        Arrays.sort(arr);

        int lt=0, rt=0;

        rt = Arrays.stream(arr).max().getAsInt();
        lt = Arrays.stream(arr).min().getAsInt();

        int answer=0;

        while (lt <= rt) {
            int mid = (lt+rt)/2;
            if (count(arr,mid) >= c) {
                answer = mid;
                lt = mid+1;
            } else {
                rt = mid-1;
            }
        }
    }

    public static int count(int[] arr, int dist) {
        // 말의 마리수
        int cnt=1;
        int ep=arr[0];

        // 배열은 메소드 아니고 변수입니다 그러니까 소괄호하지마세요
        for (int i=0; i<arr.length; i++) {
            if (arr[i] - ep >= dist ) {
                cnt++;
                ep=arr[i];
            }
        }
        return cnt;
    }
}













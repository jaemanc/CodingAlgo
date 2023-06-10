package com.org.jmc.투포인터슬라이딩윈도;

import java.util.*;

public class 연속부분수열 {

    //N개의 수로 이루어진 수열이 주어집니다.
    //
    //이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
    //
    //만약 N=8, M=6이고 수열이 다음과 같다면
    //
    //1 2 1 3 1 1 1 2
    //
    //합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.

    //8 6
    //1 2 1 3 1 1 1 2 --> 3 리턴

    // 복합적 문제  --> 슬라이딩 윈도우 방식으로 푼다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        int m = Integer.parseInt(sc.next());

        ArrayList<Integer> array = new ArrayList();
        for (int i=0; i<n; i++) {
            array.add(Integer.parseInt(sc.next()));
        }

        int lt = 0;
        int rt = 1;
        int sum = 0;
        int answer = 0;
        sum+=array.get(lt);
        sum+=array.get(rt);
        while (rt < array.size() && lt < array.size()) {

            if (sum == m) {
                answer++;
                sum-=array.get(lt);
                lt++;
                rt++;
                if (lt == array.size() || rt == array.size()) {
                    break;
                }
                sum+=array.get(rt);
            } else if (sum < m) {
                rt++;
                if ( rt == array.size()) {
                    break;
                }
                sum += array.get(rt);
            } else if (sum > m ){
                sum-= array.get(lt);
                lt++;
            }
        }
        System.out.println(answer);

    }

    // 센세--코드-->

    /*int answer =0;
    int sum =0;
    int lt =0;

    for (int rt=0; rt<n; rt++) {
        sum+=arr[rt];
        if (sum==m) answer++;
        while(sum>=m){
            sum-=arr[lt++];
            if(sum==m) answer++;
        }
    }*/

    //


}

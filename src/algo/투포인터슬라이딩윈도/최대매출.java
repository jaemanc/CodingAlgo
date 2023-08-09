package algo.투포인터슬라이딩윈도;

import java.util.Scanner;

public class 최대매출 {

    //현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
    //
    //만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
    //12 15 11 20 25 10 20 19 13 15 --> 56 출력
    //연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
    //
    //여러분이 현수를 도와주세요.

    // 문제는 어렵지 않으나 타임 리밋이 걸림.
    
    //10 3

    // 슬라이딩 윈도우 방식이 아닌 아래와 같은 풀이는
    // 타임아웃 나옵니다.
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        int[] aArray = new int[N];
        for (int i=0; i<N; i++) {
            aArray[i] = Integer.parseInt(sc.next());
        }

        int answer = Integer.MIN_VALUE;
        for (int i=0; i<=N-M; i++) {
            int temp = 0;
            for (int j=0; j<M; j++) {
                temp += aArray[i+j];
            }
            answer = Math.max(temp, answer);
        }

        System.out.println(answer);

    }*/

    // O(n^2) 이 아닌 O(n) 으로 푸는 연습을 해야 함.
    // 슬라이딩 윈도우로 하면 위와 달리 반복문을 생략할수있다.
    // 반복문 = K의 수가 클 수록 더 많은 메모리를 소모하기때문에.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = Integer.parseInt(sc.next());
        int M = Integer.parseInt(sc.next());

        int[] aArray = new int[N];
        for (int i=0; i<N; i++) {
            aArray[i] = Integer.parseInt(sc.next());
        }

        int sum =0;
        int answer = 0;
        for (int i=0; i<M; i++) {
            sum +=aArray[i];
        }
        answer = sum;

        for (int i=M; i<N; i++) {
            sum+=(aArray[i] - aArray[i-M]);
            answer=Math.max(answer, sum);
        }
        System.out.println(answer);
    }


}

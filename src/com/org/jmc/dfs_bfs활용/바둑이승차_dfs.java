package com.org.jmc.dfs_bfs활용;


import java.util.*;

public class 바둑이승차_dfs {

    // 아마존 인터뷰의 부분집합과 같은 문제임.

    //철수는 그의 바둑이들을 데리고 시장에 가려고 한다. 그런데 그의 트럭은 C킬로그램 넘게 태울수가 없다.
    //철수는 C를 넘지 않으면서 그의 바둑이들을 가장 무겁게 태우고 싶다.
    //N마리의 바둑이와 각 바둑이의 무게 W가 주어지면, 철수가 트럭에 태울 수 있는 가장 무거운 무게를 구하는 프로그램을 작성하세요.

    //첫 번째 줄에 자연수 C(1<=C<=100,000,000)와 N(1<=N<=30)이 주어집니다.
    //둘째 줄부터 N마리 바둑이의 무게가 주어진다.

    // 입력 :
    //259 5
    //81
    //58
    //42
    //33
    //61  --> 출력 : 242

    static int[] arr;
    static int answer;
    static int L;
    static int c;

    static void dfs (int n,int sum, int[] arr) {
        if (sum > c) {
            return;
        }
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            dfs(n+1,sum+arr[n], arr);  // 바둑이를 태운다!
            dfs(n+1,sum, arr); // 바둑이를 태우지 않는다!
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        c = Integer.parseInt(sc.next());
        L = Integer.parseInt(sc.next());

        arr = new int[L];
        for (int i=0; i<L; i++) {
            arr[i] = Integer.parseInt(sc.next());
        }

        dfs(0,0, arr);
        System.out.println(answer);
    }
}



package algo.dfs_bfs활용;

import java.util.Scanner;

public class 순열구하기 {

    // 10 이하의 N개의 자연수가 주어지면 이 중 M 개를 뽑아 일렬로 나열하는
    // 방법을 모두 출력합니다.

    // 입력 :
    // 3 2
    // 3 6 9

    // 답 :
    // 3 6
    // 3 9
    // 6 3
    // 6 9
    // 9 3
    // 9 6

    static int N;
    static int M;
    static int[] chk;
    static int[] pm;
    static int[] arr;

    public static void dfs (int L) {

        if (L == M) {

            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i=0; i<N; i++) {
                if (chk[i] == 0 ) {
                    chk[i] = 1;
                    pm[L] = arr[i];
                    dfs(L+1);

                    // 왜 풀어야 하는가 ?
                    chk[i] = 0;
                }
            }


        }


    }

   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       N = Integer.parseInt(sc.next());
       M= Integer.parseInt(sc.next());

       arr = new int[N];
        chk = new int[N];
       for (int i=0; i<N; i++) {
           arr[i] = Integer.parseInt(sc.next());
       }

        dfs(N);

   }

}

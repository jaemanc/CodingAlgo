package algo.dfs_bfs활용;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 합이같은부분집합_dfs_아마존인터뷰 {

    //N개의 원소로 구성된 자연수 집합이 주어지면, 이 집합을 두 개의 부분집합으로 나누었을 때
    //두 부분집합의 원소의 합이 서로 같은 경우가 존재하면 “YES"를 출력하고, 그렇지 않으면 ”NO"를 출력하는 프로그램을 작성하세요.
    //둘로 나뉘는 두 부분집합은 서로소 집합이며, 두 부분집합을 합하면 입력으로 주어진 원래의 집합이 되어 합니다.
    //예를 들어 {1, 3, 5, 6, 7, 10}이 입력되면 {1, 3, 5, 7} = {6, 10} 으로 두 부분집합의 합이 16으로 같은 경우가 존재하는 것을 알 수 있다.

    // 입력 1 :
    //6
    //1 3 5 6 7 10
    // 출력 --> YES

    static String answer;
    static int total=0;
    static int n;
    static boolean flag = false;
    public static void dfs(int L, int sum, int[] arr) {
        if (flag) return;
        if (L==n) {
            if ((total-sum) == sum) {
                answer = "YES";
                flag = true;
            }
        } else {
            dfs(L+1,sum+arr[L],arr);
            dfs(L+1,sum,arr);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        n = Integer.parseInt(sc.next());
        int[] arr = new int[n];
        for (int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(sc.next());
            total+=arr[i];
        }


        dfs(0,0,arr);
        System.out.println(answer);
    }


}

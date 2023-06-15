package algo.배열;

import java.util.Arrays;
import java.util.Scanner;

public class 소수찾기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int answer = 0;
        int[] ch = new int[n+1];

        for (int i=2; i<=n; i++) {
            if (ch[i]==0) {
                answer++;
                for (int j=i; j<=n; j=j+i) {
                    ch[j]=1;
                }
            }
        }

        System.out.println(answer);

    }
}

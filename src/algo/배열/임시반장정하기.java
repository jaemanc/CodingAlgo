package algo.배열;


import java.util.Arrays;
import java.util.Scanner;

public class 임시반장정하기 {

    /*

    김갑동 선생님은 올해 6학년 1반 담임을 맡게 되었다.

    김갑동 선생님은 우선 임시로 반장을 정하고 학생들이 서로 친숙해진 후에 정식으로 선거를 통해 반장을 선출하려고 한다.

    그는 자기반 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.

    그래서 김갑동 선생님은 각 학생들이 1학년부터 5학년까지 몇 반에 속했었는지를 나타내는 표를 만들었다.

    예를 들어 학생 수가 5명일 때의 표를 살펴보자.

    input :
    5
    2 3 1 7 3
    4 1 9 6 8
    5 5 2 4 4
    6 5 2 6 7
    8 4 2 2 2

    output : 4

    */


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        // 1번부터 사용하니까 n+1 // 5학년까지니까 6
        int[][] std = new int[num+1][6];

        for (int i=1; i<=num; i++) {
            for(int j=1; j<=5; j++){
                std[i][j] = sc.nextInt();
            }
        }

        int answer = 0;
        int max = Integer.MIN_VALUE;

        for(int i=1; i<=num; i++ ) {
            int count=0;
            for (int j=1; j<=num; j++) {
                for (int k=1; k<=5; k++ ) {
                    if (std[i][k] == std[j][k]) {
                        count++;
                        break;
                    }
                }
            }
            if (count>max) {
                max = count;
                answer=i;
            }
        }

        System.out.println(answer);
    }
}




























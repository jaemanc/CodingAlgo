package algo.dfs_bfs활용;

import java.util.Arrays;

public class 타겟_넘버 {

    static int answers = 0;
    static int[] number;
    static boolean[] chk;
    static int trgt;

    public static void main(String[] args) {
        int[] numbers = {4,1,2,1};
        int target = 4;
        solution(numbers, target);
    }

    public static int solution(int[] numbers, int target) {
        number = numbers.clone();
        chk = new boolean[numbers.length];
        trgt = target;
        dfs(0, numbers, 0);

        System.out.println(answers);
        return answers;
    }

    static void dfs(int numb, int[] numbers, int current) {
        if ( current == numbers.length ) {
            if (trgt == numb ) {
                answers++;
            }
            return;
        }

        dfs(numb + numbers[current], numbers, current+1);
        dfs(numb + (numbers[current] * -1), numbers, current+1);
    }

}

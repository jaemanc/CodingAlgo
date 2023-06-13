package algo.brute_force;

public class 최소직사각형 {

    public static void main(String[] args) {
        Solution so = new Solution();
        int[][] sizes = {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}}; // 120
        System.out.println(so.solution(sizes));
    }
}

class Solution {
    public int solution(int[][] sizes) {

        // 명함의 긴 부분을 가로로 돌린다.
        for (int i=0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        int max_x = 0;
        int max_y = 0;
        for (int i=0; i<sizes.length; i++) {
            max_x = Math.max(max_x, sizes[i][0]);
            max_y = Math.max(max_y, sizes[i][1]);
        }

        return max_x*max_y;
    }
}




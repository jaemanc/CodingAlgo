package algo.brute_force;

public class 피로도 {
    public static int max = Integer.MIN_VALUE;
    public static boolean[] chk;

    public static void main(String[] args) {
        int k = 80;
        int[][] dungeons = {{80,20},{50,40},{30,10}};
        chk = new boolean[dungeons.length];
        System.out.println(solution(k,dungeons));

    }

    public static int solution(int k, int[][] dungeons) {

        dfs(k,dungeons,chk);

        return max;
    }

    public static void dfs(int k, int[][] dungeons, boolean[] chk) {

        int count=0;
        for (int i=0; i<chk.length; i++){
            if (chk[i]) {
                count++;
            }
        }

        if (count > max) {
            max = count;
        }
        // 순열 문제임.
        for (int i=0; i<dungeons.length; i++) {
            if(!chk[i]){
                if (dungeons[i][0] <= k) {
                    chk[i] = true;
                    k-=dungeons[i][1];
                    dfs(k,dungeons,chk);
                    k+=dungeons[i][1];
                    chk[i] = false;
                }
            }
        }

    }
}




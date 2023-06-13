package algo.그외;


import java.util.*;

public class Lis {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);

//        int size = Integer.parseInt(sc.nextLine());
//        String arrays = sc.nextLine();
//        String[] ttee = arrays.split(" ");
//        int[] target = Arrays.stream(ttee).mapToInt(Integer::parseInt).toArray();
        int size = 6;
        int[] target = {10,20,10,30,20,50};

        int sol = 0;
        int[] dp = new int[size];

        for (int i = 0; i < size; i++ ) {
            dp[i] = 1;
            for (int j = 0; j < i; j++ ) {
               // 앞서 dp[i] 보다 dp[j]가 작거나 같은 경우 체크
               if(target[j] < target[i] && dp[i] <= dp[j] ){
                   dp[i] = dp[j]+1;
               }
            }
        }

        int maxVal = 0;
        for (int i=0;i<dp.length ;i++ ) {
            maxVal = dp[i] > maxVal ? dp[i] : maxVal;
        }

        System.out.println(maxVal);
    }
}
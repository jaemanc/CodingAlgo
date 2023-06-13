package algo.그외;


public class Cote11_2 {

    public static void main(String[] args) {

        int[] A = {1,1,2,3,3};
        int k = 3;

        System.out.println(solution(A, k));

    }

    public static boolean solution(int[] A, int K) {
        int n = A.length;
        for (int i = 0; i < n - 1; i++) {
            if (A[i] + 1 < A[i + 1])
                return false;
        }
        if (A[0] != 1 && A[n - 1] != K)
            return false;
        else
            return true;
    }



}

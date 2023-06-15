package algo.그외;


import java.util.Scanner;

public class LeastRecentlyUsed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cacheSize = Integer.parseInt(sc.next());
        int tgtWrk = Integer.parseInt(sc.next());

        int[] wrkSequence = new int[tgtWrk];
        for (int i=0; i<tgtWrk; i++) {
            wrkSequence[i] = Integer.parseInt(sc.next());
        }

        int[] cache = new int[cacheSize];

        for (int x : wrkSequence) {
            int pos = -1;

            for (int i=0; i<cacheSize; i++) {
                if (x==cache[i]) {
                    pos = i;
                }
            }

            if (pos==-1) {
                for (int i=cacheSize-1; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
                cache[0] = x;
            } else {
                for (int i=pos; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }

        for (int i=0; i<cache.length; i++) {
            System.out.print(cache[i] + " ");
        }
    }
}

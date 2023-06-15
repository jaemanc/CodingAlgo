package algo.greedy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class 백준24390또전자레인지야 {

    static int answer = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        // Time to minute.
        int hh = Integer.parseInt(str.substring(0,2)) * 60;
        int mm = Integer.parseInt(str.substring(3,5));

        int time = hh + mm;

        greedy(time,1);

        System.out.println(answer);

    }

    public static void greedy (int time, int count) {

        System.out.println(" time : " + time + " / count : " + count  );

        if (time == 0) {

            answer = Math.min(answer,count);
        } else {
            if (time - 600 >= 0) {
                greedy(time -600,count+1);
            } else if (time - 60 >= 0) {
                greedy(time - 60, count + 1);
            } else if (time -30 >= 0) {
                greedy(time -30 , count+1);
            } else if (time - 10 >= 0) {
                greedy(time - 10, count+1);
            }
        }
    }

}

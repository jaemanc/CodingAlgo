package algo.그외;


import java.util.Arrays;

public class BigNumMaker {

    public static void main (String[] args) {
//        String number = "4177252841";
//        int k = 4;
        // answer = 775841;

        String number = "1231234";
        int k = 3;
        //answer = 3234;

        solution(number,k);

    }

    static String solution (String number, int k) {
        String answer = "";
        int leng = number.length() - k;
        char[] numb = number.toCharArray();
        char[] answer_array = new char[leng];

        char findMaxVal =numb[0];
        numb[0] = 0;


        // i는 최소 자릿수에 맞춰서 반복한다.
        for (int i =0; i <number.length() - leng; i ++) {
            // 가장 큰수가 나올 때까지 찾는다.
            int repeatCount = 0;
            while ( repeatCount < leng -1) {
                if (numb[repeatCount] < numb[repeatCount+1]) {
                    numb[repeatCount] = numb[repeatCount+1];
                }
                repeatCount++;
            }
        }

        System.out.println(Arrays.toString(numb));


        return answer;
    }



}

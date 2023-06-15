package algo.그외;

import java.util.Arrays;
import java.util.Scanner;

public class TextDistance {

    //한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.

    //teachermode e

    //1 0 1 2 1 0 1 2 2 1 0

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        char t = sc.next().charAt(0);

        int[] answer = new int[str.length()];
        int count = 1000;
        for (int i=0; i<str.length(); i++) {
            if (str.charAt(i)==t) {
                count=0;
                answer[i] = count;
            } else {
                count++;
                answer[i] = count;
            }
        }

        count = 1000;
        for (int i=str.length()-1; i>=0; i--) {
            if (str.charAt(i) == t) {
                count=0;
            } else {
                count++;
                if (answer[i] > count) {
                    answer[i] = count;
                }
            }
        }

        for (int i = 0 ; i < answer.length; i++ ) {

            System.out.print(answer[i] + " ");

        }



    }
}

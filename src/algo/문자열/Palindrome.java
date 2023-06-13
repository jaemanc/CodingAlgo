package algo.문자열;

import java.util.*;

public class Palindrome {

    //앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다.
    //
    //문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
    //
    //단 회문을 검사할 때 대소문자를 구분하지 않습니다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palindrome = sc.nextLine().toUpperCase();
        int length = palindrome.length();
        for (int i = 0 ; i < palindrome.length()/2; i ++ ) {

            if (palindrome.charAt(i) !=palindrome.charAt(length-i-1)) {
                System.out.println( "NO");
                return;
            }
            System.out.println("YES");
            return;
        }
    }

}

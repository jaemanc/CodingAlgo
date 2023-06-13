package algo.그외;

import java.util.Locale;

public class 트레드링스2 {

    // 가장 긴 값을 가지는 dir 길이를 출력해야 한다.

    static int answer =0;
    static String answerStr ="";
    static String[] dirname;

    public static void main(String[] args) {
        int N = 7;
        int[][] relation = {{1,2},{2,5},{2,6},{1,3},{1,4},{3,7}};
        dirname = new String[]{"", "root", "abcd", "cs", "hello", "etc", "hello", "solution"};
        searchDirName("",relation[0][0], relation);
        System.out.println(answerStr);
    }

    public static void searchDirName(String str ,int N, int[][] relation){
        for (int i=0; i< relation.length; i++) {
            if (relation[i][0] == N ) {
                System.out.println(str);
                searchDirName(str+=dirname[N].toString(),relation[i][1], relation);
            }

            answer = Math.max(answer,answerStr.length());
        }

    }

}

package algo.dfs_bfs활용;

import java.util.Arrays;
import java.util.stream.Collectors;

public class 단어변환 {

    public static void main(String[] args) {
        /*
        begin	target	words	                                        return
        "hit"	"cog"	["hot", "dot", "dog", "lot", "log", "cog"]	    4
        ["hot","dot","dog","lot","log","cog"]라면 "hit" -> "hot" -> "dot" -> "dog" -> "cog"와 같이 4단계를 거쳐 변환할 수 있습니다.
         */

        String begin = "hit";  // 3 이상 10 이 only law case
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        solution(begin, target, words);
    }

    static int answer = Integer.MAX_VALUE;
    static boolean[] chk;

    public static int solution(String begin, String target, String[] words) {

        chk = new boolean[words.length];

        dfs(0, begin, target, words);

        if ( answer == Integer.MAX_VALUE) {
            return 0;
        }
        System.out.println(answer);
        return answer;
    }

    public static int dfs(int L, String word, String target, String[] words) {

        if (word.equals(target)) {
            answer = Math.min(answer, L);
            return answer;
        } else {
            for (int j=0; j< words.length; j++) {
                int count = 0;
                for (int i=0; i<word.length(); i++) {
                    if (word.charAt(i) != words[j].charAt(i) ) {
                        count++;
                    }
                }
                if (count==1 && chk[j] == false) {
                    word = words[j];
                    chk[j] = true;
                    dfs(L+1, word, target, words);
                }

            }
        }

        return 0;
    }
}









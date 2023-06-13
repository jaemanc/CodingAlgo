package algo.brute_force;

public class 모음사전 {

    static String target;
    static String[] arr;
    static int L=0;
    static int answer = 0;
    public static void main(String[] args) {

        String word = "EIO"; // 1189
        // 순서 : AEIOU // 길이 최대 5글자.
        target = word;
        System.out.println(solution(word));

    }

    public static int solution(String word) {

        arr = new String[]{"A","E","I","O","U"};

        dfs("");
        System.out.println(answer);

        return answer;
    }

    public static void dfs(String word) {
        if (word.equals(target)) {
            answer = L;
            return;
        }
        if (word.length() == 5){
            return;
        } else {
            for (int i=0; i< arr.length; i++) {
                L+=1;
                dfs(word+arr[i]);
            }
        }
    }


}


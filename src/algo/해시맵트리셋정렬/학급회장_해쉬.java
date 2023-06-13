package algo.해시맵트리셋정렬;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장_해쉬 {

    //15
    //BACBACCACCBDEDE
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int allStudentNum = sc.nextInt();
        String ballot = sc.next();

        char answer =' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (char x : ballot.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        int max=Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max=map.get(key);
                answer = key;
            }
        }
        System.out.println(answer);
    }

    // 또는
    //String 에서 a 라는 문자의 개수를 세는 방법
    // String abc = "aaaaabbbbcccc";
    // int aCount = abc.length() - abc.replace("a", "").length();

}
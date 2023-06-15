package algo.스택큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 교육과정설계_큐 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        Queue<Character> queue = new LinkedList<>();
        for (char x : a.toCharArray()) {
            queue.offer(x);
        }

        String answer ="YES";

        for (char x : b.toCharArray()) {
            if (queue.contains(x)) {
                if (x != queue.poll()) {
                    answer="NO";
                    break;
                }
            }
        }

        if (!queue.isEmpty()) {
            answer = "NO";
        } else {
            answer = "YES";
        }

        System.out.println(answer);
    }

}

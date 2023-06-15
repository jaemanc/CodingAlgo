package algo.스택큐;

import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strs = sc.next();

        Stack<Character> stack = new Stack<>();

        boolean flag= true;
        for (char x : strs.toCharArray()) {
            if (x == ')') {
                while(stack.pop()!='(');
            } else {
                stack.push(x);
            }
        }
        for (int i = 0 ; i< stack.size(); i++) {
            System.out.print(stack.get(i));
        }
    }

}













package com.org.jmc.스택큐;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {
    //괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
    //
    //(())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.

    //(()(()))(()
    // --> NO 출력.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] array = str.split("");

        Stack<String> stack = new Stack<>();
        String answer = "YES";

        for (int i=0; i<array.length; i++) {
            if (array[i].equals("(")) {
                stack.push(array[i]);
            } else {
                if (stack.isEmpty()) {
                    System.out.println("NO");
                    return;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            System.out.println("NO");
            return;
        }

        System.out.println(answer);
    }
}

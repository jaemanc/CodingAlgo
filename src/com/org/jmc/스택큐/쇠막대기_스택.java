package com.org.jmc.스택큐;

import java.util.Scanner;
import java.util.Stack;

public class 쇠막대기_스택 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<str.length(); i++) {

            if (str.charAt(i)=='(' ) {
                stack.push('(');
            } else {
                stack.pop();
                if (str.charAt(i-1)=='(') {
                    answer+=stack.size();
                } else {
                    answer++;
                }
            }
            System.out.println(stack.toString());
        }
        System.out.println(answer);

    }
}

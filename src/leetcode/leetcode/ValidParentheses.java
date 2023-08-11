package leetcode;


import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char C : s.toCharArray()) {
            if (C == '{' || C =='(' || C =='[') {
                stack.push(C);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char T = stack.pop();
                if ( (T == '{' && C !='}') || (T == '(' && C != ')') || (T =='[' && C!=']') ) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}

package DSA;

import java.util.*;

public class ValidParentheses {

//	Valid Parentheses (Stack)
	
    public static boolean isValid(String s) {
        var stack = new ArrayDeque<Character>();

        for (var ch : s.toCharArray()) {
            switch (ch) {
                case '(' -> stack.push(')');
                case '{' -> stack.push('}');
                case '[' -> stack.push(']');
                default -> {
                    if (stack.isEmpty() || stack.pop() != ch) {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}[]"));
    }
}

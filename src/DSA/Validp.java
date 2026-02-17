package DSA;

import java.util.Stack;

public class Validp {

    public static boolean isValid(String s) {

        // ✅ Null check
        if (s == null) {
            return false;
        }

        // Optional: if empty string, return true
        if (s.length() == 0) {
            return true;
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {

                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {

        System.out.println(isValid("()"));       // true
        System.out.println(isValid("()[]{}"));   // true
        System.out.println(isValid("(]"));       // false
        System.out.println(isValid("([)]"));     // false
        System.out.println(isValid("{[]}"));     // true
        System.out.println(isValid(null));       // false
        System.out.println(isValid(""));         // true
    }
}


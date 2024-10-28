package programmers;

import java.util.Stack;

public class StackQ_3_올바른괄호 {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for (char x : s.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else { // 닫힌 괄호일때
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            answer = false;
        } else {
            answer = true;
        }

        return answer;
    }

    public static void main(String[] args) {
        StackQ_3_올바른괄호 T = new StackQ_3_올바른괄호();
        String s1 = "()()";
        String s2 = "(())()";
        String s3 = ")()(";
        String s4 = "(()(";

        System.out.println(T.solution(s1));
        System.out.println(T.solution(s2));
        System.out.println(T.solution(s3));
        System.out.println(T.solution(s4));
    }
}

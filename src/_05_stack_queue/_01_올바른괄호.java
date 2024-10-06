package _05_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class _01_올바른괄호 {
    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for (char x : str.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }

        if (!stack.isEmpty()) {
            return  "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        _01_올바른괄호 T = new _01_올바른괄호();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}

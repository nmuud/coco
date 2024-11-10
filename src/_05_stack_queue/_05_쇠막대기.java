package _05_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class _05_쇠막대기 {
    public int solution(String str) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {  // 여는 괄호면 스택에 넣기
                stack.push('(');
            } else {  // 닫는괄호면
                stack.pop();
                if (str.charAt(i - 1) == '(') { // 바로앞인덱스가 ( 여는괄호면 레이저부분
                    answer += stack.size();
                } else { // 막대기 끝이면
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _05_쇠막대기 T = new _05_쇠막대기();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));

    }
}

package _05_stack_queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class _07_교육과정설계 {
    public String solution(String need, String plan) {
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        // 필수 과목 세팅
        for (char x : need.toCharArray()) {
            Q.offer(x);
        }

        // 수업 계획을 순차적으로 확인
        for (char x : plan.toCharArray()) {
            if (Q.contains(x)) {        // 현재 과목이 필수 과목에 포함되는지 확인
                if (x != Q.poll()) {    // 필수 과목의 순서가 맞는지 확인
                    return "NO";        // 순서가 틀리면 NO
                }
            }
        }

        // 필수 과목을 모두 이수하지 않았다면 NO
        if (!Q.isEmpty()) {
            return "NO";
        }

        return answer;
    }

    public static void main(String[] args) {
        _07_교육과정설계 T = new _07_교육과정설계();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.solution(a, b));
    }
}

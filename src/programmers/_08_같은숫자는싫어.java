package programmers;

import java.util.Arrays;
import java.util.Stack;

public class _08_같은숫자는싫어 {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();

        for (int x : arr) {
            // 스택이 비어있거나 스택의 최상단 값과 다른 경우에 추가
            if (stack.isEmpty() || stack.peek() != x) {
                stack.push(x);
            }
        }

        // Stack 의 값을 배열로 변환하여 반환
        int[] answer = new int[stack.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        _08_같은숫자는싫어 T = new _08_같은숫자는싫어();
        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        System.out.println(Arrays.toString(T.solution(arr1)));
        System.out.println(Arrays.toString(T.solution(arr2)));
    }
}

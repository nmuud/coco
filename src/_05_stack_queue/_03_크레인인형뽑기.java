package _05_stack_queue;

import java.util.Scanner;
import java.util.Stack;

public class _03_크레인인형뽑기 {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        // 무스브 탐색
        for (int pos : moves) {
            for (int i = 0; i < board.length; i++) {  // 2 차원 배열의 행크기
                if (board[i][pos-1] != 0) {  // 인형발견
                    int tmp = board[i][pos-1];  // 인형번호 넣기
                    board[i][pos-1] = 0; // 인형 갖고와서 0으로만든다
                    if (!stack.isEmpty() && tmp == stack.peek()) { // 비어있지 않으면서,&& 스택 상단에 있는것과 tmp가 같으면
                        answer += 2; // 인형 두개가 터지니까 2 증가
                        stack.pop(); // 스택 상단에 있는거 꺼내기
                    } else {
                        stack.push(tmp);
                    }
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _03_크레인인형뽑기 T = new _03_크레인인형뽑기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        int m = sc.nextInt();
        int[] moves = new int[m];
        for (int i = 0; i < m; i++) {
            moves[i] = sc.nextInt();
        }

        System.out.println(T.solution(board, moves));
    }
}

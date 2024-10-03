package _02_array;

import java.util.Scanner;

public class _04_피보나치수열 {
    public int[] solution(int n) {
        int[] answer = new int[n];

        // 첫 번째와 두 번째 수는 항상 1로 고정
        answer[0] = 1;
        answer[1] = 1;

        // 세 번째 수부터 피보나치 수열 규칙에 따라 값을 채움
        for (int i = 2; i < n; i++) {
            answer[i] = answer[i-1] + answer[i-2];
        }
        return answer;
    }

    public static void main(String[] args) {
        _04_피보나치수열 T = new _04_피보나치수열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int x : T.solution(n)) {
            System.out.print(x + " ");
        }
    }
}

package _02_array;

import java.util.Scanner;

public class _07_점수계산 {
    public int solution(int n, int[] arr) {
        int answer = 0; // 최종 점수를 저장할 변수
        int cnt = 0; // 연속된 1의 횟수를 저장할 변수

        for (int i = 0; i < n; i++) {
            if (arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else { // 1이 아닐경우
                cnt = 0; // 연속된 1이 끊어졌으므로 cnt 를 0으로 초기화
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _07_점수계산 T = new _07_점수계산();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, arr));
    }
}

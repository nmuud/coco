package _03_two_pointers;

import java.util.Scanner;

public class _03_최대매출 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;
        int sum = 0;

        // 첫 번째 윈도우(k개의 요소) 매출액 구하기
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;

        // 윈도우를 오른쪽으로 이동하며 최대 매출액 구하기
        for (int i = k; i < n; i++) {
            // 새로운 원소(arr[i])를 더하고 이전 윈도우의 첫 원소(arr[i - k])를 뺌
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        _03_최대매출 T = new _03_최대매출();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(T.solution(n, k, arr));
    }
}

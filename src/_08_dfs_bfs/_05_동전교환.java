package _08_dfs_bfs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _05_동전교환 {
    static int n, m; // n: 동전의 종류 개수, m: 목표금액
    static int answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum, Integer[] arr) {

        // 백트래킹: 현재 합이 목표 금액을 넘으면 더이상 탐색할 필요 없음
        if (sum > m) {
            return;
        }

        // 현재 사용한 동전 개수(L)가 이미 발견한 최소 동전 개수(answer)보다 크면 더이상 탐색하지 않음
        if (L >= answer) {
            return;
        }

        // 종료 조건: 목표 금액에 도달한 경우
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            for (int i = 0; i < n; i++) { // 동전은 n개
                // 다음 동전을 사용하여 탐색 (동전개수 +1, 현재 합 + 동전 금액)
                DFS(L + 1, sum + arr[i], arr);
            }
        }
    }

    public static void main(String[] args) {
        _05_동전교환 T = new _05_동전교환();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // 동전 배열을 내림차순으로 정렬 (큰 금액부터 탐색하기 위해)
        Arrays.sort(arr, Collections.reverseOrder());

        m = sc.nextInt();

        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}

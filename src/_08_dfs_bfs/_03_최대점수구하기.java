package _08_dfs_bfs;

import java.util.Scanner;

public class _03_최대점수구하기 {
    static int answer = Integer.MIN_VALUE, n, m;

    public void DFS(int L, int sum, int time, int[] ps, int[] pt) {
        if (time > m) {
            return;
        }

        if (L == n) { // 종료 조건: 모든 문제를 다 탐색한 경우
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + ps[L], time + pt[L], ps, pt);
            DFS(L + 1, sum, time, ps, pt);
        }
    }

    public static void main(String[] args) {
        _03_최대점수구하기 T = new _03_최대점수구하기();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 갯수
        m = sc.nextInt(); // 제한시간

        int[] a = new int[n]; // 점수
        int[] b = new int[n]; // 걸리는 시간
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        T.DFS(0, 0, 0, a, b);
        System.out.println(answer);
    }
}

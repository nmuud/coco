package _08_dfs_bfs;

import java.util.Scanner;

public class _07_조합수_메모이제이션 {
    int[][] dy = new int[35][35]; // 메모이제이션을 위한 2차원 배열

    public int DFS(int n, int r) {
        // 이미 계산된 조합수가 존재하는 경우 그 값을 반환
        if (dy[n][r] > 0) {
            return dy[n][r];
        }

        // 종료 조건: nCo = 1 또는 nCn = 1
        if (n == r || r == 0) {
            return 1;
        } else {
            // 조합 수를 재귀적으로 계산하고 메모이제이션 배열에 저장 : n-1C(r-1) + n-1Cr
            return dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }

    public static void main(String[] args) {
        _07_조합수_메모이제이션 T = new _07_조합수_메모이제이션();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n, r));
    }
}

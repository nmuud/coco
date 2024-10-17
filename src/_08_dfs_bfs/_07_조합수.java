package _08_dfs_bfs;

import java.util.Scanner;

public class _07_조합수 {
    public int DFS(int n, int r) {
        // nCo = 1(0개 선택), nCn = 1(n개 모두 선택)일때 : 조합수는 1
        if (n == r || r == 0) {
            return 1;
        } else {
            // 조합 수를 재귀적으로 계산: (n-1)C(r-1) + (n-1)Cr
            return DFS(n - 1, r - 1) + DFS(n - 1, r);
        }
    }

    public static void main(String[] args) {
        _07_조합수 T = new _07_조합수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n, r));
    }
}

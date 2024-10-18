package _08_dfs_bfs;

import java.util.Scanner;

public class _08_수열추측하기 {
    static int[] b, p, ch;
    static int n, f;
    boolean flag = false;
    int[][] dy = new int[35][35];

    public int combi(int n, int r) {
        if (dy[n][r] > 0) return dy[n][r];
        if (n == r || r == 0) {
            return 1;
        } else {
            return dy[n][r] = combi(n - 1, r - 1) + combi(n - 1, r);
        }
    }

    public void DFS(int L, int sum) {
        if (flag) {
            return;
        }

        if (L == n) {
            if (sum == f) {
                for (int x : p) {
                    System.out.print(x + " ");
                    flag = true;
                }
            }
        } else {
            // 1 부터 n 까지의 숫자를 순열로 생성
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[L] = i; // 순열에 i 추가
                    DFS(L + 1, sum + (p[L] * b[L]));
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        _08_수열추측하기 T = new _08_수열추측하기();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //4
        f = sc.nextInt(); //16
        b = new int[n];
        p = new int[n];
        ch = new int[n + 1]; // 숫자를 1부터 사용함. 1~4 실제값
        for (int i = 0; i < n; i++) {
            b[i] = T.combi(n - 1, i); // 3C0, 3C1, 3C2, 3C3
        }
        T.DFS(0, 0);
    }
}

package _08_dfs_bfs;

import java.util.Scanner;

public class _04_중복순열 {
    static int[] pm;
    static int n, m;

    public void DFS(int L) {
        // 종료 조건: 뽑은 숫자의 개수가 m에 도달하면
        if (L == m) {
            for (int x : pm) {
                System.out.println(x + " ");
            }
            System.out.println();
        } else {
            // 숫자를 1부터 n까지 중복 가능하게 선택 (중복 순열)
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        _04_중복순열 T = new _04_중복순열();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        pm = new int[m];
        T.DFS(0);
    }
}

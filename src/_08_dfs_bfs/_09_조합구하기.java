package _08_dfs_bfs;

import java.util.Scanner;

public class _09_조합구하기 {
    static int[] combi; // 조합을 저장할 배열
    static int n, m;

    public void DFS(int L, int s) {
        if (L == m) {
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            // i는 선택할 아이템의 인덱스
            for (int i = s; i <= n; i++) { // 현재 선택 인덱스 s부터 n까지 반복
                combi[L] = i;
                DFS(L + 1, i + 1); // i + 1
            }
        }
    }

    public static void main(String[] args) {
        _09_조합구하기 T = new _09_조합구하기();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi = new int[m];
        T.DFS(0, 1);
    }
}

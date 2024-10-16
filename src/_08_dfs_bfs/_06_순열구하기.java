package _08_dfs_bfs;

import java.util.Scanner;

public class _06_순열구하기 {
    static int[] pm;
    static int[] ch;
    static int[] arr;

    static int n, m;

    public void DFS(int L) {
        // 종료 조건: 순열의 길이 m에 도달했을 때
        if (L == m) {
            for (int x : pm) {
                System.out.print(x + " ");
            }
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i]; // 순열의 L번째 위치에 arr[i]를 저장
                    DFS(L + 1);
                    ch[i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        _06_순열구하기 T = new _06_순열구하기();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        ch = new int[n];
        pm = new int[m];
        T.DFS(0);
    }
}

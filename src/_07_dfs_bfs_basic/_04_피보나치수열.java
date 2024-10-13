package _07_dfs_bfs_basic;

public class _04_피보나치수열 {
    public int DFS(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return DFS(n - 2) + DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        _04_피보나치수열 T = new _04_피보나치수열();
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.print(T.DFS(i) + " ");
        }
    }
}

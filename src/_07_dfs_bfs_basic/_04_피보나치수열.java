package _07_dfs_bfs_basic;

public class _04_피보나치수열 {
    public int DFS(int n) {

        // 탈출 조건: n이 1또는 2일 경우, 피보나치 수열의 값은 1이다
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

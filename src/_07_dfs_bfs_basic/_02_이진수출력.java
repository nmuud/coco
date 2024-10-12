package _07_dfs_bfs_basic;

public class _02_이진수출력 {
    private void DFS(int n) {
        if (n == 0) return;
        else {
            DFS(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        _02_이진수출력 T = new _02_이진수출력();
        T.DFS(11);
    }
}

package _07_dfs_bfs_basic;

public class _03_팩토리얼 {
    private int DFS(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * DFS(n - 1);
        }
    }

    public static void main(String[] args) {
        _03_팩토리얼 T = new _03_팩토리얼();
        System.out.println(T.DFS(5));
    }
}

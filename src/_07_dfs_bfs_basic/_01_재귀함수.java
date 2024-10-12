package _07_dfs_bfs_basic;

public class _01_재귀함수 {
    public void DFS(int n) {
        if (n == 0) return;
        else {
            System.out.println("호출 전: " + n);
            DFS(n - 1);
            System.out.println("호출 후: " + n);
        }
    }

    public static void main(String[] args) {
        _01_재귀함수 T = new _01_재귀함수();
        T.DFS(3);
    }
}

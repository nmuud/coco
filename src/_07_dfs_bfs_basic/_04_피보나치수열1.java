package _07_dfs_bfs_basic;

public class _04_피보나치수열1 {
    static int[] fibo;

    public int DFS(int n) {

        // 이미 계산된 값이 있다면 해당 값을 반환하여 중복 계산을 피함 (메모이제이션)
        if (fibo[n] > 0) {
            return fibo[n];
        }

        if (n == 1 || n == 2) { // 탈출 조건
            return fibo[n] = 1;
        } else {
            return fibo[n] = DFS(n - 2) + DFS(n - 1); // 결과를 배열에 저장
        }

    }

    public static void main(String[] args) {
        _04_피보나치수열1 T = new _04_피보나치수열1();
        int n = 5;
        fibo = new int[n + 1]; // 피보나치 수열 값을 저장할 배열 생성 (1부터 n까지)
        T.DFS(n);

        // 1부터 n까지 피보나치 수열 출력
        for (int i = 1; i <= n; i++) {
            System.out.print(fibo[i] + " ");
        }
    }
}

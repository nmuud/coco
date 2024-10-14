package _07_dfs_bfs_basic;

public class _06_부분집합 {
    static int n;
    static int[] ch; // 원소의 사용 여부를 체크하는 배열 (1이면 사용, 0이면 미사용)

    public void DFS(int L) {

        // 탈출 조건: L이 n + 1이면 모든 원소 사용 여부를 결정한 상태
        if (L == n + 1) {
            String tmp = "";
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) {  // 사용한 원소만 temp 에 넣는다
                    tmp += (i + " ");
                }
            }
            // 공집합은 출력 안함
            if (tmp.length() > 0) {
                System.out.println(tmp);
            }
        } else {
            // 해당 원소 L을 사용한다 (ch[L] = 1)
            ch[L] = 1;
            DFS(L + 1);

            // 해당 원소 L을 사용하지 않는다 (ch[L] = 0)
            ch[L] = 0;
            DFS(L + 1);
        }
    }

    public static void main(String[] args) {
        _06_부분집합 T = new _06_부분집합();
        n = 3;
        ch = new int[n + 1]; // 체크 배열의 인덱스 번호를 원소로 사용(1 번부터 n까지 원소)
        T.DFS(1);
    }
}

package _08_dfs_bfs;

import java.util.Scanner;

public class _10_미로탐색 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board;
    static int answer = 0;

    public void DFS(int x, int y) {

        if (x == 7 && y == 7) { // 종료 조건
            answer++;
        } else {
            // 시계 방향 탐색
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                // nx, ny가 미로 안에 있고, 방문한적이 없는 경우
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && board[nx][ny] == 0) {
                    board[nx][ny] = 1; // 방문 체크
                    DFS(nx, ny);
                    board[nx][ny] = 0; // 백트래킹: 다시 방문 가능하도록 초기화
                }
            }
        }
    }

    public static void main(String[] args) {
        _10_미로탐색 T = new _10_미로탐색();
        Scanner sc = new Scanner(System.in);
        board = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        board[1][1] = 1;
        T.DFS(1, 1);
        System.out.println(answer);
    }


}

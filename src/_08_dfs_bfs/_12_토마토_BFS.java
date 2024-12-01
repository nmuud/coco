package _08_dfs_bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Point1 {
    public int x, y;

    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class _12_토마토_BFS {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] board, dis;
    static int n, m;
    static Queue<Point1> Q = new LinkedList<>();

    public void BFS() {
        while (!Q.isEmpty()) {
            Point1 tmp = Q.poll();
            for (int i = 0; i < 4; i++) {
                int nx = tmp.x + dx[i];
                int ny = tmp.y + dy[i];
                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 0) {
                    board[nx][ny] = 1; // 익은 토마토로 변환
                    Q.offer(new Point1(nx, ny)); // 큐에 다음 좌표 추가
                    dis[nx][ny] = dis[tmp.x][tmp.y] + 1; // 거리 갱신
                }
            }
        }

    }

    public static void main(String[] args) {
        _12_토마토_BFS T = new _12_토마토_BFS();
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();
        dis = new int[n][m];

        board = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
                if (board[i][j] == 1) {
                    Q.offer(new Point1(i, j)); // 익은토마토면 그 위치를 Q에 넣기
                }
            }
        }

        T.BFS();
        boolean flag = true;
        int answer = Integer.MIN_VALUE;

        // 끝나고 나서 익지않은 토마토가 있는지 확인
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 0) {
                    flag = false;
                }
            }
        }

        // 익었으면 최대값 넣어주기
        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        } else {
            System.out.println(-1);
        }
    }
}

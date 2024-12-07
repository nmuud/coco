package test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class _03_깊이우선탐색1 {
    final static int MAX = 1000000 + 10; // 최대 노드 수를 정으(1000010)
    static ArrayList<Integer>[] graph; // 그래프를 표현하기 위한 인접 리스트 배열
    static boolean[] visited; // 각 노드의 방문 여부를 저장하기 위한 배열
    static int N, M, R; // N: 노드수, M: 간선수, R: 시작노드
    static int[] answer; // 각 노드의 방문 순서를 기록하기 위한 배열
    static int order; // 방문 순서를 기록할 카운터


    // DFS(깊이 우선 탐색) 메서드
    public static void dfs(int idx) {
        visited[idx] = true; // 현재 노드(idx)를 방문처리
        answer[idx] = order; // 현재 노드(idx)의 방문 순서를 기록
        order++; // 방문 순서 카운터 증가

        // 현재 노드와 연결된 모든 노드에 대해 반복
        for (int i = 0; i < graph[idx].size(); i++) {
            int next = graph[idx].get(i); // 연결된 다음 노드를 가져옴
            // 아직 방문하지 않은 노드라면
            if (visited[next] == false) {
                dfs(next); // 재귀적으로 DFS 호출
            }
        }
    }

    public static void main(String[] args) throws IOException {
        // 0. 입력 및 초기화
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 노드 수(N) 입력
        M = Integer.parseInt(st.nextToken()); // 간선 수(M) 입력
        R = Integer.parseInt(st.nextToken()); // 시작 노드 (R) 입력

        // 1. graph 에 연결 정보 채우기
        graph = new ArrayList[MAX]; // 그래프 배열 초기화
        for (int i = 1; i <= N; i++) {
            graph[i] = new ArrayList<>(); // 각 노드에 대해 ArrayList 초기화
        }
        visited = new boolean[MAX]; // 방문 배열 초기화
        answer = new int[MAX]; // 방문 순서 배열 초기화
        order = 1; // 방문 순서 카운터 초기화

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken()); // 첫 번째 노드(x) 입력
            int y = Integer.parseInt(st.nextToken()); // 두 번째 노드(y) 입력
            graph[x].add(y); // x와 y를 서로 연결
            graph[y].add(x); // y와 x를 서로 연결
        }

        // 2. 오름차순 정렬
        for (int i = 1; i <= N; i++) {
            Collections.sort(graph[i]); // 각 노드의 연결 리스트를 오름차순으로 정렬
        }

        // 3. dfs(재귀함수 호출)
        dfs(R);

        // 4. 출력
        for (int i = 1; i <= N; i++) {
            bw.write(String.valueOf(answer[i]));
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}

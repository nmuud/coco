package _09_greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

// Edge 클래스: 정점과 비용(가중치) 정보를 저장하는 클래스
class Edge implements Comparable<Edge> {
    public int vex; // 정점 번호
    public int cost; // 해당 정점까지의 비용(가중치)

    public Edge(int vex, int cost) {
        this.vex = vex;
        this.cost = cost;
    }

    // compareTo 메서드 재정의: 우선순위 큐에서 비용이 작은 순으로 처리할 수 있게 메서드를 재정의
    @Override
    public int compareTo(Edge ob) {
        return this.cost - ob.cost; // 비용을 기준으로 오름차순 정렬
    }
}

public class _05_다익스트라알고리즘 {
    static int n, m; // n: 정점 개수, m: 간선 개수
    static ArrayList<ArrayList<Edge>> graph; // 그래프를 인접 리스트 형태로 저장
    static int[] dis; // 최단 거리 배열, 시작점에서 각 정점까지의 최소 비용을 저장

    // 다익스트라 알고리즘 구현 메서드: v는 시작 정점
    public void solution(int v) {
        // 우선순위 큐: 비용이 작은 순으로 처리됨
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        // 시작 정점 v를 큐에 추가하고 그 비용을 0으로 설정
        pQ.offer(new Edge(v, 0));
        dis[v] = 0; // 시작 정점의 최소 비용은 0으로 초기화

        while (!pQ.isEmpty()) {
            Edge tmp = pQ.poll(); // 현재 비용이 가장 작은 정점을 큐에서 꺼냄
            int now = tmp.vex; // 현재 정점
            int nowCost = tmp.cost; // 현재 정점까지의 비용

            // 현재 정점까지의 비용이 이미 저장된 값보다 크면 처리할 필요 없음
            if (nowCost > dis[now]) {
                continue;
            }

            // 현재 정점과 연결된 모든 인접 정점들에 대해 최단 거리 갱신
            for (Edge ob : graph.get(now)) {
                // 새로운 경로로 가능 비용이 기존 비용보다 작으면 갱신
                if (dis[ob.vex] > nowCost + ob.cost) {
                    dis[ob.vex] = nowCost + ob.cost; // 최단 거리 갱신
                    // 갱신된 정점과 비용을 큐에 추가
                    pQ.offer(new Edge(ob.vex, nowCost + ob.cost));
                }
            }
        }
    }

    public static void main(String[] args) {
        _05_다익스트라알고리즘 T = new _05_다익스트라알고리즘();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); // 정점 개수
        m = sc.nextInt(); // 간선 개수
        graph = new ArrayList<ArrayList<Edge>>(); // 그래프를 인접 리스트 형태로 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Edge>()); // 각 정점에 대해 빈 리스트를 추가
        }

        dis = new int[n + 1];
        Arrays.fill(dis, Integer.MAX_VALUE); // 모든 정점까지의 거리를 무한대로 초기화

        // 그래프 정보 입력: 정점 a에서 b로 가능 비용 c
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(); // 시작 정점
            int b = sc.nextInt(); // 도착 정점
            int c = sc.nextInt(); // 비용(가중치)
            graph.get(a).add(new Edge(b, c)); // 그래프에 간선 정보 추가
        }

        T.solution(1);
        for (int i = 2; i <= n; i++) {
            if (dis[i] != Integer.MAX_VALUE) {
                System.out.println(i + " : " + dis[i]);
            }
        }
    }
}

package _09_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 간선 정보를 저장하는 클래스
class Edge1 implements Comparable<Edge1> {
    public int v1; // 정점1
    public int v2; // 정점2
    public int cost; // 간선의 가중치

    public Edge1(int v1, int v2, int cost) {
        this.v1 = v1;
        this.v2 = v2;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge1 ob) {
        return this.cost - ob.cost; // 간선의 가중치를 기준으로 오름차순
    }
}

public class _07_원더랜드크루스칼 {
    static int[] unf;

    public static int Find(int v) {
        if (v == unf[v]) return v;
        else return unf[v] = Find(unf[v]);
    }

    public static void Union(int a, int b) {
        int fa = Find(a);
        int fb = Find(b);
        if (fa != fb) unf[fa] = fb;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        unf = new int[n + 1];
        ArrayList<Edge1> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }

        // 간선 정보 입력
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt(); // 정점1
            int b = sc.nextInt(); // 정점2
            int c = sc.nextInt(); // 간선의 가중치
            arr.add(new Edge1(a, b, c)); // 간선 리스트에 추가
        }

        int answer = 0;
        Collections.sort(arr); // 간선 리스트를 가중치 기준으로 오름차순 정렬

        // 간선들을 하나씩 처리
        for (Edge1 ob : arr) {
            int fv1 = Find(ob.v1); // 정점1의 루트를 찾음
            int fv2 = Find(ob.v2); // 정점2의 루트를 찾음

            // 두 정점의 루트가 다르면, 즉 서로 다른 집합이면
            if (fv1 != fv2) {
                answer += ob.cost; // 해당 간선의 가중치를 더함
                Union(ob.v1, ob.v2); // 두 정점을 같은 집합으로 합침
            }
        }

        System.out.println(answer);
    }
}
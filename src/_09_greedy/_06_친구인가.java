package _09_greedy;

import java.util.Scanner;

public class _06_친구인가 {

    static int[] unf;

    // Find: 루트를 찾으면서 경로 압축
    public static int Find(int v) {
        if (v == unf[v]) return v; // 자기 자신이 루트라면 자기 자신을 반환
        else return unf[v] = Find(unf[v]); // 재귀적으로 부모의 루트를 찾고, 부모를 갱신
    }

    // Union: 두 집합을 합침
    public static void Union(int a, int b) {
        int fa = Find(a); // a의 루트를 찾음
        int fb = Find(b); // b의 루트를 찾음
        if (fa != fb) unf[fa] = fb; // fa의 부모를 fb로 설정하여 두 집합을 연결한다
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        // 초기화: 자기 자신이 부모
        unf = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            unf[i] = i;
        }

        for (int i = 1; i <= m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            Union(a, b);
        }

        int a = sc.nextInt();
        int b = sc.nextInt();
        int fa = Find(a);
        int fb = Find(b);
        if (fa == fb) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
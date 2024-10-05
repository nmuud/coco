package _03_two_pointers;

import java.util.ArrayList;
import java.util.Scanner;

public class _01_두배열합치기 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0; // 배열 a의 포인터
        int p2 = 0; // 배열 b의 포인터

        // 두 배열에서 작은 값부터 answer 리스트에 추가
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) {
                answer.add(a[p1++]);
            } else {
                answer.add(b[p2++]);
            }
        }

        // 배열 a에 남은 요소 처리
        while (p1 < n) {
            answer.add(a[p1++]);
        }

        // 배열 b에 남은 요소 처리
        while (p2 < m) {
            answer.add(b[p2++]);
        }

        return answer;

    }

    public static void main(String[] args) {
        _01_두배열합치기 T = new _01_두배열합치기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        for (Integer x : T.solution(n, m, a, b)) {
            System.out.println(x + " ");
        }
    }
}

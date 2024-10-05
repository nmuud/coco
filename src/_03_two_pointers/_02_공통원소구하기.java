package _03_two_pointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _02_공통원소구하기 {
    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);

        int p1 = 0;
        int p2 = 0;
        while (p1 < n && p2 < m) {
            if (a[p1] == b[p2]) {
                answer.add(a[p1]++); // 공통 원소를 찾았으므로 두 포인터 모두 증가
                p2++;
            } else if (a[p1] < b[p2]) {
                p1++;
            } else {
                p2++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _02_공통원소구하기 T = new _02_공통원소구하기();
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

package _04_hashmap_treeset;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class _05_K번째큰수 {
    public int solution(int[] arr, int n, int k) {
        int answer = -1;

        // 내림차순으로 자동 정렬되는 TreeSet 생성
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int l = j + 1; l < n; l++) {
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        // TreeSet 에서 k번째 큰 수 찾기
        int cnt = 0;
        for (Integer x : Tset) { // 내림차순으로 정렬된 Tset에서 차례대로 원소를 꺼냄
            cnt++; // 현재 몇번째 큰수인지 카운트
            if (cnt == k) {
                return x;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _05_K번째큰수 T = new _05_K번째큰수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(arr, n, k));
    }
}

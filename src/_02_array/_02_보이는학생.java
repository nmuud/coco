package _02_array;

import java.util.Scanner;

public class _02_보이는학생 {
    private int solution(int n, int[] arr) {
        int answer = 1; // 첫 번째 학생은 항상 보이므로 카운트
        int max = arr[0]; // 첫 번째 학생을 기준으로 비교 시작

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        _02_보이는학생 T = new _02_보이는학생();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}

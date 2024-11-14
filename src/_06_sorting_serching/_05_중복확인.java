package _06_sorting_serching;

import java.util.Arrays;
import java.util.Scanner;

public class _05_중복확인 {
    public String solution(int n, int[] arr) {
        String answer = "U";
        Arrays.sort(arr); // 오름차순으로 정렬해줌
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return "D";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _05_중복확인 T = new _05_중복확인();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}

package _02_array;

import java.util.ArrayList;
import java.util.Scanner;

public class _06_뒤집은소수 {
    // 소수 판별 메서드
    public boolean isPrime(int num) {
        if (num == 1) {  // 1은 소수가 아님
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {  // num 이 i로 나누어 떨어지면 소수가 아님
                return false;
            }
        }
        return true;
    }

    // 숫자를 뒤집고 뒤집은 숫자가 소수인지 판별하는 메서드
    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int tmp = arr[i];
            int res = 0; // 뒤집은 숫자를 저장할 변수

            // 숫자를 뒤집는 과정
            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }

            // 뒤집은 숫자가 소수인지 확인
            if (isPrime(res)) {
                answer.add(res);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _06_뒤집은소수 T = new _06_뒤집은소수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (Integer x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}

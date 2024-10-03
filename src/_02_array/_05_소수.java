package _02_array;

import java.util.Scanner;

public class _05_소수 {
    public int solution(int n) {
        int answer= 0;

        // 소수 여부를 체크할 배열 (0으로 초기화됨)
        // 배열 크기는 n+1로 설정하여 인덱스가 0부터 n까지 포함되도록 함
        int[] ch = new int[n + 1];

        // 2부터 n 까지의 숫자들의 소수 여부 확인
        for (int i = 2; i < n; i++) {
            if (ch[i] == 0) {
                answer++;

                // i의 배수들을 소수에서 제외 (에라토스테네스의 체 사용)
                for (int j = i; j <= n; j += i) {
                    ch[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _05_소수 T = new _05_소수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}

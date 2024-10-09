package _03_two_pointers;

import java.util.Scanner;

/*
n(8)개의 수로 이루어진 수열에서
연속부분수열의 합이 m(6)이 되는 경우의 수를 구하기
예시입력1
8 6
1 2 1 3 1 1 1 2
예시출력1
3
*/

public class _04_연속부분수열 {
    public int solution(int n, int m, int[] arr) {
        int answer = 0; // m과 합이 같은 연속 부분 수열의 개수를 저장
        int sum = 0; // 현재 부분 수열의 합을 저장
        int lt = 0;

        // 오른쪽 포인터 rt는 배열의 처음부터 끝까지 이동
        for (int rt = 0; rt < n; rt++) {
            sum += arr[rt]; // rt가 가리키는 값을 sum 에 더해서 현재 부분 수열의 합을 업데이트

            // sum 이 m 과 같다면 answer 증가
            if (sum == m) {
                answer++;
            }

            // sum 이 m 보다 크거나 같은 경우: sum 이 작아질때까지 연산하기 위해 while 문 사용
            while (sum >= m) {
                sum -= arr[lt++]; // lt가 가리키는 값을 sum 에서 빼고, lt를 오른쪽으로 이동

                // sum 이 m 과 같아지면 answer 증가
                if (sum == m) {
                    answer++;
                }
            }
        }

        return answer; // 조건을 만족하는 연속 부분 수열의 개수를 반환
    }

    public static void main(String[] args) {
        _04_연속부분수열 T = new _04_연속부분수열();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(T.solution(n, m, arr));
    }
}

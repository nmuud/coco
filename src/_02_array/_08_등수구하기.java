package _02_array;

import java.util.Scanner;

/*
입력된 순서대로 등수 출력하기
예시입력1
5
87 89 92 100 76
예시출력1
4 3 2 1 5
*/

public class _08_등수구하기 {
    public int[] solution(int n, int[] arr) {
        int[] answer = new int[n]; // 순위를 저장할 배열

        // 첫번째 루프: 배열의 각 요소를 순회
        for (int i = 0; i < n; i++) {
            int cnt = 1;  // 초기 순위는 1(자기 자신 포함)

            // 두번째 루프: 현재 요소(i)와 나머지 요소들을 비교하여 순위 계산
            for (int j = 0; j < n; j++) {
                // arr[j]가 arr[i]보다 크면 순위를 증가시킴
                if (arr[j] > arr[i]) {
                    cnt++;
                }
            }
            answer[i] = cnt; // i의 순위를 배열에 저장
        }

        return answer;
    }

    public static void main(String[] args) {
        _08_등수구하기 T = new _08_등수구하기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}

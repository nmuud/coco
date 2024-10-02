package n01_문자열;

import java.util.Scanner;

public class _10_문자거리 {
    public int[] solution(String str, char t) {
        int[] answer = new int[str.length()];

        int p = 1000; // 큰 값으로 초기화하여 거리 계산을 쉽게 함
        // 1. 왼쪽에서 오른쪽으로 순회
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                p = 0; // 해당 문자를 찾으면 거리 0으로 초기화
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        // 2. 오른쪽에서 왼쪽으로 순회
        for (int i = str.length() - 1; i >= 0; i--) { // 오른쪽에서 왼쪽 순회
            if (str.charAt(i) == t) {
                p = 0;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p); // 최소 거리 업데이트
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _10_문자거리 T = new _10_문자거리();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char c = sc.next().charAt(0);
        for (int x : T.solution(str, c)) {
            System.out.println(x + " ");
        }
    }
}

package _01_string;

import java.util.Scanner;

public class _11_문자열압축 {
    public String solution(String s) {
        String answer = "";
        s = s + " "; // 마지막 문자의 비교를 위해 문자열 끝에 공백 추가(배열 범위 초과 방지)
        int cnt = 1;

        // s.length() -1 : 인덱스 i가 추가된 공백을 가리키지 않도록 함
        // ex) "hello " -> i가 공백일 경우, (s.charAt(i + 1)은 에러발생
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                cnt++;
            } else {
                answer += s.charAt(i); // 현재 문자 추가
                if (cnt > 1) {
                    answer += String.valueOf(cnt); // 반복된 횟수를 추가
                 // answer += cnt; 도 사용 가능 : 문자열 연결 특성으로 자동변환 가능
                    cnt = 1; // 카운트 초기화
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _11_문자열압축 T = new _11_문자열압축();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}

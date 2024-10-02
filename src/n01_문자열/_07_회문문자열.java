package n01_문자열;

import java.util.Scanner;

/*
StringBuilder 를 사용해 문자열을 뒤집고, equalsIgnoreCase()로 회문여부를 확인하는 방법:
- StringBuilder 의 reverse() 메서드를 사용해 문자열 뒤집기
- equalsIgnoreCase(): 대소문자 구분없이 두 문자열이 동일한지 비교
*/

public class _07_회문문자열 {

    // 1. StringBuilder 사용
    public String solution(String str) {
        String answer = "YES";
        String tmp = new StringBuilder(str).reverse().toString(); // 문자열 뒤집기
        if (!str.equalsIgnoreCase(tmp)) { // 대소문자 무시하고 비교
            answer = "NO";
        }
        return answer;
    }

    // 2. 양 끝에서 문자를 비교하여 회문 여부 확인
    public String solution1(String str) {
        String answer = "YES";
        str = str.toUpperCase();
        int len = str.length();

        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                return "NO";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _07_회문문자열 T = new _07_회문문자열();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println("StringBuilder 를 사용한 결과: " + T.solution(str));
        System.out.println("양 끝에서 문자를 비교한 결과: " + T.solution1(str));
    }
}

package n01_문자열;

import java.util.Scanner;

public class _09_숫자만추출 {
    public int solution(String str) {
        String answer = "";

        for (char x : str.toCharArray()) {
            if (Character.isDigit(x)) {
                answer += x;
            }
        }

        return Integer.parseInt(answer); // 문자열을 정수로 변환
    }
    public static void main(String[] args) {
        _09_숫자만추출 T = new _09_숫자만추출();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}

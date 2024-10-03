package _01_string;

import java.util.Scanner;

public class _08_팰린드롬 {
    public String solution(String str) {
        String answer = "NO";

        /*
        1. 문자열을 대문자로 변환
        2. 정규식을 사용해 알파벳 대문자가 아닌 모든 문자를 제거
            replaceAll("[^A-Z]", ""):
            - [^A-Z]: A 부터 Z 까지, 대문자가 아닌 모든 문자
            - replaceAll([정규식], 바꿀문자) : [정규식]에 해당하는 모든 문자를 찾아 빈 문자열("")로 대체
        */
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        // 문자열을 뒤집고 비교
        String tmp = new StringBuilder(str).reverse().toString();
        if (str.equals(tmp)) {
            answer = "YES";
        }

        return answer;
    }

    public static void main(String[] args) {
        _08_팰린드롬 T = new _08_팰린드롬();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}

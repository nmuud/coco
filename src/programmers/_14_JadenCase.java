package programmers;

import java.util.Arrays;

public class _14_JadenCase {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        String[] str = s.toLowerCase().split(" ", -1); // 공백도 포함하여 분리

        System.out.println(Arrays.toString(str));

        for (int i = 0; i < str.length; i++) {
            String x = str[i];
            if (x.length() > 0) {
                // 첫 글자 대문자 변환, 나머지 글자는 그대로 추가
                answer.append(Character.toUpperCase(x.charAt(0)))
                        .append(x.substring(1));
            }
            if (i < str.length - 1) { // 마지막 단어가 아닐 때만 공백 추가
                answer.append(" ");
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        _14_JadenCase T = new _14_JadenCase();
        String s1 = "3people unFollowed me";
        String s2 = "for the last week";

        System.out.println(T.solution(s1));
        System.out.println(T.solution(s2));
    }
}

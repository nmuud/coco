package n01_문자열;

import java.util.Scanner;

/*
str.charAt(i): 현재 인덱스(i)의 문자
str.indexOf(str.charAt(i)): 현재 문자가 처음으로 등장한 인덱스
현재 문자의 처음 등장 위치 == 현재 인덱스(i) : 처음 나온 문자
*/

public class _06_중복문자제거 {
    public String solution(String str) {
        String answer = "";

        for (int i = 0; i < str.length(); i++) {
            // 디버깅용 출력: 현재문자, 현재인덱스, 현재 문자의 첫 등장 인덱스
            // System.out.println(str.charAt(i) + " " + i + " " + str.indexOf(str.charAt(i)));

            if (str.indexOf(str.charAt(i)) == i) {
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _06_중복문자제거 T = new _06_중복문자제거();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
    }
}

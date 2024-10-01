package n01_문자열;

import java.util.Scanner;

public class _03_문장속단어 {
    public String solution(String str) {
        String answer = "";
        int m = Integer.MIN_VALUE;

        String[] arr = str.split(" ");

        for (String x : arr) {
            int len = x.length();

            if (len > m) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        _03_문장속단어 T = new _03_문장속단어();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(T.solution(str));
    }
}

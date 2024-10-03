package _01_string;

import java.util.ArrayList;
import java.util.Scanner;

public class _04_단어뒤집기 {
    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();

        /*
        StringBuilder 를 사용하여 문자열을 뒤집고 변환하는 방법

        for (String x : str) {
            String tmp = new StringBuilder(x).reverse().toString();
            answer.add(tmp);
        }
        */

        for (String x : str) {
            char[] s = x.toCharArray(); // String -> char[] 변환
            int lt = 0;
            int rt = x.length() - 1;

            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }

            String tmp = String.valueOf(s); // char[] -> String 변환
            answer.add(tmp);
        }

        return answer;
    }


    public static void main(String[] args) {
        _04_단어뒤집기 T = new _04_단어뒤집기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        for (String x : T.solution(n, arr)) {
            System.out.println(x);
        }
    }
}

package programmers;

import java.util.Arrays;
import java.util.Comparator;

public class _02_가장큰수 {
    public String solution(int[] numbers) {

        String[] strNum = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNum[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(strNum, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b + a).compareTo(a + b);
            }
        });

        StringBuilder answerBuilder = new StringBuilder();
        for (String x : strNum) {
            answerBuilder.append(x);
        }

        String answer = answerBuilder.toString();
        if (answer.startsWith("0")) {
            return "0";
        }

        return answer;
    }

    public static void main(String[] args) {
        _02_가장큰수 T = new _02_가장큰수();
        int[] numbers1 = {6, 10, 2};
        int[] numbers2 = {3, 30, 34, 5, 9};

        System.out.println(T.solution(numbers1)); // 출력: "6210"
        System.out.println(T.solution(numbers2)); // 출력: "9534330"
    }
}

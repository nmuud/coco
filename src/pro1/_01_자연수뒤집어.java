package pro1;

import java.util.Arrays;

public class _01_자연수뒤집어 {
    public int[] solution1(long n) {
        String str = String.valueOf(n);
        int len = str.toCharArray().length;
        int[] answer = new int[len];

        for (int i = 0; i < len; i++) {
            answer[i] = str.charAt(len - i - 1) - '0';
        }

        return answer;
    }
    public int[] solution2(long n) {
        String str = String.valueOf(n);
        String reversed = new StringBuilder(str).reverse().toString();
        char[] arr = reversed.toCharArray();

        int[] answer = new int[arr.length];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = arr[i] - '0';
        }

        return answer;
    }



    public static void main(String[] args) {
        _01_자연수뒤집어 T = new _01_자연수뒤집어();
        System.out.println(Arrays.toString(T.solution1(12345)));
        System.out.println(Arrays.toString(T.solution2(12345)));

    }
}

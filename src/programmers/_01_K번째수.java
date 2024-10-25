package programmers;

import java.util.Arrays;

public class _01_K번째수 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0]; // i번째 숫자
            int end = commands[i][1];   // j번째 숫자
            int k = commands[i][2];     // k번째 숫자

            int[] slicedArray = Arrays.copyOfRange(array, start - 1, end);

            Arrays.sort(slicedArray);

            answer[i] = slicedArray[k - 1];
        }

        return answer;
    }

    public static void main(String[] args) {
        _01_K번째수 T = new _01_K번째수();

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = T.solution(array, commands);
        System.out.println(Arrays.toString(result));
    }
}

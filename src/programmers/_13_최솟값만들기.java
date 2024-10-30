package programmers;

import java.util.Arrays;

public class _13_최솟값만들기 {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int n = A.length;

        for (int i = 0; i < n; i++) {
            answer += (A[i] * B[n - 1 - i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        _13_최솟값만들기 T = new _13_최솟값만들기();
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};
        System.out.println(T.solution(A, B));
    }
}

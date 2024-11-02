package programmers;

import java.util.Arrays;

public class _18_행렬의곱셈 {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length;     // arr1의 행의 개수
        int cols = arr2[0].length;  // arr2의 열의 개수
        int n = arr2.length;        // arr2의 행의 개수, arr1의 열의 개수와 같아야 함

        int[][] answer = new int[rows][cols]; // 결과 행렬 초기화

        // 행렬 곱셈 수행
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += arr1[i][k] * arr2[k][j];
                }
                answer[i][j] = sum; // 결과 행렬의 (i, j) 위치에 합산 결과 저장
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _18_행렬의곱셈 T = new _18_행렬의곱셈();
        int[][] arr1 = {{1, 4}, {3, 2}, {4, 1}};
        int[][] arr2 = {{3, 3}, {3, 3}};

        int[][] answer = T.solution(arr1, arr2);

        for (int[] x : answer) {
            System.out.println(Arrays.toString(x));
        }

    }
}

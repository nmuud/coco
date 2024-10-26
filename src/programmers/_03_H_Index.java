package programmers;

import java.util.Arrays;

public class _03_H_Index {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        int hIndex = 0;// H-Index 초기화
        int n = citations.length; // 논문 개수

        for (int i = 0; i < n; i++) {
            if (citations[i] >= n - i) {
                hIndex = n - i;
                break;
            }
        }

        return hIndex;
    }

    public static void main(String[] args) {
        _03_H_Index T = new _03_H_Index();
        int[] citations = {3, 0, 6, 1, 5};
        System.out.println(T.solution(citations));
    }
}

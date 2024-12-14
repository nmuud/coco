package pro1;

public class _06_배열의원소만큼추가 {
    public int[] solution(int[] arr) {
        // 1. 총 필요한 배열의 크기 계산
        int totalSize = 0;
        for (int num : arr) {
            totalSize += num;
        }

        // 2. 결과 배열 answer 초기화
        int[] answer = new int[totalSize];
        int index = 0;

        // 3. arr 배열을 순회하며 각 원소를 X에 추가
        for (int num : arr) {
            for (int i = 0; i < num; i++) {
                answer[index++] = num;
            }
        }

        return answer;
    }
}

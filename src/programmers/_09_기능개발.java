package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _09_기능개발 {
    public int[] solution(int[] progresses, int[] speeds) {

        int n = progresses.length;
        int[] days = new int[n];
        List<Integer> answer = new ArrayList<>(); // 배포되는 기능 수 저장

        // 각 작업의 완료까지 걸리는 날짜 계산
        for (int i = 0; i < n; i++) {
            int remaining = 100 - progresses[i]; // 남은 진도
            // 완료까지 걸리는 일수 계산 (올림 처리)
            days[i] = (remaining + speeds[i] - 1) / speeds[i];
        }

        int cnt = 1; // 배포될 기능 수 카운트
        int maxDay = days[0]; // 첫 번째 작업의 완료 날짜로 초기화

        // 기능이 배포되는 개수 계산
        for (int i = 1; i < n; i++) {
            if (days[i] <= maxDay) {
                cnt++;
            } else {
                answer.add(cnt);
                cnt = 1;
                maxDay = days[i];
            }
        }

        answer.add(cnt);

        return answer.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        _09_기능개발 T = new _09_기능개발();
        int[] progresses1 = {93, 30, 55};
        int[] speeds1 = {1, 30, 5};

        int[] progresses2 = {95, 90, 99, 99, 80, 99};
        int[] speeds2 = {1, 1, 1, 1, 1, 1};

        System.out.println(Arrays.toString(T.solution(progresses1, speeds1))); // 출력: [2, 1]
        System.out.println(Arrays.toString(T.solution(progresses2, speeds2))); // 출력: [1, 3, 2]
    }
}

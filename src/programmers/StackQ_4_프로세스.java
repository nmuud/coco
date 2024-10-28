package programmers;

import java.util.*;

public class StackQ_4_프로세스 {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        Queue<Integer> queue = new LinkedList<>();
        int[] priorityCount = new int[priorities.length];

        // queue 에 프로세스와 우선순위 저장
        for (int i = 0; i < priorities.length; i++) {
            queue.offer(i);
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();
            boolean hasHigherPriority = false;

            // 현재 프로세스보다 높은 우선순위가 있는지 체크
            for (int i : queue) {
                if (priorities[i] > priorities[current]) {
                    hasHigherPriority = true;
                    break;
                }
            }

            if (hasHigherPriority) {
                queue.offer(current); // 우선순위 높은 프로세스가 있으면 다시 넣기
            } else {
                answer++; // 높은 우선순위가 없다면 실행
                if (current == location) { // 찾고자 하는 위치이면 반환
                    return answer;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        StackQ_4_프로세스 T = new StackQ_4_프로세스();
        int[] priorities1 = {2, 1, 3, 2};
        int location1 = 2;

        int[] priorities2 = {1, 1, 9, 1, 1, 1};
        int location2 = 0;

        System.out.println(T.solution(priorities1, location1));
        System.out.println(T.solution(priorities2, location2));
    }
}

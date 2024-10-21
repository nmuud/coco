package _09_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Timestamp implements Comparable<Timestamp> {
    public int time;
    public char state;

    public Timestamp(int time, char state) {
        this.time = time; // 시간 (도착 또는 떠나는 시간)
        this.state = state; // 상태 ('s': 도착, 'e': 떠남)
    }

    @Override
    public int compareTo(Timestamp ob) {
        if (this.time == ob.time) {
            return this.state - ob.state; // 시간이 같으면 상황(e, s)로 정렬 -> 'e' 먼저
        } else {
            return this.time - ob.time; // 시간이 다르면 시간 기준으로 오름차순 정렬
        }
    }
}

public class _03_결혼식 {
    public int solution(ArrayList<Timestamp> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr); // 시간을 기준으로 정렬
        int cnt = 0;

        // 테스트용 로그 출력
        System.out.println("정렬된 Timestamp 배열:");
        for (Timestamp ob : arr) {
            System.out.println("시간: " + ob.time + ", 상태: " + ob.state); // 각각의 속성 출력
        }

        for (Timestamp ob : arr) {
            if (ob.state == 's') {
                cnt++;      // 사람이 도착할 때 인원 수 증가
            } else {
                cnt--;      // 사람이 떠날 때 인원 수 감소
            }

            answer = Math.max(answer, cnt); // 최대 인원 수 갱신
        }

        return answer; // 피로연장에서 동시에 있었던 최대 인원 수를 반환
    }

    public static void main(String[] args) {
        _03_결혼식 T = new _03_결혼식();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Timestamp> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int startTime = sc.nextInt(); // 도착 시간
            int endTime = sc.nextInt();   // 떠나는 시간
            arr.add(new Timestamp(startTime, 's')); // 도착 시간 추가
            arr.add(new Timestamp(endTime, 'e'));   // 떠난 시간 추가
        }

        // 테스트용 로그 출력
        System.out.println("입력된 Timestamp 배열:");
        for (Timestamp ob : arr) {
            System.out.println("시간: " + ob.time + ", 상태: " + ob.state);
        }

        System.out.println(T.solution(arr));
    }
}
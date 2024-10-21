package _09_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    public int start, end;

    public Time(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int compareTo(Time o) {
        // 종료 시간이 같으면 시작 시간으로 오름차순 정렬
        if (this.end == o.end) {
            return this.start - o.start;
        } else {
            // 종료 시간을 기준으로 오름차순 정렬
            return this.end - o.end;
        }
    }
}

public class _02_회의실배정 {
    public int solution(ArrayList<Time> arr, int n) {
        int cnt = 0;
        Collections.sort(arr);
        int endTime = 0; // 마지막으로 선택된 회의의 종료 시간을 저장하는 변수
        for (Time meeting : arr) {
            // 시작 시간이 마지막 회의 종료 시간보다 크거나 같으면 회의 선택
            if (meeting.start >= endTime) {
                cnt++;
                endTime = meeting.end; // 종료 시간을 현재 회의의 종료 시간으로 갱신
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        _02_회의실배정 T = new _02_회의실배정();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            arr.add(new Time(x, y));
        }

        System.out.println(T.solution(arr, n));
    }
}
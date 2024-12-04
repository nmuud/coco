package _10_dp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brickk implements Comparable<Brickk> {
    public int s, h, w;

    public Brickk(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Brickk ob) {
        return ob.s - this.s; // 넓이를 기준으로 내림차순
    }
}

public class _04_가장높은탑쌓기1 {
    static int[] dy;

    public int solution(ArrayList<Brickk> arr) {
        int n = arr.size();
        int[] dp = new int[n]; // DP 배열
        int answer = 0;

        // 벽돌을 면적에 따라 내림차순으로 정렬
        Collections.sort(arr);

        // DP 배열 초기화
        for (int i = 0; i < n; i++) {
            dp[i] = arr.get(i).h; // 각 벽돌의 높이로 초기화
        }

        // DP 계산
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr.get(i).w < arr.get(j).w) { // 무게가 더 가벼운 경우
                    dp[i] = Math.max(dp[i], dp[j] + arr.get(i).h);
                }
            }
        }

        // 최대 높이 계산
        for (int h : dp) {
            answer = Math.max(answer, h);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        _04_가장높은탑쌓기1 tower = new _04_가장높은탑쌓기1();

        // 벽돌의 수 입력
        int n = sc.nextInt();

        ArrayList<Brickk> bricks = new ArrayList<>();

        // 각 벽돌의 속성 입력
        for (int i = 0; i < n; i++) {
            int s = sc.nextInt();  // 넓이
            int h = sc.nextInt();  // 높이
            int w = sc.nextInt();  // 무게
            bricks.add(new Brickk(s, h, w));
        }

        // 가장 높은 탑의 높이 계산 및 출력
        int result = tower.solution(bricks);
        System.out.println("가장 높은 탑의 높이는: " + result);
    }
}

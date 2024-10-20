package _09_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Body implements Comparable<Body> {
    public int height, weight;

    public Body(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    @Override
    public int compareTo(Body o) {
        return o.height - this.height; // 키를 기준으로 내림차순 정렬
    }
}

public class _01_씨름선수 {
    public int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr); // 키를 기준으로 내림차순 정렬
        int max = Integer.MIN_VALUE;
        for (Body ob : arr) {
            if (ob.weight > max) {
                max = ob.weight; // 새로운 최대 몸무게 갱신
                cnt++;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        _01_씨름선수 T = new _01_씨름선수();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            arr.add(new Body(height, weight));
        }
        System.out.println(T.solution(arr, n));
    }
}
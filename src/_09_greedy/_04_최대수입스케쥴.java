package _09_greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

class Lecture implements Comparable<Lecture> {
    public int money;
    public int date;

    public Lecture(int money, int time) {
        this.money = money;
        this.date = time;
    }

    @Override
    public int compareTo(Lecture ob) {
        return ob.date - this.date; // 내림차순 정렬
    }
}

public class _04_최대수입스케쥴 {
    static int n, max = Integer.MIN_VALUE;

    public int solution(ArrayList<Lecture> arr) {
        int answer = 0;
        // 기본형. 작은 값부터 뽑음

        PriorityQueue<Integer> pQ = new PriorityQueue<>();
        // 큰값을 우선순위로 한다
        PriorityQueue<Integer> pQ1 = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr); // time 이 큰것부터 정렬

        int j = 0;
        for (int i = max; i >= 1; i--) { // 3일부터 하루씩 작아짐
            for (; j < n; j++) {
                if (arr.get(j).date < i) {
                    break;
                } else {
                    pQ.offer(arr.get(j).money);
                }
            }
            if (!pQ.isEmpty()) {
                answer += pQ.poll();
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        _04_최대수입스케쥴 T = new _04_최대수입스케쥴();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        ArrayList<Lecture> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int m = sc.nextInt();
            int d = sc.nextInt();
            arr.add(new Lecture(m, d));
            if (d > max) {
                max = d;
            }
        }

        System.out.println(T.solution(arr));
    }
}

package _04_hashmap_treeset;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class _03_매출액의종류 {
    public ArrayList<Integer> solution(int n, int k, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        // k일 윈도우 구성
        for (int i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        answer.add(map.size()); // 윈도우 매출 종류 개수 저장

        int lt = 0;
        for (int rt = k; rt < arr.length; rt++) {
            // 슬라이딩 윈도우 이동: rt값 추가, lt값 제거
            map.put(arr[rt], map.getOrDefault(arr[rt], 0) + 1);
            map.put(arr[lt], map.get(arr[lt]) - 1);

            // value 가 0인 key 를 HashMap 에서 제거
            if (map.get(arr[lt]) == 0) {
                map.remove(arr[lt]);
            }
            lt++;
            answer.add(map.size());
        }

        return answer;
    }

    public static void main(String[] args) {
        _03_매출액의종류 T = new _03_매출액의종류();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int x : T.solution(n, k, arr)) {
            System.out.print(x + " ");
        }
    }
}

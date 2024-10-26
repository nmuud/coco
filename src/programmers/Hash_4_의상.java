package programmers;

import java.util.HashMap;

public class Hash_4_의상 {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < clothes.length; i++) {
            hashMap.put(clothes[i][1], hashMap.getOrDefault(clothes[i][1], 0) + 1);
        }

        for (Integer x : hashMap.values()) {
            answer *= (x + 1);
        }

        return answer - 1;
    }

    // 개선된 코드
    public int solution1(String[][] clothes) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String[] x : clothes) {
            String str = x[1];
            hashMap.put(str, hashMap.getOrDefault(str, 0) + 1);
        }

        int answer = 1;
        for (int x : hashMap.values()) {
            answer *= (x + 1);
        }

        return answer - 1;

    }

    public static void main(String[] args) {
        Hash_4_의상 T = new Hash_4_의상();
        String[][] clothes1 = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };

        String[][] clothes2 = {
                {"crow_mask", "face"},
                {"blue_sunglasses", "face"},
                {"smoky_makeup", "face"}
        };

        System.out.println(T.solution(clothes1));
        System.out.println(T.solution(clothes2));

        System.out.println(T.solution1(clothes1));
        System.out.println(T.solution1(clothes2));
    }
}

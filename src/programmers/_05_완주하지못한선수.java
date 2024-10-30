package programmers;

import java.util.HashMap;

public class _05_완주하지못한선수 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String x : participant) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }

        for (String x : completion) {
            hashMap.put(x, hashMap.get(x) - 1);
            if (hashMap.get(x) == 0) {
                hashMap.remove(x);
            }
        }

        for (String x : hashMap.keySet()) {
            answer = x;
        }

        return answer;
    }

    // 개선된 코드
    public String solution1(String[] participant, String[] completion) {
        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String x : participant) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }

        for (String x : completion) {
            hashMap.put(x, hashMap.get(x) - 1);
        }

        // 완주하지 못한 선수 찾기
        for (String x : hashMap.keySet()) {
            if (hashMap.get(x) > 0) {
                return x;
            }
        }

        return "";
    }

    public static void main(String[] args) {
        _05_완주하지못한선수 T = new _05_완주하지못한선수();
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};

        System.out.println(T.solution(participant, completion));
        System.out.println(T.solution1(participant, completion));
    }
}

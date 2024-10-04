package _04_hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class _02_아나그램 {
    public String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();

        // 1. s1의 각 문자의 빈도를 HashMap 에 기록
        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // 2. HashMap 에서 s2의 문자를 제거하며 애너그램인지 확인하기
        for (char x : s2.toCharArray()) {
            // 지울 키가 없거나, 지우려는 키의 값이 0
            if (!map.containsKey(x) || map.get(x) == 0) {
                return "NO";
            } else {
                // 문자가 존재하면 해당 문자 빈도를 하나 줄인다
                map.put(x, map.get(x) - 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _02_아나그램 T = new _02_아나그램();
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        System.out.println(T.solution(s1, s2));
    }
}

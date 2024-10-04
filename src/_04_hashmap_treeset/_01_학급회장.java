package _04_hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class _01_학급회장 {
    public char solution(int n, String str) {
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();

        // getOrDefault(Object key, V defaultValue):
        // - key 가 존재하면 해당 값을 반환, 없으면 defaultValue 반환하여 첫 카운트로 사용
        // 이후 +1을 추가하여 득표수를 증가시킨다
        for (char x : str.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        // 디버깅용 출력
        System.out.println(map); // {A=3, B=3, C=5, D=2, E=2}
        System.out.println(map.keySet()); // [A, B, C, D, E]

        int max = Integer.MIN_VALUE;
        for (char key : map.keySet()) {
            if (map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _01_학급회장 T = new _01_학급회장();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(n, str));
    }
}

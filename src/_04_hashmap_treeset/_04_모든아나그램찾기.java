package _04_hashmap_treeset;

import java.util.HashMap;
import java.util.Scanner;

public class _04_모든아나그램찾기 {
    public int solution(String a, String b) {
        int answer = 0;
        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();

        // 목표 문자열 b의 각 문자 빈도를 저장
        for (char x : b.toCharArray()) {
            bm.put(x, bm.getOrDefault(x, 0) + 1);
        }

        // a의 슬라이딩 윈도우 준비
        int L = b.length() - 1;
        for (int i = 0; i < L; i++) {
            am.put(a.charAt(i), am.getOrDefault(a.charAt(i), 0) + 1);
        }

        // a의 문자열을 슬라이딩 윈도우로 이동시키며 b의 아나그램 찾기
        int lt = 0;
        for (int rt = L; rt < a.length(); rt++) {
            am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt), 0) + 1);
            if (am.equals(bm)) {
                answer++;
            }
            am.put(a.charAt(lt), am.get(a.charAt(lt)) - 1);
            if (am.get(a.charAt(lt)) == 0) {
                am.remove(a.charAt(lt));
            }
            lt++;
        }

        return answer;
    }

    public static void main(String[] args) {
        _04_모든아나그램찾기 T = new _04_모든아나그램찾기();
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(T.solution(a, b));
    }
}

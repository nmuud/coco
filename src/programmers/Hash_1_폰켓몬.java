package programmers;

import java.util.HashMap;
import java.util.HashSet;

public class Hash_1_폰켓몬 {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int x : nums) {
            hashMap.put(x, hashMap.getOrDefault(x, 0) + 1);
        }

        if (hashMap.size() > nums.length / 2) {
            answer = nums.length / 2;
        } else {
            answer = hashMap.size();
        }

        return answer;
    }

    // 개선된 코드
    public int solution1(int[] nums) {
        // HashSet 으로 중복을 제거하고 포켓몬 종류만 남긴다
        HashSet<Integer> hashSet = new HashSet<>();

        // 배열을 순회하며 종류 번호를 추가
        for (int x : nums) {
            hashSet.add(x);
        }

        return Math.min(hashSet.size(), nums.length / 2);
    }

    public static void main(String[] args) {
        Hash_1_폰켓몬 T = new Hash_1_폰켓몬();
        int[] nums1 = {3, 1, 2, 3};
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        int[] nums3 = {3, 3, 3, 2, 2, 2};

        System.out.println(T.solution(nums1));
        System.out.println(T.solution(nums2));
        System.out.println(T.solution(nums3));

        System.out.println(T.solution1(nums1));
        System.out.println(T.solution1(nums2));
        System.out.println(T.solution1(nums3));
    }
}

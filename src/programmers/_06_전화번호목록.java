package programmers;

import java.util.HashSet;

public class _06_전화번호목록 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;

        HashSet<String> hashSet = new HashSet<>();

        for (String x : phone_book) {
            hashSet.add(x);
        }

        for (String x : phone_book) {
            for (int i = 1; i < x.length(); i++) { // 1부터 시작하여 접두어 확인
                if (hashSet.contains(x.substring(0, i))) {
                    return false;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _06_전화번호목록 T = new _06_전화번호목록();
        String[] phone_book1 = {"119", "97674223", "1195524421"};
        String[] phone_book2 = {"123", "456", "789"};
        String[] phone_book3 = {"12", "123", "1235", "567", "88"};

        System.out.println(T.solution(phone_book1));
        System.out.println(T.solution(phone_book2));
        System.out.println(T.solution(phone_book3));
    }
}

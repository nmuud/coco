package pro1;

public class _02_시저암호 {
    public String solution(String s, int n) {
        StringBuilder result = new StringBuilder();

        for (char x : s.toCharArray()) {
            // 공백일 경우 그대로 추가
            if (x == ' ') {
                result.append(x);
            }
            // 대문자 처리
            else if (x >= 'A' && x <= 'Z') {
                result.append((char) ((x - 'A' + n) % 26 + 'A'));
            }
            // 소문자 처리
            else if (x >= 'a' && x <= 'z') {
                result.append((char) ((x - 'a' + n) % 26 + 'a'));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        _02_시저암호 T = new _02_시저암호();
        System.out.println(T.solution("AB", 1));
        System.out.println(T.solution("z", 1));
        System.out.println(T.solution("a B z", 4));
    }
}

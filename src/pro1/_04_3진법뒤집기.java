package pro1;

public class _04_3진법뒤집기 {
    public int solution(int n) {
        // 정수를 3진법으로 변환하여 문자열로 저장
        String str = Integer.toString(n, 3);

        // 3진법 문자열을 뒤집음
        String reversed = new StringBuilder(str).reverse().toString();

        // 뒤집은 3진법 문자열을 다시 정수로 변환하여 반환
        return Integer.valueOf(reversed, 3);
    }
}

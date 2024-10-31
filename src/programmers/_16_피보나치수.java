package programmers;

public class _16_피보나치수 {

    public int solution(int n) {
        int[] fib = new int[n + 1]; // 피보나치 수를 저장할 배열 생성
        fib[0] = 0; // F(0) 초기화
        fib[1] = 1; // F(1) 초기화

        // 2부터 n까지의 피보나치 수를 계산
        for (int i = 2; i <= n; i++) {
            fib[i] = (fib[i - 1] + fib[i - 2]) % 1234567;
        }

        return fib[n];
    }

    public static void main(String[] args) {
        _16_피보나치수 T = new _16_피보나치수();
        System.out.println(T.solution(3));
        System.out.println(T.solution(5));
    }
}

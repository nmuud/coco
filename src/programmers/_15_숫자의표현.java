package programmers;

public class _15_숫자의표현 {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int lt = 1;

        for (int rt = 1; rt <= n; rt++) {
            sum += rt;

            while (sum > n) {
                sum -= lt++;
            }

            if (sum == n) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _15_숫자의표현 T = new _15_숫자의표현();
        int n = 15;
        System.out.println(T.solution(n));
    }

}

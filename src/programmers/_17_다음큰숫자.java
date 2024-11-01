package programmers;

public class _17_다음큰숫자 {
    public int solution(int n) {
        int oneCount = Integer.bitCount(n); // n의 1의 개수를 센다
        int nextNum = n + 1; // n보다 큰 다음 수부터 시작

        // 1의 개수가 같아질 때까지 다음 수를 찾는다
        while (Integer.bitCount(nextNum) != oneCount) {
            nextNum++;
        }

        return nextNum;
    }

    public static void main(String[] args) {
        _17_다음큰숫자 T = new _17_다음큰숫자();
        System.out.println(T.solution(78));
        System.out.println(T.solution(15));
    }
}

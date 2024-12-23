package pro1;

public class _08_간단한식계산하기 {
    public int solution(String binomial) {
        // 공백을 기준으로 문자열 분리
        String[] parts = binomial.split(" ");

        // 각 부분을 변수에 할당
        int a = Integer.parseInt(parts[0]); // 첫 번째 숫자
        String op = parts[1];               // 연산자
        int b = Integer.parseInt(parts[2]); // 두 번째 숫자

        // 연산자에 따른 계산
        int result = 0;
        if (op.equals("+")) {
            result = a + b;
        } else if (op.equals("-")) {
            result = a - b;
        } else if (op.equals("*")) {
            result = a * b;
        }

        return result;
    }

    public static void main(String[] args) {
        _08_간단한식계산하기 sc = new _08_간단한식계산하기();

        // 테스트 케이스
        System.out.println(sc.solution("43 + 12"));       // 출력: 55
        System.out.println(sc.solution("0 - 7777"));      // 출력: -7777
        System.out.println(sc.solution("40000 * 40000")); // 출력: 1600000000
    }
}

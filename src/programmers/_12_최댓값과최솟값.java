package programmers;

public class _12_최댓값과최솟값 {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split(" ");

        // 첫 번째 숫자를 초기값으로 설정
        int min = Integer.parseInt(str[0]);
        int max = Integer.parseInt(str[0]);

        for (String x : str) {
            int n = Integer.parseInt(x);
            if (n < min) {
                min = n;
            }

            if (n > max) {
                max = n;
            }
        }

        answer = min + " " + max;
        return answer;
    }

    public static void main(String[] args) {
        _12_최댓값과최솟값 T = new _12_최댓값과최솟값();
        String s1 = "1 2 3 4";
        String s2 = "-1 -2 -3 -4";
        String s3 = "-1 -1";

        System.out.println(T.solution(s1));
        System.out.println(T.solution(s2));
        System.out.println(T.solution(s3));
    }
}

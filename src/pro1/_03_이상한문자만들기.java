package pro1;

public class _03_이상한문자만들기 {
    public String solution(String s) {
        String[] words = s.split(" ", -1);
        StringBuilder answer = new StringBuilder();

        for (int w = 0; w < words.length; w++) {
            String word = words[w];
            for (int i = 0; i < word.length(); i++) {
                char x = word.charAt(i);
                if (i % 2 == 0) {
                    answer.append(Character.toUpperCase(x));
                } else {
                    answer.append(Character.toLowerCase(x));
                }
            }
            if (w < words.length - 1) {
                answer.append(" ");
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        _03_이상한문자만들기 T = new _03_이상한문자만들기();
        System.out.println(T.solution("try hello world"));
    }
}

package pro1;

public class _07_이어붙인수 {
    public int solution(int[] num_list) {
        String oddStr = "";   // 홀수를 이어 붙일 문자열
        String evenStr = "";  // 짝수를 이어 붙일 문자열

        // num_list의 각 원소를 순회하면서 홀수와 짝수를 구분하여 처리
        for (int num : num_list) {
            if (num % 2 == 0) {
                evenStr += num;  // 짝수일 경우 evenStr에 추가
            } else {
                oddStr += num;   // 홀수일 경우 oddStr에 추가
            }
        }

        // 홀수와 짝수를 이어 붙인 문자열을 각각 정수로 변환 후 더함
        int oddNumber = Integer.parseInt(oddStr);
        int evenNumber = Integer.parseInt(evenStr);

        return oddNumber + evenNumber;  // 두 정수의 합을 반환
    }
}

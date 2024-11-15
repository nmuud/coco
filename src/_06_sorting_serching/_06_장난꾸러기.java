package _06_sorting_serching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class _06_장난꾸러기 {

    public ArrayList<Integer> solution(int n, int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone(); // 깊은복사
        Arrays.sort(tmp);
        for (int i = 0; i < n; i++) {
            if (arr[i] != tmp[i]) { // 다른걸 찾아야하니까
                answer.add(i + 1);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        _06_장난꾸러기 T = new _06_장난꾸러기();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (Integer x : T.solution(n, arr)) {
            System.out.print(x + " ");
        }
    }
}

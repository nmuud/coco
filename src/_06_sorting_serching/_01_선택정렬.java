package _06_sorting_serching;

import java.util.Scanner;

public class _01_선택정렬 {
    public int[] solution(int n, int[] arr) {

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int tmp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        _01_선택정렬 T = new _01_선택정렬();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x :T.solution(n, arr)){
            System.out.print(x + " ");
        }
    }
}

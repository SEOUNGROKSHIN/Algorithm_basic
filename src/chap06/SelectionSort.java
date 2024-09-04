package chap06;

import java.util.Scanner;

// 단순 선택 정렬
public class SelectionSort {

    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;                        // 아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 저장
            for (int j = i + 1; j < n; j++)
                if (a[j] < a[min])
                    min = j;
            swap(a, i , min);                   // 아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환
        }
    }

    private static void swap(int[] a, int i, int min) {
        int temp = a[i];
        a[i] = a[min];
        a[min] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print("요솟수를 입력하세요. ");
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        System.out.print("a[" + i + "] = " + a[i]);
        }
    }
}

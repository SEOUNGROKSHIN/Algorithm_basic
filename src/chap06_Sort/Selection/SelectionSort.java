package chap06_Sort.Selection;

import java.util.Scanner;

// 단순 선택 정렬
public class SelectionSort {

    static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;                        // 아직 정렬되지 않은 부분에서 가장 작은 요소의 인덱스를 저장
            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[min])
                    min = j;
            swap(arr, i , min);                   // 아직 정렬되지 않은 부분의 첫 요소와 가장 작은 요소를 교환
        }
    }

    private static void swap(int[] arr, int i, int min) {
        int temp = arr[i];
        arr[i] = arr[min];
        arr[min] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("선택 정렬");
        System.out.print("요솟수를 입력하세요. ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
        System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        selectionSort(a, n);
        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < n; i++)
            System.out.println("a[" + i + "]: " + a[i]);
    }
}

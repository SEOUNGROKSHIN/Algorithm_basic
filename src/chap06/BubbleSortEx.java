package chap06;

import java.util.Scanner;

public class BubbleSortEx {

    static void swap(int[] arr, int idx1, int idx2) {
        BubbleSort.swap(arr, idx1, idx2);
    }

    static void bubbleSort(int[] arr, int n) {
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("요솟수를 입력하세요. ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr, n);
        System.out.println("오름차순으로 정렬했습니다.");

        for (int i = 0; i < n; i++)
            System.out.println("x[" + i + "]: " + arr[i]);
    }
}

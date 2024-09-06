package chap06_Sort.Insertion;

import java.util.Scanner;

public class Insertion {
    public static class InsertionSort {
        // 단순 삽입 정렬 == 셔틀 정렬
        static void insertionSort(int[] arr, int n) {
            for (int i = 1; i < n; i++) {
                int j;
                int temp = arr[i];
                for (j = i; j > 0 && arr[j - 1] > temp; j--)
                    arr[j] = arr[j - 1];
                arr[j] = arr[j - 1];
                arr[j] = temp;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("단순 삽입 정렬");
            System.out.print("요솟수: ");
            int nx = sc.nextInt();
            int[] arr = new int[nx];

            for (int i = 0; i < nx; i++) {
                System.out.print("x[" + i + "]:");
                arr[i] = sc.nextInt();
            }

            insertionSort(arr, nx);       // 배열 x를 단순 삽입 정렬

            System.out.println("오름차순으로 정렬했습니다.");
            for (int i = 0; i < nx; i++)
                System.out.println("x[" + i + "]: " + arr[i]);
        }
    }
}

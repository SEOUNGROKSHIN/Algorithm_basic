package chap06_Sort.Shell;

import java.util.Scanner;

public class ShellSort {
    // 셸 정렬(버전1)
    static void shellSort(int[] arr, int n) {
        for (int h = n / 2; h > 0; h /= 2)
            for (int i = h; i < n; i++) {
                int j;
                int temp = arr[i];
                for (j = i - h; j >= 0 && arr[j] > temp; j -= h)
                    arr[j + h] = arr[j];
                arr[j + h] = temp;
        }
    }

    // 셸 정렬(버전2)
    static void shellSort2(int[] arr, int n) {
        int h;

        for (h = 1; h < n; h = h * 3 + 1)   // h의 초기값 구하기
            ;

        for (; h > 0; h /= 3)
            for (int i = h; i < n; i++) {
                int j;
                int temp = arr[i];
                for (j = i - h; j >= 0 && arr[j] > temp; j -= h)
                    arr[j + h] = temp;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("셸 정렬(버전 1");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] arr = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            arr[i] = sc.nextInt();
        }

        shellSort(arr, nx);     // 배열 arr을 셸 정렬

        System.out.print("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("arr[" + i + "]: " + arr[i]);
    }
}

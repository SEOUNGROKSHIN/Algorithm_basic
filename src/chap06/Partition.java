package chap06;

import java.util.Scanner;
// 배열을 나눔
public class Partition {
    // 배열 요소 a[idx]과 a[idx2]의 값을 교환
    static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    // 배열을 나눔
    static void partition(int[] arr, int n) {
        int pl = 0;         // 왼쪽 커서
        int pr = n - 1;     // 오른쪽 커서
        int x = arr[n / 2]; // 피벗(가운데 요소)

        do {
            while(arr[pl] < x) pl++;
            while(arr[pr] > x) pr--;
            if (pl <= pr)
                swap(arr, pl++, pr--);
        } while (pl <= pr);

        System.out.println("피벗값은 " + x + "입니다.");

        System.out.println("피벗 이하의 그룹");

        for (int i = 0; i <= pl - 1; i++)   //arr[0] ~ arr[pl -1]
            System.out.print(arr[i] + " ");
        System.out.println();

        if (pl > pr + 1) {
            System.out.println("피벗과 같은 그룹");
            for (int i = pr + 1; i <= pl - 1; i++)      // arr[pr + 1] ~ arr[pl - 1]
                System.out.print(arr[i] + " ");
            System.out.println();
        }

        System.out.println("피벗 이상의 그룹");
        for (int i = pr + 1; i < n; i++)                // arr[pr + 1] ~ arr[n - 1]
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열을 나눕니다.");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] arr = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        partition(arr, nx);
    }
}

package chap06_Sort.Quick;

import chap04_Que_Stack.stack.IntStack;

import java.util.Scanner;

// 퀵 정렬
public class QuickSort {
    // 배열 요소 a[idx1]과 a[idx2]의 값을 교환
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];; a[idx1] = a[idx2]; a[idx2] = t;
    }

    // 퀵 정렬
    static void quickSort(int[] a, int left, int right) {
        int pl = left;              // 왼쪽 커서
        int pr = right;             // 오른쪽 커서
        int x = a[(pl + pr) / 2];   // 피봇(가운데 요소)

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if (pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if (left < pr) quickSort(a, left, pr);
        if (pl < right) quickSort(a, pl, right);
    }

    // 퀵 정렬(배열을 나누는 과정을 출력)
    static void quickSortV2(int[] a, int left, int right) {
        int pl = left;                  // 왼쪽 커서
        int pr = right;                 // 오른쪽 커서
        int x = a[(pl + pr) / 2];       // 피벗(가운데 요소)

        System.out.printf("a[%d] ~ a[%d]: {", left, right);
        for (int i = left; i < right; i++)
            System.out.printf("%d, ", a[i]);
        System.out.printf("%d}\n", a[right]);

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if (pl <= pr)
                swap(a, pl++, pr--);
        } while (pl <= pr);

        if (left < pr) quickSortV2(a, left, pr);
        if (pl < right) quickSortV2(a, pl, right);
    }

    // 퀵 정렬(비재귀 버전)
    // StackVer
    static void quickSortXRecur(int[] a, int left, int right) {
        IntStack lstack = new IntStack(right - left + 1);           // 나눌 범위의 왼쪽 끝(맨 앞) 요소의 인덱스를 저장하는 스택
        IntStack rstack = new IntStack(right - left + 1);           // 나눌 범위의 오른쪽 끝(맨 뒤) 요소의 인데긋를 저장하는 스택

        lstack.push(left);
        rstack.push(right);

        while (lstack.isEmpty() != true) {
            int pl = left = lstack.pop();       // 왼쪽 커서
            int pr = right = rstack.pop();      // 오른쪽 커서
            int x = a[(pl + pr) / 2];           // 피벗(가운데 요소)

            do {
                while (a[pl] < x) pl++;
                while (a[pr] > x) pr--;
                if (pl <= pr)
                    swap(a, pl++, pr--);
            } while (pl <= pr);

            if (left < pr) {
                lstack.push(left);              // 왼쪽 그룹 범위의
                rstack.push(pr);                // 인덱스를 푸시
            }

            if (pl < right) {
                lstack.push(pl);                // 오른쪽 그룹 범위의
                rstack.push(right);             // 인덱스를 푸시
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("퀵 정렬");
        System.out.print("요솟수: ");
        int nx = sc.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        quickSort(x, 0, nx - 1);            // 배열 x를 퀵 정렬

        System.out.println("오름차순으로 정렬");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "]=" + x[i]);
        }
    }
}

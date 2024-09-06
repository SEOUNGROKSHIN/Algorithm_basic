package chap02_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {


    public static void main(String[] args) {
//        reverseArr1();
//        reverseArr2();
//        sumOf();
//        arrCopy();
        reverseArrCopy();
    }

    private static void reverseArrCopy() {
        int[] arrA = {2, 5, 1, 3, 9, 6, 7};
        int[] arrB = arrA;

        for (int i = 0; i < arrB.length; i++) {
            swap(arrB, i, arrB.length - i - 1);
            reverse(arrB);
            System.out.println("arrB[" + i + "]" + "와 arrB[" + (arrB.length - i - 1) + "]를 교환");
            System.out.println(Arrays.toString(arrB));
        }
    }

    static void arrCopy() {
        int[] arrA = {2, 5, 1, 3, 9, 6, 7};
        int[] arrB = arrA;

        System.out.println("arrA :" + Arrays.toString(arrA));
        System.out.println("arrB :" + Arrays.toString(arrB));
    }

    static void sumOf() {
        int sum = 0;
        int[] arr  = {2, 5, 1, 3, 9, 6, 7};

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            System.out.println("SUM[" + i + "]" + "=" + sum);
        }
    }


    // 배열요소 a[idx1]과 a[idx2]의 값을 바꿈
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }
    // 배열 a의 요소를 역순으로 정렬
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++)
                swap(a , i, a.length - i - 1);
            }


    private static void reverseArr2() {
        int[] arr = {2, 5, 1, 3, 9, 6, 7};

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "]" + "와 arr[" + (arr.length - i - 1) + "]를 교환");
            System.out.println("arr= " + Arrays.toString(arr));
            swap(arr , i , arr.length - i - 1);
        }
            reverse(arr);
            System.out.println("요소를 정렬");
            System.out.println("arr= " + Arrays.toString(arr));
    }

    private static void reverseArr1() {
        Scanner sc = new Scanner(System.in);

        System.out.print("요소수: ");
        int num = sc.nextInt();

        int[] x = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }
        reverse(x);

        System.out.println("요소를 역순으로 정렬");
        System.out.println("x= " + Arrays.toString(x));
    }
}

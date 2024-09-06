package chap06_Sort;

import java.util.Arrays;
import java.util.Scanner;

// Arrays.sort 메서드를 이용 (퀵정렬)
public class ArraySortTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");

        int num = sc.nextInt();
        int[] x = new int[num];         // 길이가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        Arrays.sort(x);         // 배열 x를 정렬

        System.out.println("오름차순으로 정렬");
        for (int i = 0; i < num; i++)
            System.out.println("x[" + i + "]=" + x[i]);
    }
}

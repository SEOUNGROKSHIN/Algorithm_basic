package chap02_Array;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

    static int maxOf(int[] a) {

        int max = a[0];

        for (int i = 1; i < a.length; i++)
            if (a[i] > max)
                max = a[i];
        return max;
    }

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc=  new Scanner(System.in);

        System.out.println("키의 최대값: ");
        System.out.print("사람 수 : ");
        int num = sc.nextInt();

        int[] height = new int[num];

        System.out.println("키값: ");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + rand.nextInt(90);
            System.out.println("height[" + i + "]: " + height[i]);
        }

        System.out.println("최대값은 : " + maxOf(height) + "입니다.");
    }
}

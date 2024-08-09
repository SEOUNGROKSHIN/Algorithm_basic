package chap02;

import java.util.Scanner;

public class intArray {

    public static void main(String[] args) {

//        intArr1();
//        intArrInit1();
        maxArr();

        }

        static  void maxArr() {

        int[] a = {22, 57, 11, 91, 32};


            int max = a[0];

        for (int i = 1; i < a.length; i++)
            if (a[i] > max) max = a[i];
            System.out.println(max);

    }
    static void intArrInit1() {
        int[] a = {1, 2, 3, 4, 5};

        for (int i = 0; i < a.length; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }

    private static void intArr1() {
        int[] a = new int[5];

        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2;

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]" + " = " + a[i]);
        }
    }
}

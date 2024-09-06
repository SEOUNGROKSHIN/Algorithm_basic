package chap01_Arithmatic;

import java.util.Scanner;

public class SumFor2 {

    public static void main(String[] args) {

        checkDigit();

    }

    private static void BA() {
        Scanner sc = new Scanner(System.in);
        System.out.print("a값 : ");
        int a = sc.nextInt();
        System.out.print("b값 : ");
        int b = sc.nextInt();
        int n = 0;
        do {
            System.out.print("a보다 큰값을 입력하세요 : ");
            b = sc.nextInt();
        } while (a >= b);
        n = b - a;
        System.out.println("a : " + a);
        System.out.println("b : " + b);
        System.out.println("b - a : " + n);
    }
    static void checkDigit() {
        Scanner sc = new Scanner(System.in);
        System.out.print("양의 정수를 입력하세요 : ");
        int n = sc.nextInt();

        if (n >= 10 && n <= 100)
            System.out.println("그 수는 2자리 입니다.");
        if(n >= 100 && n <= 1000)
            System.out.println("그 수는 3자리 입니다.");
        if (n >= 1000) {
            System.out.println("그 수는 4자리 입니다.");
        }
    }
}

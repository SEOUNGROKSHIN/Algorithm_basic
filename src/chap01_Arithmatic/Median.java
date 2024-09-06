package chap01_Arithmatic;

import java.util.Scanner;

public class Median {
    static int med3(int a, int b, int c) {
        if(a >= b) // 1 >= 3
            if(b >= c) // 2 >= 3
                return b; //2
            else if (a <= c) // 1<= 3
                return a; // 1
            else
                return c; // 3
            else if(a > c) // 1 > 3
                return a; // 1
            else if(b > c) // 2 > 3
                return c; // 3
            else
                return b; // 2
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의 값: ");
        int a = sc.nextInt();
        System.out.println("b의 값: ");
        int b = sc.nextInt();
        System.out.println("c의 값: ");
        int c = sc.nextInt();

        System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
    }
}

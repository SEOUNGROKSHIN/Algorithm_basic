package chap01_Arithmatic;

import java.util.Scanner;

public class MinNum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 A를 입력 하세요. ");
        int a = sc.nextInt();
        System.out.print("정수 B를 입력 하세요. ");
        int b = sc.nextInt();
        System.out.print("정수 C를 입력 하세요. ");
        int c = sc.nextInt();

        int min = a;

        if (b < a)
            min = b;
        if (c < b)
            min = c;

        System.out.println("최솟수는 " + min + "입니다.");
    }
}

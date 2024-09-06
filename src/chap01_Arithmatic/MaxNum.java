package chap01_Arithmatic;

import java.util.Scanner;

public class MaxNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수 A를 입력 하세요. ");
        int a = sc.nextInt();
        System.out.print("정수 B를 입력 하세요. ");
        int b = sc.nextInt();
        System.out.print("정수 C를 입력 하세요. ");
        int c = sc.nextInt();

        System.out.println("최대값은? ");

        int max = a;

        if (b > a)
            max = b;
        if (c > b)
            max = c;

        System.out.print("최대값은 " + max + "입니다.");
    }
}

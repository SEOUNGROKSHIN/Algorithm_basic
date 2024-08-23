package chap05;

import java.util.Scanner;

public class Recur {

    static int count;

    // 재귀 함수
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. ");
        int n = sc.nextInt();

        recur2(n);
        System.out.print("count: " + count);
//        recur2(n);
    }

    static void recur2(int n) {
        if (n > 0) {
            recur2(n - 2);
            System.out.println(n);
            recur2(n -1);
            count++;
        }
    }
}

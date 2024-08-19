package chap05;

import java.util.Scanner;

// 유클리드 호제법으로 최대공약수를 구함
public class EuclidGCD {

    // 정수 x, y의 최대 공약수를 구하여 반환
    static int gcd(int x, int y) {
        if (y == 0)
            return x;
        else
            return gcd(y, x % y);
    }

    static int gcd2(int x, int y) {

        return y == 0 ? x : gcd2(y, x % y);
    }

    static int gcdArray(int[] a) {

       return a[1] == 0 ? a[0] : gcdArray(a);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("두 정수의 최대공약수를 구합니다.");

        System.out.print("정수를 입력하세요.: "); int x = sc.nextInt();
        System.out.print("정수를 입력하세요.: "); int y = sc.nextInt();

        int[] a = new int[2];

        a[0] = x;
        a[1] = y;

        System.out.println("최대공약수는 " + gcdArray(a) + "입니다.");
    }
}

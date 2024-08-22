package chap05;

import java.util.Scanner;

public class EuclidGCDEx {

    //--- 정수값 x, y의 최대 공약수를 비 재귀적으로 구하여 반환

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("두 정수의 최대 공약수를 구합니다.");

            System.out.print("정수를 입력하세요 : ");   int x = sc.nextInt();
            System.out.print("정수를 입력하세요 : ");   int y = sc.nextInt();

            System.out.println("최대 공약수는 " + gcd(x, y) + "입니다.");
        }

       public static int gcd(int x, int y) {
            while (y != 0) {
                int temp = y;
                y = x % y;
                x = temp;
            }
            return x;
        }
    }

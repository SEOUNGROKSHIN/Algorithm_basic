package chap05_Recur;

import java.util.Scanner;

public class Recur {

    static int count;

    // 재귀 함수
    static void recur(int n) {
        if (n > 0) {
            recur(n - 1);
            recur(n - 2);
            System.out.println(n);
            count++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. ");
        int n = sc.nextInt();
        recur3(n);

    }
    // 재귀함수 X
    static void recur3(int n) {
        if (n > 0) {
            recur3(n - 1);
            recur3(n - 2);
            System.out.println(n);
        }
      }
  }

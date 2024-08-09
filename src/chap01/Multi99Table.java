package chap01;

import java.util.Scanner;

public class Multi99Table {

    public static void main(String[] args) {
//        System.out.println("------- 구구단 곱셈표 ----------");
//        gugu2();
//        plus1();
        square();
    }

    static void square() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정사격형을 출력합니다.");
        System.out.print("변의 길이: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++)
                System.out.print("*");
         }
       }


    private static void gugu1() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++)
               System.out.printf("%3d", i * j);
             System.out.println();
        }
    }

    static void gugu2() {

        // 상단 행 번호 출력
        System.out.print("   |");
        for (int num = 1; num <= 9; num++)
            System.out.printf("%3d", num);
            System.out.println();
        // 구분선
        System.out.print("---+");
        for (int i = 0; i <= 9; i++)
            System.out.print("---");
        System.out.println();

        // 곱셈 계산식
        for (int i = 1; i <= 9; i++) {
                System.out.printf(i + "%3s", "|");   // 왼쪽 행번호 출력
            for (int j = 1; j <= 9; j++)
                    System.out.printf("%3d", i * j);
            System.out.println();
        }
       }

       static void plus1() {
        // 배너
           System.out.println("--------- 더하기표 ----------");

        // 상단 구분선
           System.out.print("   |");
           for (int i = 1; i <= 9; i++)
               System.out.printf("%3d", i);
           System.out.println();
       // 구분선
           System.out.print("---+");
           for (int i = 0; i <= 9; i++)
               System.out.print("---");
           System.out.println();
       // 더하기표
           // 곱셈 계산식
           for (int i = 1; i <= 9; i++) {
               System.out.printf(i + "%3s", "|");   // 왼쪽 행번호 출력
               for (int j = 1; j <= 9; j++)
                   System.out.printf("%3d", i + j);
               System.out.println();
           }
       }
    }

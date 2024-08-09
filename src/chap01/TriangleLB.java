package chap01;

import java.util.Scanner;

public class TriangleLB {

    public static void main(String[] args) {
//        triangleA();
//        triangleLB(5);
//        triangleLU(5);
//        triangleRU(5);
//        triangleRB(5);
        npira(5);

    }

    static void npira(int n) {

        int num = 0;

        for (int i = 0; i < n; i++) {
            num = i % 10;
            // 빈칸 출력
            for (int j = 0; j < n - i - 1; j++)
                System.out.print("  ");

            // 숫자 출력
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.printf("%s", num + " ");
            }
            System.out.println();
        }
    }

    static void spira(int n) {
        // 피라미드 출력
        for (int i = 0; i < n; i++) {
            // 왼쪽 공백 출력
            for (int j = 0; j < n - i - 1; j++)
                System.out.print("  "); // 2칸의 공백 출력

            // 별 출력
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("* ");
            }
            // 줄 바꿈
            System.out.println();
        }
    }
    static void triangleRB(int n) {

        // 오른쪽 아래가 직각인 이등변 삼각형 출력
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i - 1) {
                    System.out.print(" "); // 빈칸 출력
                } else {
                    System.out.print("*"); // 별 출력
                }
            }
            System.out.println(); // 줄 바꿈
        }

    }

        static void triangleRU (int n){

            // 사용자로부터 높이 입력
            System.out.println("삼각형의 높이를 입력하세요: ");

            // 오른쪽 위가 직각인 이등변 삼각형 출력
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (j < i) {
                        System.out.print(" "); // 빈칸 출력
                    } else {
                        System.out.print("*"); // 별 출력
                    }
                }
                System.out.println(); // 줄 바꿈
            }
        }

    static void triangleLU(int n) {

        for (n = 5; n >= 1; n--) {
            for (int j = 1; j <= n; j++)
                System.out.print("*");
               System.out.println();
        }
    }

    static void triangleLB(int n) {
        for (int i = 1; i <= n; i++) {  // 행
            for (int j = 1; j <= i; j++) // 열
                System.out.print("*");
            System.out.println();
        }
    }

    private static void triangleA() {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("이등변 삼각형 출력");

        do {
            System.out.print("이등변 삼각형의 단수 입력: ");
            n = sc.nextInt();
        } while (n <= 0);

        for (int i = 1; i <= n; i++) {// 행 루프
            for (int j = 1; j <= i; j++) // 열 루프
                System.out.print('*');
            System.out.println();
        }
    }
}

package chap02_Array;

import java.util.Scanner;

public class CardConvCopy {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int no;                        // 변환하는 정수
        int cd;                        // 기수
        int dno;                       // 변환 후의 자릿수
        int retry;                     // 다시 한번?
        char[] cno = new char[32];     // 변환 후 각 자리의 숫자를 넣는 문자 배열

        System.out.println("10진수를 기수 변환: ");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수: ");
                no = sc.nextInt();
            } while (no < 0);

            do {
                System.out.print("어떤 진수로 변환할까요? (2 ~ 36): ");
                cd = sc.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConvEx(no, cd, cno);    // no를 cd 진수로 변환

            System.out.print(cd + "진수로 ");

            for (int i = 0; i < dno; i++)   // 순서대로 출력

                System.out.print(cno[i]);   // 진수 변환 결과
            System.out.println("입니다.");

            System.out.print("한 번 더 할까요? (1... 예 / 0.. 아니요): ");
            retry = sc.nextInt();
        } while (retry == 1);
    }

//--- 정숫값 x를 r 진수로 변환하여 배열 d에 아랫자리부터 저장하고 자릿수를 반환 ---//
        static int cardConvEx(int x, int r, char[] d) {
            int n = ((Integer)x).toString().length();// 변환 전의 숫자 자리수
            int digits = 0;								// 변환 후의 자릿수
            String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

            System.out.printf(String.format("%%2d | %%%dd\n", n), r, x);
            // %2d는 r의 값을 두 자리 숫자로, '%dd'는 x의 값을 n == 자릿수 형태로 출력

            do {
                System.out.print("   +");
                for (int i = 0; i < n + 2; i++)
                    System.out.print('-');
                System.out.println();

                if (x / r != 0)
                    System.out.printf(String.format("%%2d | %%%dd    ... %%d\n", n),
                            r, x / r, x % r);
                else
                    System.out.printf(String.format("     %%%dd    ... %%d\n", n),
                            x / r, x % r);
                d[digits++] = dchar.charAt(x % r);   // r 로 나눈 나머지를 저장
                x /= r;
            } while (x != 0);

            for (int i = 0; i < digits/ 2; i++) {   // d[0] ~ d[digits-1]
                char temp = d[i];                  // 을 역순으로 정렬
                d[i] = d[digits - i - 1];
                d[digits - i - 1] = temp;
            }
            return digits;
        }
}
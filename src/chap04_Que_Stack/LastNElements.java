package chap04_Que_Stack;

import java.util.Scanner;

public class LastNElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        int[] a = new int[N];
        int cnt = 0;
        int retry;

        System.out.println("정수를 입력하세요.");

        do {
            System.out.printf("%d번째 정수: ", cnt + 1);
            a[cnt++ % N] = sc.nextInt();    // 1. cnt++ % N  :: 입력한 값을 대입
            System.out.println("a[" + cnt + "] = " + a[cnt % N]);
            System.out.print("계속 할까요? (예.1/아니요.0): ");
            retry = sc.nextInt();
        } while (retry == 1);

        // 2번 시작
        int i = cnt - N;
        if (i < 0) i = 0;

        for (; i < cnt; i++)
            System.out.printf("%2d번째 정수 = %d\n", i + 1, a[i % N]);
        // 2번 끝
    }
}

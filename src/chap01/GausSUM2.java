package chap01;

import java.util.Scanner;

// 1부터 100까지 홀수만 더하기

public class GausSUM2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum = (n + 1) * n / 2;
            i++;
        }
        System.out.println(sum);

    }
}

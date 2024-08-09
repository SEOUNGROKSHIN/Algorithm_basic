package chap01;

import java.util.Scanner;

public class GausSUM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            sum = (1 + n) * n / 2;
        }

        System.out.println("1부터 " + n + "까지의 합은 " + sum);

        }
    }

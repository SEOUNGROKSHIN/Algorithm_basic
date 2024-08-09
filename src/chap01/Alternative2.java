package chap01;

import java.util.Scanner;

public class Alternative2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("+와 -를 번갈아 출력");

//        for (int i = 0; i < n / 2; i++)
//            System.out.print("+-");

        for (int i = 1; i <= n / 2; i++)
            System.out.print("+-");
        if(n % 2 != 0)
            System.out.print("+");
    }
}

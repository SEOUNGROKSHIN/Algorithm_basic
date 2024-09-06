package chap01_Arithmatic;

import java.util.Scanner;

public class SumVerbose1 {

    public static void main(String[] args) {
//        before();
        after();
    }

    private static void before() {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합");

        do {
            System.out.print("n값: ");
            n = sc.nextInt();
        } while (n <= 0);

        int sum = 0;

        for (int i = 0; i < n; i++) {

            if(i < n)
                System.out.print(i + " + ");
            else
                System.out.print(i + " = ");
            sum += i;
        }

        System.out.println(sum);
    }

    static void after() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1부터 n까지의 합");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i < n; i++) {
            System.out.print(i + " + ");
            sum += i;
        }

        System.out.print(n + " = ");
        sum += n;
        System.out.print(sum);
    }
}

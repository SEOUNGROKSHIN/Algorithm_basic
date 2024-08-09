package chap01;

import java.util.Scanner;

public class SumFor {

    static int sumof() {

        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.print("A : ");
        int a = sc.nextInt();
        System.out.print("B : ");
        int b = sc.nextInt();

            if(a > b) {
                for (int i = b; i <= a; i++)
                    sum = sum + i;

                System.out.println("sum = " + sum);
            } else if(a < b)
                for (int i = a; i <= b; i++) {
                sum = sum + i;


        System.out.println("Sum : " + sum);
        }


        return sum;
    }

    public static void main(String[] args) {
        sumof();
    }
  }

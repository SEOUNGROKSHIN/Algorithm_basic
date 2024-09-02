package chap05;// 연습5-3
// 배열의 모든 요소의 최대 공약수를 구합니다

import java.util.Scanner;

class GCDArray {

    //--- 정숫값 x, y의 최대 공약수를 비재귀적으로 구하여 반환 ---//
    static int gcdRecurX(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    static int gcdRecur(int x, int y) {

        return y == 0 ? x : gcdRecur(y, x % y);
    }

    //--- 요솟수가 n인 배열 a의 모든 요소의 최대 공약수를 구합니다 ---//
    static int gcdArray(int a[], int start, int no) {
        if (no == 1)
            return a[start];
        else if (no == 2)
            return gcdRecur(a[start], a[start + 1]);
        else
            return gcdRecur(a[start], gcdArray(a, start + 1 , no - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이를 설정하세요. ");
        int num;
        do {
            num = sc.nextInt();

        } while (num < 1);

          int[] x = new int[num];					// 길이가 num 인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = sc.nextInt();
        }

        System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
    }
}


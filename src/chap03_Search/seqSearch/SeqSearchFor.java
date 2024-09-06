package chap03_Search.seqSearch;

import java.util.Scanner;

public class SeqSearchFor {

    static int seqSearch(int[] a , int n, int key) {
        for (int i = 0; i < n; i++)
            if (a[i] == key)
                return i;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num + 1];     //요솟수가 num + 1인 배열

        for (int i = 0; i < num; i++) {

            x[i] = sc.nextInt();
        }
        System.out.print("검색 값: ");
        int key = sc.nextInt();

        int idx = seqSearch(x, num, key);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
          else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}

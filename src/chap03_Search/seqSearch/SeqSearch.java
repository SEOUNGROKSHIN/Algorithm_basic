package chap03_Search.seqSearch;

import java.util.Scanner;

public class SeqSearch {
    // 길이가 n인 배열 a에서 key과 값이 같은 요소를 순차 검색
    static int seqSearch(int[] a, int n, int key) {
        int i = 0;

        while (true) {
            if (i == n)
                return -1;
            if (a[i] == key)
                return i;   // 검색 성공시 인덱스를 반환
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];     // 요솟수(배열의 길이)가 num인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색할 값: ");
        int key = sc.nextInt();

        int idx = seqSearch(x, num, key);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}

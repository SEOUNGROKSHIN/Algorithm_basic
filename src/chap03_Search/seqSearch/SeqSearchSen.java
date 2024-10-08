package chap03_Search.seqSearch;

import java.util.Scanner;

// 선형 검색(보초법)
public class SeqSearchSen {

    static int seqSearchSen(int[] a, int n, int key) {
        int i = 0;

        a[n] = key;         // 보초를 추가           //1

        while (true) {
            if (a[i] == key)
                break;
            i++;
        }
        return i == n ? -1 : i; // 3
    }

    static int seqSearchSenFor(int[] a, int n, int key) {

        int i;

        a[n] = key;

        for (i = 0; a[i] != key; i++);

        return i == n ? -1 : i;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num + 1];     //요솟수가 num + 1인 배열

        for (int i = 0; i < num; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextInt();
        }

        System.out.print("검색 값: ");
        int key = sc.nextInt();

//        int idx = seqSearchSen(x, num, key);
        int idx = seqSearchSenFor(x, num, key);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}

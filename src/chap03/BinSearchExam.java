package chap03;

import java.util.Arrays;

public class BinSearchExam {

    static int searchIdx(int[] a, int n, int key) {

        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2;

            if (a[pc] == key)
                return pc;
            else if (a[pc] < key)
                pl = pc + 1;
            else
                pr = pc - 1;

        } while (pl <= pr);

        return -1;              // 검색 실패
    }

    static int binSearchEx(int[] a, int n, int key) {

        int pl = 0;
        int pr = n -1;

        do {
            int pc = (pl + pr) / 2;

            if (a[pc] == key)
                return pc;

            else if (a[pc] < key)
                pl = pc +1;

            else
                pr = pc - 1;

        } while (pl <= pr);

        return -1;
    }


    public static void main(String[] args) {

        int[] x = {1, 9, 2, 9, 4, 6, 7, 9};
        int[] a = {1, 3, 5, 7, 7, 7, 7, 8, 8, 9, 9};
        int key = a[3];
        int n = a.length;

//        int idx = searchIdx(x, n, key);

        int idx = binSearchEx(a, n, key);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}

package chap03_Search.binarySearch;

import java.util.Scanner;

public class BinSearch {
    // 요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색

    static int binSearch(int[] a, int n, int key) {
        int pl = 0;                 // 검색 범위의 첫 인덱스
        int pr = n - 1;             // 검색 범위의 끝 인덱스
        
        do {
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스

            if (a[pc] == key)
                return pc;
            else if (a[pc] < key)
                pl = pc + 1;        // 검색 범위를 뒤쪽 절반으로 좁힘
            else
                pr = pc - 1;        // 검색 범위를 앞쪽 절반으로 좁힘
        } while (pl <= pr);

            return -1;              // 검색 실패
    }

    static int binSearchFor(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;
        int pc = (pl + pr) / 2;

        if (a[pc] == key)
            return pc;
        else if (a[pc] < key)
            pl = pc + 1;
        else
            pr = pc - 1;

        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("요솟수: ");
        int num = sc.nextInt();
        int[] x = new int[num];     // 요솟수가 num인 배열

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0]: "); // 첫 요소 입력받음
        x[0] = sc.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "]: ");
                x[i] = sc.nextInt();
            } while (x[i] < x[i - 1]);   // 바로 앞의 요소보다 작으면 다시 입력받음
        }

        System.out.println("검색할 값: ");
        int key = sc.nextInt();

        int idx = binSearchFor(x, num, key);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}

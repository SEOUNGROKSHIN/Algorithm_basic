package chap03_Search.binarySearch;

public class BinSearchExam {

    static int searchIdx(int[] a, int n, int key) {

        int pl = 0;             // 시작
        int pr = n - 1;         // 끝

        for (int i = 0; i < a.length; i++);

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

    //--- 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 요소를 이진검색 ---//
    static int binSearchX(int[] a, int n, int key) {
        int pl = 0;			// 검색 범위 맨앞의 인덱스
        int pr = n - 1;		// 맨끝의 인덱스

        do {
            int   pc = (pl + pr) / 2;	// 중앙요소의 인덱스

            if (a[pc] == key) {
                for ( ; pc > pl; pc--)	// key와 같은 맨앞의 요소를 검색합니다
                    if (a[pc - 1] < key)
                        break;
                return pc;							// 검색 성공

            } else if (a[pc] < key)
                pl = pc + 1;						// 검색 범위를 앞쪽 절반으로 좁힘
            else
                pr = pc - 1;						// 검색 범위를 뒤쪽 절반으로 좁힘
        } while (pl <= pr);

        return -1;									// 검색 실패
    }


    public static void main(String[] args) {

        int[] x = {1, 9, 2, 9, 4, 6, 7, 9};
        int[] a = {1, 3, 5, 7, 7, 7, 7, 8, 8, 9, 9};
        int n = a.length;

        int key = 7;


        int idx = searchIdx(x, n, key);

//        int idx = binSearchX(a, n, key);

        if (idx == -1)
            System.out.println("그 값의 요소가 없습니다.");
        else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");
    }
}

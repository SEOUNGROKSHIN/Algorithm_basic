package chap05_Recur;


import java.util.Scanner;

// 재귀 함수를 메모화로 구현
// 메모화 기법을 통한 반복 계약을 수행안함 1회만 수행
public class RecurMemo {
    static String[] memo;

    // 메모화를 도입한 recur 메서드
    static void recur(int n) {
        if (memo[n + 1] != null)
            System.out.print(memo[n + 1]);      // 메모를 출력
        else {
            if (n > 0) {
                recur(n - 1);
                System.out.println(n);
                recur(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];     // 메모화
            } else {
                memo[n + 1] = "";       // 메모화: recur(0)과 recur(-1)은 빈 문자열
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요. ");
        int x = sc.nextInt();

        memo = new String[x + 2];
        recur(x);
    }
}

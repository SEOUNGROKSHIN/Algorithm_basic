package chap05_Recur;

import java.util.Scanner;

public class Hanoi {
    // no개의 원반을 x번 기둥에서 y번 기둥으로 옮김
    // no :원반 갯수, x:시작 기둥, y:목표 기둥
    // 중간기둥: 6(기둥의 합) - x - y, 기둥의 합이 6

    static void move(int no, int x, int y) {
        if (no > 1)
            move(no - 1, x, 6 - x - y);

        System.out.printf("원반[%d]를 %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);

        if (no > 1)
            move(no - 1, 6 - x - y, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("하노이의 탑");
        System.out.print("원반의 개수: ");
        int n = sc.nextInt();
        move(n, 1, 3);
//        moveString(n, 1, 3); // 1번 기둥에 쌓인 n개의 원반을 3번 기둥으로 옮김
    }

    private static void moveString(int no, int x, int y) {
        int m = 6 - x - y;

        if (no > 1)
            moveString(no - 1, x, m);

        System.out.printf("원반[%d]를 %c번 기둥에서 %c번 기둥으로 옮김\n", no, (char)(x + 'A' - 1), (char)(y + 'A' - 1));

        if (no > 1)
            moveString(no - 1, m , y);
    }
}

package chap04.queue;

import java.util.Scanner;

public class RingbufferTester {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RingbufferIntQueue rq = new RingbufferIntQueue(64);

        while(true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", rq.size(), rq.getCapacity());
            System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (5) 검색 (0) 종료: ");

            int menu = sc.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1:                 // 인큐
                    System.out.print("데이터: ");
                    x = sc.nextInt();
                    try {
                        rq.enque(x);
                    } catch (RingbufferIntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        x = rq.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다.");
                    } catch (RingbufferIntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 3:             // 피크
                    try {
                        x = rq.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (RingbufferIntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 4:             // 덤프
                    rq.dump();
                    break;
                case 5:             // 검색
                    try {
                        System.out.println("찾고자 하는 데이터를 입력하세요");
                        x = sc.nextInt();
                        rq.search(x);
                    } catch (RingbufferIntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
            }
        }
    }
}

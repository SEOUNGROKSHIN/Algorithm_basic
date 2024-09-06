package chap04_Que_Stack.queue;

import java.util.Scanner;

public class IntQueueTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RingbufferIntQueue s = new RingbufferIntQueue(64);

        while(true) {
            System.out.println();
            System.out.printf("현재 데이터 개수: %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 인큐 (2) 디큐 (3) 피크 (4) 덤프 (5) search (0) 종료: ");

            int menu = sc.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1:                 // 인큐
                    System.out.print("데이터: ");
                    x = sc.nextInt();
                    try {
                        s.enque(x);
                    } catch (RingbufferIntQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }
                    break;

                case 2:
                    try {
                        x = s.deque();
                        System.out.println("디큐한 데이터는 " + x + "입니다.");
                    } catch (RingbufferIntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;

                case 3:             // 피크
                    try {
                        x = s.peek();
                        System.out.println("피크한 데이터는 " + x + "입니다.");
                    } catch (RingbufferIntQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }
                    break;
                case 4:             // 덤프
                    s.dump();
                    break;
                case 5:
                    try {
                        System.out.println("찾고자 하는 데이터를 입력하세요");
                        x = sc.nextInt();
                        s.search(x);
                    } catch (RingbufferIntQueue.EmptyIntQueueException e) {
                        System.out.println("데이터가 없습니다.");
                    }
                    break;
            }
        }
    }
}

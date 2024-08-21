package chap04.stack;

import java.util.Scanner;

public class IntStackTester {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        IntStack s = new IntStack(64);

        while (true) {
            System.out.println();               // 메뉴 구분을 위한 빈 행 추가
            System.out.printf("현재 데이터 개수 : %d / %d\n", s.size(), s.getCapacity());
            System.out.print("(1) 푸시  (2) 팝  (3) 피크  (4) 덤프 (5) 클리어 (6) indexOf (7) 용량 확인  (0) 종료: ");

            int menu = sc.nextInt();
            if (menu == 0) break;

            int x;

            switch (menu) {
                case 1:                         // 푸시
                    System.out.print("데이터: ");
                    x = sc.nextInt();
                  try {
                      s.push(x);
                  } catch (IntStack.OverflowIntStackException e) {
                      System.out.println("스택이 가득 찼습니다.");
                  }
                  break;

                case 2:                         // 팝
                 try {
                     x = s.pop();
                     System.out.println("팝한 데이터는 " + x + "입니다.");
                 } catch (IntStack.EmptyIntStackException e) {
                     System.out.println("스택이 비어 있습니다.");
                 }
                 break;

                 case 3:                        // 피크
                   try {
                       x = s.peek();
                       System.out.println("피크한 데이터는 " + x + "입니다.");
                   } catch (IntStack.EmptyIntStackException e) {
                       System.out.println("스택이 비어 있습니다.");
                   }
                   break;

                 case 4:                        // 덤프
                   s.dump();
                   break;

                case 5:                         // 스택 클리어
                    s.clear();
                    System.out.println("스택을 비웠습니다.");
                    break;

                case 6:                        // indexOf (데이터 찾기)
                    System.out.print("찾고자 하는 배열을 입력하세요: ");
                    x = sc.nextInt();
                    s.indexOf(x);
                    System.out.println("찾는 배열은 x[" + x + "]에 있습니다.");
                case 7:                        // 스택 용량 확인
                    System.out.print("용량 확인");
                    s.getCapacity();
            }
        }
    }
}

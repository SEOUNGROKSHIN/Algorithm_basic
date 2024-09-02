package chap05;

import chap04.stack.IntStack;
import chap04.stack.IntStackTester;

public class RecurX2 {

    static void recur(int n) {

        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);
                n = n - 1;
                continue;
            }

            if (!s.isEmpty()) {                 // 스택이 비어 있지 않으면
                n = s.pop();                    // 저장하고 있던 스택값을 팝
                System.out.println(n);
                n = n - 2;
                continue;
            }
            break;
        }
    }
}

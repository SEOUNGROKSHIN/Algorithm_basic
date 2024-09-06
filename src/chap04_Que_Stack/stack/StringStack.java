package chap04_Que_Stack.stack;

public class StringStack {

    String[] stk;
    int capacity;
    int ptr;

    // 실행 시 예외: 스택이 비어 있음
    public class EmptyStringStackException extends RuntimeException {
        public EmptyStringStackException() { }
    }

    // 실행 시 예외 스택이 가득 참
    public class OverflowStringStackException extends RuntimeException{
        public OverflowStringStackException() { }
    }

    // 생성자
    public StringStack(int maxlen) {

        ptr = 0;
        capacity = maxlen;

        try {
            stk = new String[capacity];    // 스택 본체용 배열을 생성
        } catch (OutOfMemoryError e) {     // 생성할 수 없음
            capacity = 0;
      }
    }

    public String push(String x) {
            if (ptr >= capacity)
                throw new OverflowStringStackException();
            return stk[ptr++] = x;
    }

    public String pop() {
        if (ptr < 0)
            throw new EmptyStringStackException();
        return stk[--ptr];
    }
  }

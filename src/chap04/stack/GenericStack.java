package chap04.stack;

import java.util.EmptyStackException;

public class GenericStack<E> {
    private E[] stk;
    private int capacity;
    private int ptr;

    //--- 실행 시 예외 : 스택이 비어 있음 ---//
    public static class EmptyGstackException extends RuntimeException {
        public EmptyGstackException() { }
    }

    //--- 실행 시 예외 : 스택이 가득 참 ---//
    public static class OverflowGstackException extends RuntimeException {
        public OverflowGstackException() { }
    }

    GenericStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;
        try {
            stk = (E[]) new Object[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public E push(E obj) throws OverflowGstackException {
        if (ptr >= capacity)
            throw new OverflowGstackException();
        return stk[ptr++] = obj;
    }

    public E pop() throws EmptyGstackException {
        if (ptr <= 0)
            throw new EmptyGstackException();
        return stk[--ptr];
    }

    public E peek() throws EmptyStackException {
        if (ptr <= 0)
            throw new EmptyGstackException();
        return stk[ptr - 1];
    }

    public void claer() {
        ptr = 0;
    }

    public int size() {
        return ptr;
    }

    public boolean isEmpty() {
        return ptr == 0;
    }

    public boolean isFull() {
        return ptr >= capacity;
    }

    public int indexOf(E obj) {
        for (int i = ptr - 1; i >= 0; i--)
            if (stk[i].equals(obj))
                return i;
        return -1;
    }

    //--- 스택 용량을 반환합니다 ---//
    public int getCapacity() {
        return capacity;
    }

    //--- 스택 안의 모든 데이터를 바닥 → 꼭대기의 순서로 출력 ---//
    public void dump() {
        if (ptr <= 0)
            System.out.println("스택이 비어 있습니다.");
        else {
            for (int i = 0; i < ptr; i++)
                System.out.print(stk[i] + " ");
            System.out.println();
        }
    }
}

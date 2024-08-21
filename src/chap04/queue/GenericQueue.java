package chap04.queue;

public class GenericQueue<E> {

    private E[] que;
    private int capacity;
    private int num;
    private int front;
    private int rear;

    //--- 실행 시 예외 : 스택이 비어 있음 ---//
    public static class EmptyGQueException extends RuntimeException {
        public EmptyGQueException() { }
    }

    //--- 실행 시 예외 : 스택이 가득 참 ---//
    public static class OverflowGQueException extends RuntimeException {
        public OverflowGQueException() { }
    }

    // 생성자
    public GenericQueue(int maxlen) {
            num = front = rear = 0;
            capacity = maxlen;
            try {
                que = (E[]) new Object[capacity];
            } catch (OutOfMemoryError e) {
                capacity = 0;
            }
        }
    // 큐에 데이터를 인큐
    public E enque(Object obj) throws IntQueue.OverflowIntQueueException {
        if (num >= capacity)
            throw new GenericQueue.OverflowGQueException();  // 큐가 가득 참
        que[rear++] = (E) obj;
        num++;
        if (rear == capacity)
            rear = 0;
        return (E) obj;
    }

    // 큐에 데이터를 디큐
    public E deque() throws IntQueue.EmptyIntQueueException {
        if (num <= 0)
            throw new GenericQueue.EmptyGQueException();
        E obj = que[front++];
        num--;
        if (front == capacity)
            front = 0;
        return obj;
    }

    // 큐에서 데이터를 피크(프런트 데이터를 들여다봄)
    public E peek() throws IntQueue.EmptyIntQueueException {
        if (num <= 0)
            throw new GenericQueue.EmptyGQueException();
        return que[front];
    }

    // 큐를 비움
    public void clear() {
        num = front = rear = 0;
    }

    // 큐에서 x를 검색하여 인덱스(찾지 못하면 -1)를 반환
    public int indextOf(Object obj) {
        for (int i = 0; i < num; i++) {
            int idx = (i + front) % capacity;
            if (que[idx] == obj)
                return idx;
        }
        return -1;
    }

    // 큐의 용량을 반환
    public int getCapacity() {
        return capacity;
    }

    // 큐에 쌓여 있는 데이터 개수를 반환
    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    // 큐 안의 모든 데이터를 프런트 -> 리어 순서로 출력
    public void dump() {
        if (num <= 0)
            System.out.println("큐가 비어있습니다.");
        else {
            for (int i = 0; i < num; i++)
                System.out.print(que[(i + front) % capacity] + " ");
            System.out.println();
        }
    }

    public int search(Object x) throws IntQueue.EmptyIntQueueException {
        for (int i = 0; i < num; i++) {
            if (que[(i + front) % capacity]  == x)
                return i + i;
        }
        return 0;
    }
}
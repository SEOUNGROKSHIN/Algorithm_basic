package chap04_Que_Stack.stack;

public class TwoStack {
    private int arr[];
    private int stkA[];
    private int stkB[];
    private int capacity;
    private int ptr;

    public TwoStack(int maxlen) {
        ptr = 0;
        capacity = maxlen;

        arr = new int[capacity];
        stkA = new int[capacity];
        stkB = new int[capacity];
    }
}

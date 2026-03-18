package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int INT = -1;
    public static final int INT1 = 11;
    private int[] numbers = new int[12];

    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == INT;
    }

    public boolean isFull() {
        return total == INT1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}

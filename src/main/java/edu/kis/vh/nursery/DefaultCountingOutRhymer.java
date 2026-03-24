package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int MAX_SIZE = 12;
    public static final int EMPTY_RHYMER_INDICATOR = -1;
    public static final int DEFAUL_VALUE = -1;
    private int[] numbers = new int[MAX_SIZE];

    public int getTotal() {
        return total;
    }

    private int total = EMPTY_RHYMER_INDICATOR;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    public boolean isFull() {
        return total == MAX_SIZE - 1;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAUL_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAUL_VALUE;
        return numbers[total--];
    }

}

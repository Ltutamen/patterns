package ua.axiom.behavioral.iterator;

public class IterableArray implements Iterable<Integer> {
    private Integer[] array;
    private int pointer;

    public IterableArray(int size) {
        this.array = new Integer[size];
        this.pointer = 0;
    }

    @Override
    public Iterable<Integer> next() {
        if(!hasNext()) {
            throw new IndexOutOfBoundsException();
        }
        pointer++;
        return this;
    }

    @Override
    public boolean hasNext() {
        return pointer < array.length - 1;
    }

    @Override
    public Integer get() {
        return array[pointer];
    }
}

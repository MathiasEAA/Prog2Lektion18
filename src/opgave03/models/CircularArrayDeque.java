package opgave03.models;

import java.util.Arrays;

public class CircularArrayDeque<E> implements Deque<E>{

    private E[] elements;
    private int size = 0;
    private int head = 0;
    private int tail = 0;

    public CircularArrayDeque(int size) {
        elements = (E[])new Object[size];

    }

    public void moveHeadLeft() {
        head = (elements.length + head - 1) % elements.length;
    }

    public void moveHeadRight() {
        head = (elements.length + head + 1) % elements.length;
    }


    public void moveTailRight() {
        tail = (tail + 1) % elements.length;
    }

    public void moveTailLeft() {
        tail = (tail - 1) % elements.length;
    }

    public int getHead() {
        return head;
    }

    public int getTail() {
        return tail;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void addFirst(E newElement) {
        if (isEmpty()) {
            moveTailRight();
        } else if (elements[head] != null) {
            enlargeArray();
        }
        elements[head] = newElement;
        moveHeadLeft();
        size++;

    }


    @Override
    public void addLast(E newElement) {
        if (isEmpty()) {
            moveHeadLeft();
        } else if (elements[tail] != null) {
            enlargeArray();
        }
        elements[tail] = newElement;
        moveTailRight();
        size++;

    }

    @Override
    public E removeFirst() {
        moveHeadRight();
        E item = elements[head];
        elements[head] = null;
        size--;
        return item;
    }

    @Override
    public E removeLast() {
        moveTailLeft();
        E item = elements[tail];
        elements[tail] = null;
        size--;
        return item;
    }

    @Override
    public E getFirst() {
        return elements[head];
    }

    @Override
    public E getLast() {
        return elements[tail];
    }

    @Override
    public int size() {
        return size;
    }

    void enlargeArray() {
        moveTailLeft();
        moveHeadRight();
        int newSize = elements.length * 2;
        int moveCounter = 0;
        int newHead = newSize - (elements.length - head);
        E[] newDeque = (E[])new Object[newSize];
        while (newHead != tail + 1) {
            if (newHead == newSize) {
                newHead = 0;
            }
            newDeque[newHead] = elements[head];
            newHead++;
            moveHeadRight();
            moveCounter++;
        }
        elements = newDeque;
        for (int i = 0; i <= moveCounter; i++) {
            moveHeadLeft();
        }
        moveTailRight();

    }

    @Override
    public String toString() {
        return Arrays.toString(elements) + " Head: " + head + " Tail: " + tail;
    }
}

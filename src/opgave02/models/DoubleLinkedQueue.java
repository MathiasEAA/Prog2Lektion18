package opgave02.models;

import opgave01.models.Node;
import opgave01.models.Queue;

import java.util.NoSuchElementException;

public class DoubleLinkedQueue<E> implements Queue<E> {


    private DoubleLinkedNode<E> head = null;
    private DoubleLinkedNode<E> tail = null;
    private int size = 0;


    @Override
    public void add(E element) {
        DoubleLinkedNode<E> newNode = new DoubleLinkedNode<>(element);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
            size++;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
            tail = newNode;
            size++;
        }
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            DoubleLinkedNode<E> node = head;
            head = head.getNext();
            size--;
            return node.getItem();
        }
    }

    @Override
    public E element() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        } else {
            return head.getItem();
        }
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    public DoubleLinkedNode<E> getHead() {
        return head;
    }

    public DoubleLinkedNode<E> getTail() {
        return tail;
    }
}

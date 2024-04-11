package opgave01.models;

public class LinkedNodeQueue<E> implements Queue<E> {


    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    @Override
    public void add(E element) {
        Node<E> newNode = new Node<>(element);
        if (isEmpty()) {
            tail = newNode;
            head = newNode;
            size++;
        } else {
            tail.setNext(newNode);
            tail = newNode;
            size++;
        }
    }

    @Override
    public E remove() {
        Node<E> node = head;
        head = head.getNext();
        size--;
        return node.getItem();
    }

    @Override
    public E element() {
        return head.getItem();
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void clear() {
        tail = null;
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    public Node<E> getHead() {
        return head;
    }

    public Node<E> getTail() {
        return tail;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> current = head;
        while (current != null) {
            sb.append(current.getItem() + ", ");
            current = current.getNext();
        }
        return "LinkedNodeQueue{ " + sb + "}";
    }
}

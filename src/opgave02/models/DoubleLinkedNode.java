package opgave02.models;

public class DoubleLinkedNode<E> {

    private E item;
    private DoubleLinkedNode<E> previous, next;

    public DoubleLinkedNode(E item) {
        this.item = item;
        previous = null;
        next = null;
    }


    public E getItem() {
        return item;
    }


    public DoubleLinkedNode<E> getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleLinkedNode<E> previous) {
        this.previous = previous;
    }

    public DoubleLinkedNode<E> getNext() {
        return next;
    }

    public void setNext(DoubleLinkedNode<E> next) {
        this.next = next;
    }
}

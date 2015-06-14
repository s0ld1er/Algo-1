import java.util.NoSuchElementException;

public class MyLinkedList implements LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    private class Node {
        @SuppressWarnings("unused")
        Node previous;
        Node next;
        Object currentElement;

        public Node(Object currentElement, Node next, Node prev) {
            this.currentElement = currentElement;
            this.next = next;
            this.previous = prev;
        }
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public int size() {
        return this.size;
    }

    // add(Object element) == addFirst(Object element)
    @Override
    public void add(Object element) {
        Node helpNode = new Node(element, null, tail);
        if (tail != null) {
            tail.next = helpNode;
        }
        tail = helpNode;
        if (head == null) {
            head = helpNode;
        }
        size++;
    }

    // remove() == removeFirst()
    @Override
    public Object remove() {
        if (size == 0)
            throw new NoSuchElementException();
        Object newFirst = head.currentElement;
        Node newHead = head.next;
        head.next = null;
        head = newHead;
        head.previous = null;
        size--;
        return newFirst;
    }

    @Override
    public Object get(int elementIndex) {
        if (elementIndex < 0 || elementIndex >= size())
            throw new IndexOutOfBoundsException();
        Node lookedFor = head;
        for (int i = 0; i < elementIndex; i++)
            lookedFor = lookedFor.next;
        return lookedFor.currentElement;

    }

    @SuppressWarnings("unused")
    @Override
    public void clear() {
        while (size >= 0 && head.next != null) {
            Node newFirst = head;
            head = head.next;
            head.previous = null;
            size--;
        }
        head.next = null;
        head.currentElement = null;
        size--;
    }

    @Override
    public Object getFirst() {
        return head.currentElement;
    }

    @Override
    public Object getLast() {
        return tail.currentElement;

    }

}

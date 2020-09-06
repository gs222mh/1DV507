package GS222MH_assign2.EX5;

import java.util.Iterator;

public class LinkedQueue<T> implements Queue<T> {

    protected int size = 0;
    protected Node head = null;
    protected Node tail = null;

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (head == null && tail == null) {
            return true;
        }
        return false;
    }

    @Override
    public void enqueue(T element) {
        if (head == null) {
            head = new Node(element);
            tail = head;
        } else {
            tail.next = new Node(element);
            tail = tail.next;
        }
        size++;
    }

    @Override
    public T dequeue() throws IllegalAccessException {
        if (size == 0) {
            throw new IllegalAccessException();
        } else {
            StringBuilder result = new StringBuilder();
            Node<T> current = head;
            result.append(current.element);
            current = current.next;
            Node<T> temp = head;
            head = head.next;
            size--;
            if (head == null) tail = null;
            return (T) result;
        }
    }

    @Override
    public T first() {
        return (T) head.element;
    }

    @Override
    public T last() {
        return (T) tail.element;
    }

    @Override
    public Iterator iterator() {
        return new ListIterator();
    }

    class ListIterator implements Iterator<T> {
        private Node node = head;

        public T next() {
            int val = node.value;
            node = node.next;
            return (T) node;
        }

        public boolean hasNext() {
            return node != null;
        }

        public void remove() {
            throw new RuntimeException("remove() is not implemented");
        }
    }

    public class Node<T> {
        int value;
        T element;
        Node<T> next = null;

        public Node(T e) {
            element = e;
        }
    }

    private class E {
    }
}

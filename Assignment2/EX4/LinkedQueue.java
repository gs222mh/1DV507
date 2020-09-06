package GS222MH_assign2.EX4;

/*
 * LinkedQueue.java
 * Date: 31 jan 2020
 * Author: Ghayth Sabeaallil
 */

import java.util.Iterator;


public class LinkedQueue implements IntQueue {
    /**
     * Number of element
     */
    protected int size = 0;

    /**
     * First element in the Queue.
     */
    protected Node head = null;

    /**
     * Last element in the Queue.
     */
    protected Node tail = null;

    /* Public interface */

    /**
     * Get the size of Queue (number of element).
     *
     * @return the current size of the Queue
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Check if the Queue is empty or NOT (null).
     *
     * @return true or false, depends on list.
     */

    @Override
    public boolean isEmpty() {
        if (head == null && tail == null) {
            return true;
        }
        return false;
    }

    /**
     * Appends integer <code>element</code> add to the end of the Queue. If the Queue is empty (null), it creates a new node.
     *
     * @param element integer to put it in Node (List)
     */
    @Override
    public void enqueue(int element) {
        if (head == null) {
            head = new Node(element);
            tail = head;
        } else {
            tail.next = new Node(element);
            tail = tail.next;
        }
        size++;
    }

    /**
     * Return and remove the first element of the Queue.
     *
     * @return Return and remove the first element.
     */
    @Override
    public int dequeue() throws IllegalAccessException {
        if (size == 0) {
            throw new IllegalAccessException();
        } else {
            StringBuilder result = new StringBuilder();
            Node<E> current = head;
            result.append(current.element);
            current = current.next;
            Node<E> temp = head;
            head = head.next;
            size--;
            if (head == null) tail = null;
            return Integer.parseInt(result.toString());
        }
    }

    /**
     * Get the first element of the Queue without removing.
     *
     * @return The first element of the Queue.
     */
    @Override
    public int first() {
        return (int) head.element;
    }

    /**
     * Get the last element of the Queue without removing.
     *
     * @return The last element of the Queue.
     */
    @Override
    public int last() {
        return (int) tail.element;
    }

    /**
     * iterates all elements in Queue
     *
     * @return new ListIterator()
     */
    @Override
    public Iterator<Integer> iterator() {
        return new ListIterator();
    }

    class ListIterator implements Iterator<Integer> {
        private Node node = head;

        public Integer next() {
            int val = node.value;
            node = node.next;
            return val;
        }

        public boolean hasNext() {
            return node != null;
        }

        public void remove() {
            throw new RuntimeException("remove() is not implemented");
        }
    }

    /**
     * Returns a string of the Queue. It returns a String representation of the queue content.
     *
     * @return all element (head, element and tail)
     */
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
            current = current.next;
            if (current != null) {
                result.append(", ");
            } else {
                result.append("]");
            }
        }
        return result.toString();
    }

    class Node<E> {
        int value;
        E element;
        Node<E> next = null;

        public Node(E e) {
            element = e;
        }
    }

    private class E {
    }
}

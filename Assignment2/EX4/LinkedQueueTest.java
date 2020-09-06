package GS222MH_assign2.EX4;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class LinkedQueueTest {
    LinkedQueue queue = new LinkedQueue();

    //first size is 0
    //push two elements, the size is 2
    @Test
    void sizeTest() {
        assertEquals(0, queue.size);
        queue.enqueue(3);
        queue.enqueue(3);
        assertEquals(2, queue.size);
    }

    //is empty (true)
    //push two elements, is empty (false)
    @Test
    void isEmptyTest() {
        assertTrue(queue.isEmpty());
        queue.enqueue(3);
        queue.enqueue(3);
        assertFalse(queue.isEmpty());

    }

    //first size is 0
    //push an element, the size is 1
    @Test
    void enqueueTest() {
        assertEquals(0, queue.size);
        queue.enqueue(3);
        assertEquals(1, queue.size);
    }

    //first size is 0
    //push an element, the size is 1
    // queue.dequeue(), the size is 0
    @Test
    void dequeueTest() {
        assertEquals(0, queue.size);
        queue.enqueue(3);
        assertEquals(1, queue.size);
        try {
            queue.dequeue();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        assertEquals(0, queue.size);
    }

    //first size is 0
    //push three elements
    //the first element is 4
    @Test
    void firstTest() {
        assertEquals(0, queue.size);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(7);
        assertEquals(4, queue.head.element);
    }

    //first size is 0
    //push three elements
    //the last element is 7
    @Test
    void lastTest() {
        assertEquals(0, queue.size);
        queue.enqueue(1);
        queue.enqueue(5);
        queue.enqueue(7);
        assertEquals(7, queue.tail.element);
    }

    //first size is 0
    //push four elements
    //the next of the next of the head is the third element, which is 7
    @Test
    void nextTest() {
        assertEquals(0, queue.size);
        queue.enqueue(1);
        queue.enqueue(5);
        queue.enqueue(7);
        queue.enqueue(9);
        assertEquals(7, queue.head.next.next.element);
    }

    //assume flase (iterator has not next)
    //push two elements
    //assume true (iterator has next)
    @Test
    void hasNextTest() {
        assertFalse(queue.iterator().hasNext());
        queue.enqueue(3);
        queue.enqueue(3);
        assertTrue(queue.iterator().hasNext());
    }

    //assume RuntimeException
    @Test
    void removeTest() {
        assertThrows(RuntimeException.class, () -> queue.iterator().remove(), "remove() is not implemented");
    }
}
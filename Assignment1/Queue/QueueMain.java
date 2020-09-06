package GS222MH_assign1.Queue;


/**
 * QueueMain.java
 * Date: 31 jan 2020
 * Author: Ghayth Sabeaallil
 */


/*
 * Main class that sends info to LinkedQueue to test
 * all methods (first, last, dequeue, enqueue ..)
 */


public class QueueMain {
    public static void main(String[] args) throws IllegalAccessException {
        IntQueue lQ = new LinkedQueue();

        lQ.enqueue(1);
        lQ.enqueue(2);
        lQ.enqueue(3);
        lQ.enqueue(4);
        lQ.enqueue(5);
        lQ.enqueue(6);
        lQ.enqueue(7);

        System.out.println("Node Array: " + lQ.toString());
        System.out.println("Empty: " + lQ.isEmpty());
        System.out.println("Size: " + lQ.size());
        System.out.println("Return and remove the first element: " + lQ.dequeue());
        System.out.println("Node Array remove first element: " + lQ.toString());
        System.out.println("Return and remove the first element: " + lQ.dequeue());
        System.out.println("Node Array remove first element: " + lQ.toString());
        System.out.println("First: " + lQ.first());
        System.out.println("Last: " + lQ.last());


    }
}

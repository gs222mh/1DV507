package GS222MH_assign1.ArrayQueue;


public class ArrayMain {
    public static void main(String[] args) {

        //push element to the array
        IntQueue a = new ArrayQueue();
        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(3);
        a.enqueue(4);
        a.enqueue(5);
        a.enqueue(6);

        //add zero to the left of array (I tried to get it empty)
        a.dequeue();
        a.dequeue();
        a.dequeue();



        System.out.println(a.toString());
        System.out.println("First element is on pos: " + a.first());
        System.out.println("Last element is on pos: " + a.last());
        System.out.println();

    }
}

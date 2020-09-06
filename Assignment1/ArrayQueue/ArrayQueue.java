package GS222MH_assign1.ArrayQueue;


import java.util.Arrays;
import java.util.Iterator;

public class ArrayQueue implements IntQueue {
    protected int size = 0;
    protected int first = 0;
    protected int firstCir = 0;
    protected int[] arr = new int[1];
    protected int[] temp;
    protected int last = 0;



    public ArrayQueue() { }


    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }


    //add element to array, if size is smaller than array.length send it to resize
    @Override
    public void enqueue(int element) {
        if (size < arr.length) {
            arr[size] = element;
            size++;
        } else if (size == arr.length) {
            resize();
            arr[size] = element;
            size++;
        }
    }

    private void resize() {
        temp = new int[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    /*add zeros and return the first element from enqueue.
    When the first is equal to the last set first = 0
    and create a new array with just the element of enqueue.
     */
    @Override
    public int dequeue() {
        int res = arr[first];
        if (first < 0) {
            temp = new int[arr.length + 1];
            temp[first] = 0;
            for (int i = 1; i < temp.length; i++) {
                temp[i] = arr[i - 1];
            }
            arr = temp;
        } else {
            temp = new int[arr.length];
            temp[firstCir] = arr[arr.length - 1];
            for (int i = 1; i < arr.length; i++) {
                temp[i] = arr[i - 1];
            }
            arr = temp;
        }
        if (first() == last()) {
            first = -1;
            temp = new int[arr.length - 0];
            for (int i = 0; i < size; i++) {
                temp[i] = arr[i];
            }
            //Here I tried to send it to resize() but it became double size with zeros.
            //resize();
            arr = temp;
        }
        last++;
        first++;
        return res;
    }


    @Override
    public int first() {
        return first;
    }

    @Override
    public int last() {

        return arr.length - 1;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public String toString() {
        return "arr=" + Arrays.toString(arr);
    }
}

package GS222MH_assign1.Stack;

import java.lang.*;
import java.util.Arrays;

public class StackClass implements StringStack {
    private int size = 0;
    private int remove = 1;
    private String[] arr = new String[3];
    private String[] temp;
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String RESET = "\033[0m";  // Text Reset


    public StackClass() {
    }

    //if arr.length == 0 ===> the array is empty.
    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    /*The StackMain sends element, if array's position (size) smaller than the length (which is we send it
    before from StackMain), put the element in pos. Else send the array to another method to resize it (make the length bigger).
    After that push all elements to the new array.
    */
    @Override
    public void push(String element) {
        if (size < arr.length) {
            arr[size] = element;
            size++;
        } else if (size == arr.length) {
            resize();
            arr[size] = element;
            size++;
        }
    }

    //Resize the array by double it (2 times bigger than the first size).
    private void resize() {
        temp = new String[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
    }

    @Override
    public int size() {
        if (temp == null) {
            return arr.length;
        } else {
            return temp.length;
        }
    }


    @Override
    public String pop() throws IllegalAccessException {
        remove = 1;
        if (size == 0) {
            throw new IllegalAccessException(BLUE + "ERROR EXCEPTION (IS EMPTY)" + RESET);
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == null){
                    remove++;
                }
            }
            String result = arr[arr.length - remove];
            arr[arr.length - remove] = null;
            return result;
        }

    }

    @Override
    public String peek() throws IndexOutOfBoundsException {
        remove = 1;
        if (size == 0) {
            throw new IndexOutOfBoundsException(BLUE + "ERROR EXCEPTION (IS EMPTY)" + RESET);
        }
        //[1, 2, 3, 4, Null, Null, Null, Null]
        // count how many null are there (4)
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null){
                remove++;
            }
        }
        return arr[arr.length - remove];

    }


    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

}

package GS222MH_assign1.Collection;

import java.util.Arrays;

public class ArrayIntStack extends AbstractIntCollection implements IntStack {
    private int[] temp;

    //push element from mainMethod
    @Override
    public void push(int n) {
        checkIndex(5, 6);
        if (size < values.length) {
            values[size] = n;
            size++;
        } else if (size == values.length) {
            resize();
            values[size] = n;
            size++;
        }
    }

    //get the last element and send all array to remove()
    @Override
    public int pop() throws IndexOutOfBoundsException {
        int pop = values[values.length - 1];
        remove();
        return pop;
    }

    /*
    Create new array and copy all element from the old array to the new.
    set the old array is equal to the new one.
     */
    private void remove() {
        temp = new int[values.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = values[i];
        }
        values = temp;
    }


    //get the last element after all.
    @Override
    public int peek() throws IndexOutOfBoundsException {
        int peek = values[values.length - 1];
        return peek;
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }


}

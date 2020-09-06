package GS222MH_assign1.Collection;

import java.util.Arrays;
import java.lang.Iterable;

public class ArrayIntList extends AbstractIntCollection implements IntList {
    private int[] temp;

    //add element on pos size.
    @Override
    public void add(int n) {
        values[size] = n;
        size++;
        if (size == values.length) {
            resize();
        }
    }

    /*
    Create a new array. Copy elements from the old array and put them in the new one.
    when the pos is equal to the index which is send it from tha mainMethod, put the element.
    After that just cont copy ...
     */
    @Override
    public void addAt(int n, int index) throws IndexOutOfBoundsException {
        checkIndex(index, size);
        index++;
        temp = new int[values.length + 1];
        for (int i = 0; i < temp.length; i++) {
            if (i < index - 1)
                temp[i] = values[i];
            else if (i == index - 1)
                temp[i] = n;
            else temp[i] = values[i - 1];
        }
        values = temp;
    }

    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        checkIndex(index, size);
        for (int i = index; i < size; i++)
            values[i] = values[i + 1];
        size--;
    }

    @Override
    public int get(int index) throws IndexOutOfBoundsException {
        checkIndex(index, size);
        return values[index];
    }

    @Override
    public int indexOf(int n) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == n) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return super.isEmpty();
    }

    @Override
    public int size() {
        return super.size;
    }

}

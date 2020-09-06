package GS222MH_assign4.binheap;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

class BinaryIntHeapTest {
    BinaryIntHeap BIH = new BinaryIntHeap();


    @Test
    void insert() {
        BIH.insert(10);
        assertEquals("[0, 10, 0, 0, 0, 0]", Arrays.toString(BIH.Heap));
        BIH.insert(8);
        BIH.insert(5);
        BIH.insert(1);
        assertEquals("[0, 10, 8, 5, 1, 0]", Arrays.toString(BIH.Heap));
    }

    @Test
    void pullHighest(){
        BIH.insert(10);
        assertEquals("[0, 10, 0, 0, 0, 0]", Arrays.toString(BIH.Heap));
        BIH.insert(8);
        BIH.insert(5);
        BIH.insert(1);
        assertEquals("[0, 10, 8, 5, 1, 0]", Arrays.toString(BIH.Heap));
        BIH.pullHighest();
        assertEquals("[0, 8, 1, 5, 0, 0]", Arrays.toString(BIH.Heap));
    }

    @Test
    void size() {
        BIH.insert(2);
        BIH.insert(4);
        assertEquals(2, BIH.size);
    }

    @Test
    void isEmpty() {
        assertTrue(BIH.isEmpty());
        BIH.insert(4);
        BIH.insert(3);
        assertFalse(BIH.isEmpty());
    }
}
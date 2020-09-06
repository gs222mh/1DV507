package GS222MH_assign3.EX6;

import org.junit.jupiter.api.Test;


import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class SortingAlgorithmsTest extends SortingAlgorithms {
    SortingAlgorithms sorting = new SortingAlgorithms();
    int[] test = {1, 5, 4, 6, 8, 2, 1, 3, 4, 7, 8, 10};
    int[] test1 = {1};
    int[] test2 = {};
    Comparator<String> sort = (s1, s2) -> Character.compare(s2.charAt(0), s1.charAt(0));
    //I do not change to lower case here
    String[] arrString = {"ZAZA", "Ali", "world", "xw", "ghayth"};
    String[] arrString1 = {"ZAZA", "ali"};
    String[] arrString2 = {"ZAZA"};
    String[] arrString3 = {};


    @Test
    void main() {
    }

    @Test
    void testInt() {
        assertEquals("[1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 8, 10]", Arrays.toString(insertionSort(test)));
        assertEquals("[1]", Arrays.toString(insertionSort(test1)));
        assertEquals("[]", Arrays.toString(insertionSort(test2)));
    }

    //I do not change to lower case here
    @Test
    void testString() {
        assertEquals("[Ali, ZAZA, ghayth, world, xw]", Arrays.toString(insertionSort(arrString, sort)));
        assertEquals("[ZAZA, ali]", Arrays.toString(insertionSort(arrString1, sort)));
        assertEquals("[ZAZA]", Arrays.toString(insertionSort(arrString2, sort)));
        assertEquals("[]", Arrays.toString(insertionSort(arrString3, sort)));
    }

    @Test
    void testIntMerge() {
        assertEquals("[1, 1, 2, 3, 4, 4, 5, 6, 7, 8, 8, 10]", Arrays.toString(mergeSort(test)));
        assertEquals("[1]", Arrays.toString(mergeSort(test1)));
        assertEquals("[]", Arrays.toString(mergeSort(test2)));
    }


    //I do not change to lower case here
    @Test
    void testStringMerge() {
        assertEquals("[Ali, ZAZA, ghayth, world, xw]", Arrays.toString(mergeSort(arrString, sort)));
        assertEquals("[ZAZA, ali]", Arrays.toString(mergeSort(arrString1, sort)));
        assertEquals("[ZAZA]", Arrays.toString(mergeSort(arrString2, sort)));
        assertEquals("[]", Arrays.toString(mergeSort(arrString3, sort)));
    }

}
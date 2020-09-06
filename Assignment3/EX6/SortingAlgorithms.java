package GS222MH_assign3.EX6;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAlgorithms {
    public static void main(String[] args) {
        //Random array
        int[] arr = {3, 5, 9, 3, 2, 1};
        insertionSort(arr);

        //Random array
        int[] arrMerge = {3, 5, 9, 3, 2, 1};
        mergeSort(arrMerge);

        //Array with lower upper.
        String[] arrString = {"ZAZA", "Ali", "world", "xw", "ghayth"};

        //Change all element to lowerCase and add to another array and send it to method.
        String[] arrLow = new String[arrString.length];
        for (int i = 0; i < arrString.length; i++) {
            String element = arrString[i];
            arrLow[i] = element.toLowerCase();
        }

        //Make Comparator which take two elements and compare the first letter
        Comparator<String> sort = (s1, s2) -> Character.compare(s2.charAt(0), s1.charAt(0));
        insertionSort(arrLow, sort);

        //Array with lower upper.
        String[] arrStringMerge = {"ZAZA", "Ali", "world", "xw", "ghayth"};

        //Change all element to lowerCase and add to another array and send it to method.
        String[] arrLowMerge = new String[arrString.length];
        for (int i = 0; i < arrStringMerge.length; i++) {
            String element = arrStringMerge[i];
            arrLowMerge[i] = element.toLowerCase();
        }
        mergeSort(arrLowMerge, sort);
    }

    //https://www.youtube.com/watch?v=lCDZ0IprFw4
    public static int[] insertionSort(int[] in) {
        int element;
        int elementBefore;
        int temp;
        for (int i = 1; i < in.length; i++) {
            element = in[i];
            elementBefore = i - 1;
            while (elementBefore >= 0 && element < in[elementBefore]) {
                temp = in[elementBefore];
                in[elementBefore] = in[elementBefore + 1];
                in[elementBefore + 1] = temp;
                elementBefore--;
            }
        }
        return in;
    }

    //Same as insertionSort above.
    public static String[] insertionSort(String[] in, Comparator<String> c) {
        String element;
        int elementBefore;
        String temp;
        for (int i = 1; i < in.length; i++) {
            element = in[i];
            elementBefore = i - 1;
            while (elementBefore >= 0 && c.compare(element, in[elementBefore]) > 0) {
                temp = in[elementBefore];
                in[elementBefore] = in[elementBefore + 1];
                in[elementBefore + 1] = temp;
                elementBefore--;
            }
        }
        return in;
    }

    // divide array to two halves, and repeate this method until in.length == 1
    //send all three arrays (left right and in) to another method to sort
    //I get help from the book "Introduction to java"
    public static int[] mergeSort(int[] in) {
        if (in.length > 1) {
            int leftSize = in.length / 2;
            int[] left = new int[leftSize];
            for (int i = 0; i < left.length; i++) {
                left[i] = in[i];
            }
            mergeSort(left);
            int rightSize = in.length - leftSize;
            int[] right = new int[rightSize];
            for (int i = 0; i < right.length; i++) {
                right[i] = in[leftSize];
                leftSize++;
            }
            mergeSort(right);
            merge(left, right, in);
            in = merge(left, right, in);
        }
        return in;
    }

    //Sorting method
    public static int[] merge(int[] left, int[] right, int[] list) {
        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;
        while (pos1 < left.length && pos2 < right.length) {
            if (left[pos1] < right[pos2]) {
                list[pos3] = left[pos1];
                pos3++;
                pos1++;
            } else {
                list[pos3] = right[pos2];
                pos3++;
                pos2++;
            }
        }
        while (pos1 < left.length) {
            list[pos3] = left[pos1];
            pos3++;
            pos1++;
        }
        while (pos2 < right.length) {
            list[pos3] = right[pos2];
            pos3++;
            pos2++;
        }
        return list;
    }

    public static String[] mergeSort(String[] in, Comparator<String> c) {
        if (in.length > 1) {
            int leftSize = in.length / 2;
            String[] left = new String[leftSize];
            for (int i = 0; i < left.length; i++) {
                left[i] = in[i];
            }
            mergeSort(left, c);
            int rightSize = in.length - leftSize;
            String[] right = new String[rightSize];
            for (int i = 0; i < right.length; i++) {
                right[i] = in[leftSize];
                leftSize++;
            }
            mergeSort(right, c);
            merge(left, right, in, c);
            in = merge(left, right, in, c);
        }
        return in;
    }

    public static String[] merge(String[] left, String[] right, String[] list, Comparator<String> c) {
        int pos1 = 0;
        int pos2 = 0;
        int pos3 = 0;
        while (pos1 < left.length && pos2 < right.length) {
            if (c.compare(left[pos1], right[pos2]) > 0) {
                list[pos3] = left[pos1];
                pos3++;
                pos1++;
            } else {
                list[pos3] = right[pos2];
                pos3++;
                pos2++;
            }
        }
        while (pos1 < left.length) {
            list[pos3] = left[pos1];
            pos3++;
            pos1++;
        }
        while (pos2 < right.length) {
            list[pos3] = right[pos2];
            pos3++;
            pos2++;
        }
        return list;
    }
}

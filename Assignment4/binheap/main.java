package GS222MH_assign4.binheap;


import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        BinaryIntHeap BIH = new BinaryIntHeap();
        BIH.insert(8);
        BIH.insert(19);
        BIH.insert(6);
        BIH.insert(10);
        BIH.insert(2);


        // I use this website http://btv.melezinek.cz/binary-heap.html to be sure that my answer is right.
        System.out.println("Heap: " + Arrays.toString(BIH.Heap) + " Size :" + BIH.size()); // size = insert + 1 (1 is the first pos which is empty)
        System.out.println("Empty: " + BIH.isEmpty());
        System.out.println("Pull: " + BIH.pullHighest());
        System.out.println(Arrays.toString(BIH.Heap));
        System.out.println("Pull: " + BIH.pullHighest());
        System.out.println(Arrays.toString(BIH.Heap));
        System.out.println("Pull: " + BIH.pullHighest());
        System.out.println(Arrays.toString(BIH.Heap));



    }
}

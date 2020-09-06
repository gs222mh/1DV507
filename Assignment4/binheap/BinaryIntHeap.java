package GS222MH_assign4.binheap;


public class BinaryIntHeap implements binheap {
    protected int size = 0;
    private int index = 0;
    private int current;
    public int[] Heap = new int[6];
    private int[] temp;



    @Override
    public void insert(int n) { // 8  19  20  25  2
        if (size < Heap.length - 1) {
            Heap[++size] = n; // [0, 8, 19, 20,  25, ...]
            current = size; // current = 1

            int parent = current / 2; // 1/2 = 0   1 + 1

            if (size >= 2) {
                while (Heap[current] > Heap[parent]) {  // 19 > 8
                    int tmp;
                    tmp = Heap[current];
                    Heap[current] = Heap[parent];
                    Heap[parent] = tmp;
                    current = parent;
                    parent = current / 2;
                    if (parent == 0) {
                        break;
                    }
                }
            }
        } else {
            resize();
            Heap[++size] = n;
            current = size;
            int parent = current / 2;
            while (Heap[current] > Heap[parent]) {  // 19 > 8
                int tmp;
                tmp = Heap[current];
                Heap[current] = Heap[parent];
                Heap[parent] = tmp;
                current = parent;
                parent = current / 2;
                if (parent == 0) {
                    break;
                }
            }
        }
        index++;
    }

    private void resize() {
        temp = new int[Heap.length + 1];
        for (int i = 0; i < Heap.length; i++) {
            temp[i] = Heap[i];
        }
        Heap = temp;
    }

    @Override
    public int pullHighest() {
        int loop = size / 2;
        int time = 0;
        if (index != 0) {
            int root = Heap[1];
            Heap[1] = Heap[size]; // [0, 8, 10, 6, 0, 0]  4
            Heap[size] = 0;
            size--;

            int currentIndex = 1;
            int parent = currentIndex / 2;
            while (time < loop) {
                int left = currentIndex * 2;
                int right = currentIndex * 2 + 1;
                // 2 / 2

                if (parent == 0)
                    parent = 1;
                if (Heap[left] > Heap[right]) {
                    int tmp;
                    tmp = Heap[left];
                    Heap[left] = Heap[parent];
                    Heap[parent] = tmp;
                    parent = left;
                    currentIndex = left;
                } else if (Heap[left] < Heap[right]) {
                    int tmp;
                    tmp = Heap[right];
                    Heap[right] = Heap[parent];
                    Heap[parent] = tmp;
                    parent = right;
                    currentIndex = right;
                }
                time++;
            }
            return root;
        } else {
            throw new NullPointerException("Empty Heap!");
        }
    }

    @Override
    public int size() {
        return size + 1;
    }

    @Override
    public boolean isEmpty() {
        if (index == 0)
            return true;
        else
            return false;
    }
}

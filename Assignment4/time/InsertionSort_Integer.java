package GS222MH_assign4.time;

import java.util.ArrayList;
import java.util.Random;

public class InsertionSort_Integer {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        Random rnd = new Random();
        int num;
        long start = System.nanoTime();
        long end;
        while (true) {
            num = rnd.nextInt((arrList.size() + 1) * 2);
            arrList.add(num);
            int element;
            int elementBefore;
            int temp;
                for (int i = 1; i < arrList.size(); i++) {
                    element = arrList.get(i);
                    elementBefore = i - 1;
                    while (elementBefore >= 0 && element < arrList.get(elementBefore)) {
                        temp = arrList.get(elementBefore); //num
                        arrList.remove(elementBefore);
                        arrList.add(elementBefore, arrList.get(elementBefore));
                        arrList.remove(elementBefore + 1);
                        arrList.add(elementBefore + 1, temp);
                        elementBefore--;
                    }
                }

            end = System.nanoTime();
            if ((end - start) >= 1000000000)
                break;
        }
        System.out.println(arrList.size());
    }
}

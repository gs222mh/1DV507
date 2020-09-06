package GS222MH_assign4.time;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class InsertionSort_String {
    public static void main(String[] args) {
        ArrayList<String> arrList = new ArrayList<String>();
        String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        String word = "";
        Comparator<String> sort = (s1, s2) -> Character.compare(s2.charAt(0), s1.charAt(0));
        int num;
        long start = System.nanoTime();
        long end;
        while (true) {
            for (int i = 0; i < 10; i++) {
                num = random.nextInt(26);
                word = word + CHAR_LOWER.charAt(num);
            }
            arrList.add(word);
            word = "";

            String element;
            int elementBefore;
            String temp;
            for (int i = 1; i < arrList.size(); i++) {
                element = arrList.get(i);
                elementBefore = i - 1;
                while (elementBefore >= 0 && sort.compare(element, arrList.get(elementBefore)) > 0) {
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


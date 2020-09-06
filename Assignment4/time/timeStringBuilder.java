package GS222MH_assign4.time;

public class timeStringBuilder {
    public static void main(String[] args) {
        String oneChar = "o";
        String eightyChar = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        //>>>>>>>>>>>>>> add one char to StringBuilder <<<<<<<<<<<<<<<<<

        StringBuilder one = new StringBuilder();
        long start = System.nanoTime();
        long end;
        while (true) {
            one.append(oneChar);
            end = System.nanoTime();
            if ((end - start) >= 1000000000)
                break;
        }
        System.out.println("Total (add one char by StringBuilder): " + one.length());


        //>>>>>>>>>>>>>> add 80 char to StringBuilder <<<<<<<<<<<<<<<<<
        StringBuilder eighty = new StringBuilder();
        long startEighty = System.nanoTime();
        long endEghity;
        while (true) {
            eighty.append(eightyChar);
            endEghity = System.nanoTime();
            if ((endEghity - startEighty) >= 1000000000)
                break;
        }
        System.out.println("Total (add 80 char by StringBuilder): " + eighty.length());
















/*
        StringBuilder sb1 = new StringBuilder();
        long start1 = System.currentTimeMillis();
        long end1;
        while (true) {
            sb1.append(oneChar);
            end1 = System.currentTimeMillis();
            if ((end1-start1) >= 1000)
                break;
        }
        System.out.println(sb1.length());
 */

    }
}

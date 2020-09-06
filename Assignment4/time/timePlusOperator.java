package GS222MH_assign4.time;

public class timePlusOperator {
    public static void main(String[] args) {
        String oneChar = "o";
        String eightyChar = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        String emptyOne = "";
        String emptyEighty = "";


        //>>>>>>>>>>>>>> add one char by plus operator <<<<<<<<<<<<<<<<<

        long startPlus = System.nanoTime();
        long endPlus;
        while (true) {
            emptyOne = emptyOne + oneChar;
            endPlus = System.nanoTime();
            if ((endPlus - startPlus) >= 1000000000)
                break;
        }
        System.out.println("Total (add one char by plus operator): " + emptyOne.length());


        //>>>>>>>>>>>>>> add 80 char by plus operator <<<<<<<<<<<<<<<<<

        long startPlus80 = System.nanoTime();
        long endPlus80;
        while (true) {
            emptyEighty = emptyEighty + eightyChar;
            endPlus80 = System.nanoTime();
            if ((endPlus80 - startPlus80) >= 1000000000)
                break;
        }
        System.out.println("Total (add 80 char by plus operator): " +emptyEighty.length());



    }
}

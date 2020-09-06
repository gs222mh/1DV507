package GS222MH_assign4.count_words;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        HashWordSet test = new HashWordSet();
        Word w1 = new Word("Hello");
        Word w2 = new Word("Ghayth");
        Word w3 = new Word("Gayhth");
        Word w4 = new Word("Hlleo");
        Word w5 = new Word("Hlleo");

        test.add(w1);
        test.add(w2);
        test.add(w3);
        test.add(w4);
/*
        System.out.println(Arrays.toString(test.buckets));

 */
    }
}

package GS222MH_assign4.count_words;

import com.sun.javafx.scene.control.behavior.TwoLevelFocusBehavior;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCount2Main {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            File file = new File("/home/ghayth/Desktop/word.txt");
            Scanner text = new Scanner(file);
            ArrayList<String> arr = new ArrayList<>();


            //add all rows to arrayList
            while (text.hasNextLine()) {
                String word = text.nextLine();
                arr.add(word);
            }
            //make space between words and put all elements in array
            String[] total = arr.toString().split(" ");

            HashWordSet HSW = new HashWordSet();
            TreeWordSet TWS = new TreeWordSet();


            //go throw each element and add to set
            for (String word : total) {
                if (!word.isEmpty()) {

                    // for each word Create an object of the class Word
                    Word wordClass = new Word(word);

                    //// for each word add to hashSet
                    HSW.add(wordClass);

                    //// for each word add to treeSet
                    TWS.add(wordClass);
                }
            }

            System.out.println("Totla words (arrayList): " + total.length);
            System.out.println("HashSet size:  " + HSW.size());
            System.out.println("TreeSet size: " + TWS.size());


            System.out.println(HSW.toString());
            System.out.println(TWS.toString());
            text.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

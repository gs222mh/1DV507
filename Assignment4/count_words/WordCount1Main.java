package GS222MH_assign4.count_words;

import GS222MH_assign4.count_words.Word;
import com.sun.source.tree.Tree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCount1Main {
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

            Set<Word> hashSet = new HashSet<>();
            Set<Word> treeSet = new TreeSet<>();

            //go throw each element and add to set
            for (String word : total) {
                if (!word.isEmpty()) {

                    // for each word Create an object of the class Word
                    Word wordClass = new Word(word);

                    //// for each word add to hashSet
                    hashSet.add(wordClass);

                    //// for each word add to treeSet
                    treeSet.add(wordClass);
                }
            }

            System.out.println("Totla words (arrayList): " + total.length);
            System.out.println(hashSet.size());
            System.out.println(treeSet.size());
            System.out.println(treeSet.toString());
            text.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

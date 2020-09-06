package GS222MH_assign2.EX3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class WarAndPeace {
    public static void main(String[] args) throws FileNotFoundException {
        String text = readText("/home/ghayth/Desktop/testtest.txt");   // My own method
        String[] words = text.split(" ");  // Simple split, will be cleaned up later on
        System.out.println("Initial word count: " + words.length);   // We found 577091


        Stream<String> stream = Arrays.stream(words);

        //Get all words in lowerCase
        //Replace all letter that does not from (a to z) or (A to Z) to no thing (empty space
        //get the uniq words and count them
        long uniqWords = stream
                .map(String::toLowerCase)
                .map(w -> w.replaceAll("[^a-zA-Z'-]", ""))
                .distinct().count();
        System.out.println(uniqWords);

        /*
        .map(e -> e.replace("#", " "))
                .map(e -> e.replace("+", " "))
                .map(e -> e.replace("0", " "))
                .map(e -> e.replace("1", " "))
                .map(e -> e.replace("2", " "))
                .map(e -> e.replace("3", " "))
                .map(e -> e.replace("4", " "))
                .map(e -> e.replace("5", " "))
                .map(e -> e.replace("6", " "))
                .map(e -> e.replace("7", " "))
                .map(e -> e.replace("8", " "))
                .map(e -> e.replace("9", " "))
                .map(e -> e.replace("?", " "))
                .map(e -> e.replace("(", " "))
                .map(e -> e.replace(")", " "))
                .map(e -> e.replace("*", " "))
                .map(e -> e.replace(".", " "))
                .map(e -> e.replace("!", " "))
                .map(e -> e.replace("%", " "))
                .map(e -> e.replace("&", " "))
                .map(e -> e.replace("\\",  " "))
                .map(e -> e.replace("/", " "))
                .map(e -> e.replace("_", " "))
                .map(e -> e.replace("=", " "))
                .map(e -> e.replace("}", " "))
                .map(e -> e.replace("{", " "))
                .map(e -> e.replace("[", " "))
                .map(e -> e.replace("]", " "))
                .map(e -> e.replace(":", " "))
                .map(e -> e.replace(";", " "))
                .map(e -> e.replace("^", " "))

         */
    }

    private static String readText(String s) throws FileNotFoundException {
        ArrayList<String> arr = new ArrayList<String>();
        File file = new File(s);
        Scanner text = new Scanner(file);
        while (text.hasNextLine()) {
            String word = text.nextLine();
            arr.add(word);
        }
        text.close();
        return String.valueOf(arr);
    }
}


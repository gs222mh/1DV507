package GS222MH_assign4.count_words;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class IdentyfyWordsMain {
    public static void main(String[] args) throws FileNotFoundException {

        //The path of the file
        File file = new File("/home/ghayth/Desktop/vm.txt");
        Scanner text = new Scanner(file);

        //The path of the file which is to print in
        File outFile = new File("/home/ghayth/Desktop/word.txt");
        PrintWriter printer = new PrintWriter(outFile);

        //Go throw each row and line
        while (text.hasNextLine()) {

            //take the first row
            String row = text.nextLine();

            //delete all char that is not from A to Z or a - z
            if(!row.isEmpty()) {
                String onlyChar = row.replaceAll("[^A-Za-z-\\s]", "");
                String end = onlyChar.replaceAll("-", " ");
                printer.print(end);
                printer.print("\n");
            }
        }
        System.out.println("Done!");
        printer.close();
        text.close();
    }
}


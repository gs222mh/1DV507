package GS222MH_assign3.EX2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PrintJavaMain {
    public static void main(String[] args) throws FileNotFoundException {

        //Get the path of the directer and send it to printAllJavaFiles.
        File javaFile = new File("/home/ghayth/IdeaProjects/1DV507/");
        printAllJavaFiles(javaFile);
    }

    private static void printAllJavaFiles(File javaFile) throws FileNotFoundException {

        //If the file is Directory get all files in the Directory and put them in an array
        if (javaFile.isDirectory()) {
            File[] subs = javaFile.listFiles();

            //For each element in the array ask if it is file ot Directory, If it is Directory send it again to printAllJavaFiles
            for (File f : subs) {
                if (f.isDirectory()) {
                    printAllJavaFiles(f);
                } else if (f.isFile()) {

                    //If it is a file get the file just .java
                    if (f.getName().endsWith(".java")) {
                        Scanner text = new Scanner(f);
                        int row = 0;
                        while (text.hasNextLine()) {
                            text.nextLine();
                            row++;
                        }
                        System.out.println(f.getName() + " " + row + " rows");
                    }
                }
            }
        }
    }
}



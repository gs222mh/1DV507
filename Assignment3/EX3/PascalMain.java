package GS222MH_assign3.EX3;

import java.util.Arrays;
import java.util.Scanner;

public class PascalMain {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Write which line would you like to print!");
        int line = input.nextInt();

        pascalRow(line);
        System.out.println(Arrays.toString(pascalRow(line)));
    }

    public static int[] pascalRow(int n) {
        int[] lineZero = {1};
        int[] lineOne = {1, 1};
        int[] line = new int[n + 1];
        int[] arr;

        if (n == 0) {
            return lineZero;
        } else if (n == 1) {
            return lineOne;
        } else {
            //First element is equal to 1
            line[0] = 1;
            //last element is equal to 1
            line[n] = 1;

            //set arr equal to the row before.
            arr = pascalRow(n - 1);

            //add all element as the previous one plus the element before.
            for (int i = n - 1; i > 0; i--) {
                line[i] = arr[i] + arr[i - 1];
            }
        }
        return line;
    }
}


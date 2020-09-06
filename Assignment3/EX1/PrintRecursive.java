package GS222MH_assign3.EX1;

public class PrintRecursive {
    public static void main(String[] args) {
        String str = "Hello Everyone!";

        print(str, 0);
        System.out.println(); // Line break
        printReverse(str, 0);
    }

    private static void printReverse(String str, int i) {
        if (i == 0) {
            i++;
        }
        if (i <= str.length()) {
            System.out.print(str.charAt(str.length() - i));
            printReverse(str, i + 1);
        }
    }

    private static void print(String str, int i) {
        if (i <= str.length() - 1) {
            System.out.print(str.charAt(i));
            print(str, i + 1);
        }
    }
}

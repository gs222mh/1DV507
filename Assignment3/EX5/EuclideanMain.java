package GS222MH_assign3.EX5;

import java.util.Scanner;

public class EuclideanMain {
    public static void main(String[] args) {

        //Scanner to input numbers and then send the numbers to the method GCD
        Scanner input = new Scanner(System.in);
        System.out.println("Write the first num");
        int num1 = input.nextInt();
        System.out.println("Write the second num");
        int num2 = input.nextInt();
        GCD(num1, num2);
        System.out.println(GCD(num1, num2));
    }

    //I understand Euclid's Algorithm and I wrote an example below.
    //For this exercise I get little help from https://www.baeldung.com/java-greatest-common-divisor
    public static int GCD(int num1, int num2) {
        if (num2 == 0) return num1;

        //in this case we return num2 as num1, and we set num2 as mod of (num1 % num2)
        //see the example below
        else return GCD(num2, num1 % num2);
    }
}


/*
num1 = 210
num2 = 45

num1 / num2 >>> 210 / 45 = 4*45 + 30
div 45 by 30 >>>> 45 / 30 = 1*30 + 15
div 30 by 15 >>>> 30 / 15 = 2*15 + 0

GCD = 15
*/
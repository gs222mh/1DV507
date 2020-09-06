package GS222MH_assign1.Ferry1;

import java.util.Arrays;

public class FerryMain {
    public static void main(String[] args) {


        MyFerry my = new MyFerry();
        //money = 100
        Passenger p = new Passenger(150);
        Passenger n = new Passenger(6);

        //Test if 17 bicycles is equal to 3 cars.
        //money = 680
        Bicycle bi = new Bicycle("3234", 1);
        Bicycle bi1 = new Bicycle("dsa", 1);
        Bicycle bi2 = new Bicycle("ewr", 1);
        Bicycle bi3 = new Bicycle("few", 1);
        Bicycle bi4 = new Bicycle("323qwe4", 1);
        Bicycle bi5 = new Bicycle("32tr34", 1);
        Bicycle bi6 = new Bicycle("qwe", 1);
        Bicycle bi7 = new Bicycle("gre", 1);
        Bicycle bi8 = new Bicycle("323qw4", 1);
        Bicycle bi9 = new Bicycle("32d3qw4", 1);
        Bicycle bi10 = new Bicycle("3223qw4", 1);
        Bicycle bi11 = new Bicycle("32w3qw4", 1);
        Bicycle bi12 = new Bicycle("32g3qw4", 1);
        Bicycle bi13 = new Bicycle("3213qw4", 1);
        Bicycle bi14 = new Bicycle("32e3qw4", 1);
        Bicycle bi15 = new Bicycle("323vqw4", 1);
        Bicycle bi16 = new Bicycle("323qsw4", 1);

        //money = 340
        Car c1 = new Car("ABC123", 4);
        Car c2 = new Car("ABC223", 3);

        //money = 700
        Bus b1 = new Bus("POI123", 10);
        Bus b2 = new Bus("POI122", 10);

        //money = 320
        Lorry l = new Lorry("qwe123", 1);

        my.embark(p);

        my.embark(bi);
        my.embark(bi1);
        my.embark(bi2);
        my.embark(bi3);
        my.embark(bi4);
        my.embark(bi5);
        my.embark(bi6);
        my.embark(bi7);
        my.embark(bi8);
        my.embark(bi9);
        my.embark(bi10);
        my.embark(bi11);
        my.embark(bi12);
        my.embark(bi13);
        my.embark(bi14);
        my.embark(bi15);
        my.embark(bi16);

        my.embark(c1);
        my.embark(c2);

        my.embark(b1);
        my.embark(b2);

        my.embark(l);


        System.out.println(my.toString());
        my.disembark();
        System.out.println(my.toString());

    




    }
}

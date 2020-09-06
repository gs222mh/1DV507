package GS222MH_assign1.Ferry1;

import java.util.ArrayList;

public class MyFerry implements Ferry {

    protected int numOfPass = 0;
    protected int vehicleNum = 0;
    private int maxPassenger = 200;
    private int numOfBic = 0;

    private int car = 0;
    private int bus = 0;
    private int lorry = 0;
    private int bic = 0;

    //ArrayList to save all vehicle's register number.
    protected ArrayList<String> regNum = new ArrayList<>();

    //Arraylist to save all info from Vehicle (then change it to array Vehicle[]).
    protected ArrayList<Vehicle> vehi = new ArrayList<>();
    private int money = 0;
    final String ANSI_RED = "\u001B[31m";
    final String RESET = "\033[0m";  // Text Reset

    @Override
    public int countPassengers() {
        return numOfPass;
    }

    @Override
    public int countVehicleSpace() {
        return vehicleNum;
    }

    @Override
    public int countMoney() {
        return money;
    }


    //put all elements from arrayList vehi to the array Vehicle[].
    @Override
    public Vehicle[] getAllVehicles() {
        int arrayForVeh = regNum.size();
        Vehicle[] allVehicles = new Vehicle[arrayForVeh];

        for (int i = 0; i < arrayForVeh; i++) {
            allVehicles[i] = vehi.get(i);
        }
        return allVehicles;
    }

    @Override
    public void embark(Vehicle v) {
        /*get the number of passenger from each class.
        For example, we send 4 passenger to the class car.
        So we get this number 4 from the car (Car class extends from Vehicle).
         */
        int passFromVeh = v.noOfPassengers();

        //Be more specific which type of vehicle.
        if (v instanceof Car) {

            //check if register number has been used before.
            if (regNum.contains(((Car) v).getRegNum())) {
                System.out.println(ANSI_RED + "Error this RegNum " + ((Car) v).getRegNum() + " used before" + RESET);

                /*as know there is 40 places. The care take 1 place
                so if countVehicleSpace bigger than 39 (thats mean is equle to 40 (empty)).
                 */
            } else if (countVehicleSpace() > 39) {
                System.out.println(ANSI_RED + "No empty place for this car " + ((Car) v).getRegNum() + RESET);

                //check if we can add the number of passenger
            } else if (passFromVeh > maxPassenger) {
                System.out.println(ANSI_RED + "No empty place for more passenger in this car " + ((Car) v).getRegNum() + RESET);
            } else {
                int passengers = v.noOfPassengers();
                maxPassenger -= passengers;
                regNum.add(((Car) v).getRegNum());
                vehicleNum++;
                car++;
                numOfPass = numOfPass + v.noOfPassengers();
                money += 100 + (20 * ((Car) v).getNum());
                vehi.add(v);
            }
        }

        if (v instanceof Bus) {
            if (regNum.contains(((Bus) v).getRegNum())) {
                System.out.println(ANSI_RED + "Error this RegNum " + ((Bus) v).getRegNum() + " used before" + RESET);

                /*as know there is 40 places. The bus take 4 place
                so if countVehicleSpace bigger than 38 (thats mean is equle to 39 (can not embark)).
                 */
            } else if (countVehicleSpace() > 36) {
                System.out.println(ANSI_RED + "No empty place for this Bus " + ((Bus) v).getRegNum() + RESET);
            } else if (passFromVeh > maxPassenger) {
                System.out.println(ANSI_RED + "No empty place for more passenger in this Bus " + ((Bus) v).getRegNum() + RESET);
            } else {
                int passengers = v.noOfPassengers();
                maxPassenger -= passengers;
                regNum.add(((Bus) v).getRegNum());
                vehicleNum = vehicleNum + 4;
                bus++;
                numOfPass = numOfPass + v.noOfPassengers();
                money += 200 + (15 * ((Bus) v).getNum());
                vehi.add(v);
            }
        }

        if (v instanceof Lorry) {
            if (regNum.contains(((Lorry) v).getRegNum())) {
                System.out.println(ANSI_RED + "Error this RegNum " + ((Lorry) v).getRegNum() + " used before" + RESET);

                /*as know there is 40 places. The lorry take 8 place
                so if countVehicleSpace bigger than 32 (thats mean is equle to 33 (can not embark)).
                 */
            } else if (countVehicleSpace() > 32) {
                System.out.println(ANSI_RED + "No empty place for this lorry " + ((Lorry) v).getRegNum() + RESET);
            } else if (passFromVeh > maxPassenger) {
                System.out.println(ANSI_RED + "No empty place for more passenger in this lorry " + ((Lorry) v).getRegNum() + RESET);
            } else {
                int passengers = v.noOfPassengers();
                maxPassenger -= passengers;
                regNum.add(((Lorry) v).getRegNum());
                vehicleNum = vehicleNum + 8;
                lorry++;
                numOfPass = numOfPass + v.noOfPassengers();
                money += 300 + (20 * ((Lorry) v).getNum());
                vehi.add(v);
            }
        }

        if (v instanceof Bicycle) {
            if (regNum.contains(((Bicycle) v).getRegNum())) {
                System.out.println(ANSI_RED + "Error this RegNum " + ((Bicycle) v).getRegNum() + " used before" + RESET);
            } else if (countVehicleSpace() > 39) {
                System.out.println(ANSI_RED + "No empty place for this bicycle " + ((Bicycle) v).getRegNum() + RESET);
            } else if (passFromVeh > maxPassenger) {
                System.out.println(ANSI_RED + "No empty place for more passenger in this bicycle " + ((Bicycle) v).getRegNum() + RESET);
            } else {
                maxPassenger--;
                regNum.add(((Bicycle) v).getRegNum());
                numOfBic++;

                //every 8 bicycles are equal to 1 car or 1 place.
                int num = numOfBic / 5;
                if (num == 1) {
                    vehicleNum++;
                    numOfBic = 0;
                }
                numOfPass = numOfPass + v.noOfPassengers();
                money += 40;
                vehi.add(v);
                bic++;
            }
        }
    }

    @Override
    public void embark(Passenger p) {
        int numbPass = p.getPassenger();
        if (hasRoomFor(p)) {
            numOfPass = numOfPass + p.getPassenger();
            money += 25 * numbPass;
        } else {
            System.out.println(ANSI_RED + "No Empty place to embark passenger." + RESET);
        }
    }

    @Override
    public void disembark() {
        maxPassenger = 200;
        numOfPass = 0;
        vehicleNum = 0;
        car = 0;
        bus = 0;
        lorry = 0;
        bic = 0;
        regNum.clear();
        money = 0;
    }

    @Override
    public boolean hasSpaceFor(Vehicle v) {
        if (v instanceof Car) {
            if (countVehicleSpace() < 40) {
                return true;
            }
        }
        if (v instanceof Bus) {
            if (countVehicleSpace() < 37) {
                return true;
            }
        }
        if (v instanceof Lorry) {
            if (countVehicleSpace() < 33) {
                return true;
            }
        }
        if (v instanceof Bicycle) {
            if (countVehicleSpace() < 40) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hasRoomFor(Passenger p) {
        if ((p.getPassenger() + numOfPass) <= 200) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return ">>>>>MyFerry<<<<< \n" +
                "NumOfPass: " + numOfPass + " ( " + numOfPass + "*" + 25 + "=" + numOfPass * 25 + " ) " + "\n" +
                "VehicleNum: " + vehicleNum + "\n" +
                "Car: " + car + " ( " + car + "*" + 100 + "=" + car * 100 + " ) " + "(Pass 20)" + "\n" +
                "Bus: " + bus + " ( " + bus + "*" + 200 + "=" + bus * 200 + " ) " + "(Pass 15)" + "\n" +
                "Lorry: " + lorry + " ( " + lorry + "*" + 300 + "=" + lorry * 300 + " ) " + "(Pass 20)" + "\n" +
                "Bic: " + bic + " ( " + bic + "*" + 40 + "=" + bic * 40 + " ) " + "(Pass included)" + "\n" +
                "Money: " + money;
    }
}

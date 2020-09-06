package GS222MH_assign1.Ferry1;

public abstract class Vehicle {
    protected String ID;

    public Vehicle(){}

    public Vehicle(String id){
        this.ID = id;
    }
    protected abstract int noOfPassengers();
}

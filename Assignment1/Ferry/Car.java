package GS222MH_assign1.Ferry1;

public class Car extends Vehicle {
    private int num;
    private String regNum;

    public Car(String regNum, int passenger) {
        setRegNum(regNum);
        setNum(passenger);
    }

    public void setNum(int num) {
        if (num > 0 && num <= 4) {
            this.num = num;
        }
        else{
            System.out.println("Max 4 passenger in each car");
        }
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public int getNum() {
        return num;
    }

    public String getRegNum() {
        return regNum;
    }

    @Override
    public int noOfPassengers() {
        return num;
    }
}

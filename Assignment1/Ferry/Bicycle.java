package GS222MH_assign1.Ferry1;

public class Bicycle extends Vehicle {
    private int num;
    private String regNum;

    public Bicycle(String ID, int num) {
        setRegNum(ID);
        setNum(num);
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getRegNum() {
        return regNum;
    }

    public void setNum(int num) {
        if (num == 1) {
            this.num = num;
        } else {
            System.out.println("One passenger in each Bicycle");
        }
    }

    public int getNum() {
        return num;
    }

    @Override
    public int noOfPassengers() {
        return num;
    }
}

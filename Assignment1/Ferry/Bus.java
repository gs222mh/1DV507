package GS222MH_assign1.Ferry1;

public class Bus extends Vehicle {
    private int num;
    private String regNum;

    public Bus(String regNum, int num){
        setNum(num);
        setRegNum(regNum);
    }
    public void setNum(int num) {
        if (num > 0 && num <= 20) {
            this.num = num;
        }
        else{
            System.out.println("Max 20 passenger in each Bus");
        }
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    public String getRegNum() {
        return regNum;
    }

    public int getNum() {
        return num;
    }

    @Override
    public int noOfPassengers() {
        return num;
    }
}

package GS222MH_assign1.Ferry1;

public class Lorry extends Vehicle {
    private int num;
    private String regNum;

    public Lorry(String regNum, int num){
        setNum(num);
        setRegNum(regNum);
    }
    public void setNum(int num) {
        if (num > 0 && num <= 2) {
            this.num = num;
        }
        else{
            System.out.println("Max 2 passenger in each lorry");
        }
    }

    public String getRegNum() {
        return regNum;
    }

    public int getNum() {
        return num;
    }

    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    @Override
    public int noOfPassengers() {
        return num;
    }
}

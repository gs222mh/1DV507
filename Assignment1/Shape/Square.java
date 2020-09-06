package GS222MH_assign1.Shape;

public class Square extends Rectangle{
    private int side;

    public Square(String shapeName, int side) {
        super(shapeName);
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}

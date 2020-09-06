package GS222MH_assign1.Shape;

public class Rectangle extends Shape {
    private int base;
    private int heigh;

    //the name from superClass
    public Rectangle(String shapeName) {
        super(shapeName);
    }

    //the base and height from mainClass
    public Rectangle(String shapeName, int base, int heigh) {
        super(shapeName);
        this.base = base;
        this.heigh = heigh;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getBase() {
        return base;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public int getHeigh() {
        return heigh;
    }

    @Override
    public double getArea() {
        return base * heigh;
    }

    @Override
    public double getPerimeter() {
        return (base + heigh) * 2;
    }
}

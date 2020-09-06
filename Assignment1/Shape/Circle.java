package GS222MH_assign1.Shape;

public class Circle extends Shape {
    private double radius;

    //get the radius from the mainClass
    public Circle(String shapeName, double radius) {
        super(shapeName);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

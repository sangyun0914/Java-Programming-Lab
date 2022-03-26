package Homework3;

public class Circle extends TwoDimensionalShape {
    private static final String CLASS_NAME = "Circle";

    public Circle(String name, double radius) {
        super(name, radius, 2 * radius);
    }

    public String toString() {
        return (this.getName() + " is a " + this.getClassName()
                + ", " + super.getClassName());
    }

    public String getClassName() {
        return CLASS_NAME;
    }

    public double getRadius() {
        return super.getDimension1();
    }

    public void setRadius(double d1) {
        super.setDimension1(d1);
        super.setDimension2(2 * d1);
    }

    public double getArea() {
        return (Math.PI * this.getRadius() * this.getRadius());
    }
}

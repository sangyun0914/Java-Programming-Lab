package Homework3;

public class Rectangle extends TwoDimensionalShape {
    private static final String CLASS_NAME = "Rectangle";

    public Rectangle(String name, double width, double height) {
        super(name, width, height);
    }

    public String toString() {
        return (this.getName() + " is a " + this.getClassName()
                + ", " + super.getClassName());
    }

    public String getClassName() {
        return CLASS_NAME;
    }

    public double getWidth() {
        return super.getDimension1();
    }

    public void setWidth(double d1) {
        super.setDimension1(d1);
    }

    public double getHeight() {
        return super.getDimension2();
    }

    public void setHeight(double d2) {
        super.setDimension2(d2);
    }

    public double getArea() {
        return (this.getWidth() * this.getHeight());
    }

}

package Homework3;

public class TwoDimensionalShape extends Shape {
    private static final String CLASS_NAME = "2D Shape";
    private double dimension1;
    private double dimension2;

    public TwoDimensionalShape(String name, double d1, double d2) {
        super(name);
        this.dimension1 = d1;
        this.dimension2 = d2;
    }

    public String getClassName() {
        return CLASS_NAME;
    }

    public double getDimension1() {
        return this.dimension1;
    }

    public void setDimension1(double d1) {
        this.dimension1 = d1;
    }

    public double getDimension2() {
        return this.dimension2;
    }

    public void setDimension2(double d2) {
        this.dimension2 = d2;
    }

    public double getArea() {
        return 0;
    }
}

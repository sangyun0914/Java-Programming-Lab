package Homework3;

public class ThreeDimensionalShape extends Shape {
    private static final String CLASS_NAME = "3D Shape";
    private double dimension1;
    private double dimension2;
    private double dimension3;

    public ThreeDimensionalShape(String name, double d1, double d2, double d3) {
        super(name);
        this.dimension1 = d1;
        this.dimension2 = d2;
        this.dimension3 = d3;
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

    public double getDimension3() {
        return this.dimension3;
    }

    public void setDimension3(double d3) {
        this.dimension3 = d3;
    }

    public double getVolume() {
        return 0;
    }

}

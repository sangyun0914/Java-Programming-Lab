package Homework3;

public class RectangularPrism extends ThreeDimensionalShape {
    private static final String CLASS_NAME = "Rectangular prism";

    public RectangularPrism(String name, double l, double w, double h) {
        super(name, l, w, h);
    }

    public String toString() {
        return (this.getName() + " is a " + this.getClassName()
                + ", " + super.getClassName());
    }

    public String getClassName() {
        return CLASS_NAME;
    }

    public double getLength() {
        return super.getDimension1();
    }

    public void setLength(double d1) {
        super.setDimension1(d1);
    }

    public double getWidth() {
        return super.getDimension2();
    }

    public void setWidth(double d2) {
        super.setDimension2(d2);
    }

    public double getHeight() {
        return super.getDimension3();
    }

    public void setHeight(double d3) {
        super.setDimension3(d3);
    }

    public double getVolume() {
        return (this.getLength() * this.getWidth() * this.getHeight());
    }
}

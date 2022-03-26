package Homework3;

public class Cone extends ThreeDimensionalShape {
    private static final String CLASS_NAME = "Cone";

    public Cone(String name, double r, double h) {
        super(name, r, h, 0);
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
    }

    public double getHeight() {
        return super.getDimension2();
    }

    public void setHeight(double d2) {
        super.setDimension2(d2);
    }

    public double getVolume() {
        return ((1.0 / 3.0) * Math.PI * Math.pow(getRadius(), 2) * getHeight());
    }
}

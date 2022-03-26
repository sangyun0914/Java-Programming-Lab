package Homework3;

public class Cube extends ThreeDimensionalShape {
    private static final String CLASS_NAME = "Cube";

    public Cube(String name, double side) {
        super(name, side, 0, 0);
    }

    public String toString() {
        return (this.getName() + " is a " + this.getClassName()
                + ", " + super.getClassName());
    }

    public String getClassName() {
        return CLASS_NAME;
    }

    public double getSide() {
        return super.getDimension1();
    }

    public void setSide(double d1) {
        super.setDimension1(d1);
    }

    public double getVolume() {
        return (Math.pow(this.getSide(), 3));
    }

}

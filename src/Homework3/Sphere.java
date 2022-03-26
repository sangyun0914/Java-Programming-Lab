package Homework3;

public class Sphere extends ThreeDimensionalShape {
    private static final String CLASS_NAME = "Sphere";

    public Sphere(String name, double radius) {
        super(name, radius, 0, 0);
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

    public double getVolume() {
        return ((4.0 / 3.0) * Math.PI * Math.pow(this.getRadius(), 3));
    }
}

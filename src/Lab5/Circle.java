package Lab5;

public class Circle extends TwoDimensionalShape {
    private static final String CLASS_NAME = "Circle";

    public Circle(String name, double radius) {
        super(name, radius, 2 * radius);
    }

    public String toString() {
        return (this.getName() + " is a [" + this.getClassName()
                + "], and is a [" + super.getClassName() + "]");
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

    public double getDiameter() {
        return super.getDimension2();
    }

    public void setDiameter(double d2) {
        super.setDimension2(d2);
        super.setDimension1(d2 / 2);
    }

    public double getArea() {
        return (Math.PI * super.getDimension1() * super.getDimension1());
    }
}

package Lab5;

public class Rectangle extends TwoDimensionalShape {
    private static final String CLASS_NAME = "Rectangle";

    public Rectangle(String name, double width, double height) {
        super(name, width, height);
    }

    public String toString() {
        return (this.getName() + " is a [" + this.getClassName()
                + "], and is a [" + super.getClassName() + "]");
    }

    public String getClassName() {
        return CLASS_NAME;
    }

    public double getWidth() {
        return super.getDimension1();
    }

    public double getHeight() {
        return super.getDimension2();
    }

    public void setSize(double w, double h) {
        super.setDimension1(w);
        super.setDimension2(h);
    }

    public double getArea() {
        return (this.getWidth() * this.getHeight());
    }

}

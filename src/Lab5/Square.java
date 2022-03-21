package Lab5;

public class Square extends Rectangle {
    private static final String CLASS_NAME = "Square";

    public Square(String name, double side) {
        super(name, side, side);
    }

    public String toString() {
        return (this.getName() + " is a [" + this.getClassName()
                + "], and is a [" + super.getClassName() + "]");
    }

    public String getClassName() {
        return CLASS_NAME;
    }

    public double getSide() {
        return super.getDimension1();
    }

    public void setSide(double d1) {
        super.setDimension1(d1);
        super.setDimension2(d1);
    }

}
